<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

<title>数据上报_玉门市中小企业公共服务平台</title>
<link rel="shortcut icon" href="/resources/site/images/favicon.ico"
	type="image/x-icon" />
<link rel="stylesheet" type="text/css" href="${base}/resources/site/css/base.css" />
<script type="text/javascript" src="${base}/resources/site/js/jquery-1.8.0.min.js"></script>
<script type="text/javascript" src="${base}/resources/site/js/Common.js"></script>
<script type="text/javascript" src="${base}/resources/site/js/HomeAndFavorite.js"></script>
<link rel="stylesheet" type="text/css" href="${base}/resources/site/css/declare.css" />

<script type="text/javascript" src="${base}/resources/site/js/jquery-1.8.0.min.js"></script>
<script src="${base}/resources/uploadify/jquery.uploadify.min.js" type="text/javascript"></script>
<script src="${base}/resources/uploadify/swfobject.js" type="text/javascript"></script>
<link href="${base}/resources/uploadify/uploadify.css" rel="stylesheet" type="text/css">


<script type="text/javascript" src="${base}/resources/layer/layer.js"></script>
<script type="text/javascript">
var attachs = new Array();
$(function () {
	$("#uploadify").uploadify({
        'uploader': '/resources/uploadify/uploadify.swf',
		'script': '/uploadfile',
		'cancelImg': '/resources/uploadify/cancel.png',
		'folder': 'UploadFile',
		'queueID': 'fileQueue',
		'auto': true,
		'multi': false,
		'buttonImg': '/resources/uploadify/uploadify.png',
		'width': 78,
		'height': 23,
		'onComplete': function (event, UserID, fileObj, response, data) {
			console.log("response:",response);
			if (response != null) {
				var result = eval("(" + response + ")");
				if (result.success){
		        	var attach = result.data;
					attachs.push(attach);
					$("#filelist").append("<li id='attach_"+attach.id+"'>"+attach.filename+"&nbsp;&nbsp;&nbsp;[<a href='javascript:void(0)' onclick=delAttachClient('"+attach.id+"')>删除</a>]</li>");
				}else{
					$("#txtTishi").html(result.msg);
		        }
			}
		}
	}); 
	
	$("#dvSubmit").click(function () {
		var reportid =$("#reportid").val();
		var content= $("#content").val();
		if (content==""){
			$("#server_msg").show();
			$("#server_msg").html("内容描述不能为空！");
			return;
		}
		
		if (content.length>500){
			$("#server_msg").show();
			$("#server_msg").html("内容描述超出最大字数限制！");
			return;
		}
		
		if(attachs.length<=0){
			var r=confirm("请确认不需要上传附件？");
			if (!r){
				return;
			}
		}
        var postData = {
        	reportid:reportid,
            remark: content,
            attachs:attachs
        };
        
        console.log("postData",postData);
        $('#dvSubmit').attr('disabled',"true");
        $.ajax({  
            type: "POST",  
            url: "/cp/report/add",  
            data: JSON.stringify(postData),//将对象序列化成JSON字符串  
            dataType:"json",  
            contentType : 'application/json;charset=utf-8', //设置请求头信息  
            success: function(res){
            	//$("#server_msg").show();
				//$("#server_msg").html(res.msg);
				layer.alert(res.msg);
				$('#dvSubmit').attr('disabled',"true");
            },  
            error: function(res){
            	//$("#server_msg").show();
				//$("#server_msg").html(res.msg);
				layer.alert(res.msg);
				$('#dvSubmit').removeAttr("disabled");
        	}
        });
    });           
});       
</script>
</head>
<body>

	<script type="text/javascript">
    $(function () {

        $("#dvCategoryTitle").click(function () {
            $("#uCategoryDetail").slideDown(400);
        });

        $("#uCategoryDetail").mouseleave(function () {
            $("#uCategoryDetail").slideUp(400);
        });

    });
</script>

	<!-- header -->
	[#include "/widget/header.ftl" /]
	
	<!-- main -->
	[#include "/report/detailmain.ftl" /]
	
	<!-- footer -->
    [#include "/widget/footer.ftl" /]	

</body>
</html>