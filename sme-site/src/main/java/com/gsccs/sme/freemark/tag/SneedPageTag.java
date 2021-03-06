package com.gsccs.sme.freemark.tag;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import com.gsccs.sme.api.domain.Sneed;
import com.gsccs.sme.api.exception.ApiException;
import com.gsccs.sme.api.service.SclassServiceI;
import com.gsccs.sme.api.service.SneedServiceI;

import freemarker.core.Environment;
import freemarker.ext.beans.ArrayModel;
import freemarker.ext.beans.BeanModel;
import freemarker.ext.beans.BeansWrapper;
import freemarker.template.TemplateDirectiveBody;
import freemarker.template.TemplateDirectiveModel;
import freemarker.template.TemplateException;
import freemarker.template.TemplateModel;

/**
 * 
 * Title: SneedPageTag.java
 * 
 * Description: 服务需求分页标签
 * 
 * 参数 classid分类编码:"0":所有; 参数 subclassid子分类编码:"0":所有; 参数 city地域 空字符串:所有;
 * 参数keyword关键字;
 * 
 * 返回值 sneedlist 服务项对象 index 索引
 * 
 * 使用示例
 * 
 * <@sme_sneed_page classid="${site.id}" id="${currChannel.id}" num="6"
 * page="${page}" pagenum="${pagenum!0}" titleLen="48" dateFormat="yyyy-MM-dd";
 * infoList,pager> <#list sneedList as sneed> </#list> </@sme_sneed_page>
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
@Component("sneedPageTag")
public class SneedPageTag extends BaseDirective implements
		TemplateDirectiveModel {

	@Resource
	private SclassServiceI sclassAPI;
	@Resource
	private SneedServiceI sneedAPI;

	public void execute(Environment env, Map params, TemplateModel[] loopVars,
			TemplateDirectiveBody body) {
		// 分类
		Long scode = getParamLong(params, "scode",0);
		// 子分类
		Long subscode = getParamLong(params, "subscode",0);
		// 地域
		String areacode = getParam(params, "areacode");
		// 关键字
		String keyword = getParam(params, "keyword");
		// 显示数量
		int num = getParamInt(params, "num", 10);
		// 排序
		String order = getParam(params, "order", "1");
		// 当前第几页
		int page = getParamInt(params, "page", 1);
		// 最多显示页数
		int pagenum = getParamInt(params, "pagenum", 0);

		if (body != null) {
			// 设置循环变量
			if (loopVars != null && loopVars.length > 0) {
				Sneed sneed = new Sneed();
				//参数
				Map<String,String> urlParams = new HashMap<String, String>(); 
				if (StringUtils.isNotEmpty(keyword)) {
					sneed.setTitle(keyword);
					urlParams.put("keyword", keyword);
				}

				if (null != scode && scode!=0) {
					sneed.setScode(scode);
					urlParams.put("scode", scode+"");
				}

				if (null != subscode && subscode!=0) {
					sneed.setSubscode(subscode);
					urlParams.put("subscode", subscode+"");
				}
				try {
					// 获取总数
					int count = sneedAPI.count(sneed);
					FreemarkerPager pager = new FreemarkerPager();
					pager.setCurrPage(page);
					pager.setTotalCount(count);
					pager.setPageSize(num);
					pager.setUrl("/sneed.html");
					pager.setParams(urlParams);
					
					// 如果总页数大于最多显示页数，则设置总页数为最多显示页数
					if (pagenum > 0 && pagenum < pager.getTotalPage()) {
						pager.setTotalPage(pagenum);
					}
					List<Sneed> sneedlist = sneedAPI.querySneedList(sneed,
							order, page, num);
					if (null != sneedlist && sneedlist.size() > 0) {
						loopVars[0] = new ArrayModel(sneedlist.toArray(),
								new BeansWrapper());
						if (loopVars.length > 1) {
							loopVars[1] = new BeanModel(pager,
									new BeansWrapper());
						}
						body.render(env.getOut());
					}
				} catch (ApiException e) {
					e.printStackTrace();
				} catch (TemplateException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
