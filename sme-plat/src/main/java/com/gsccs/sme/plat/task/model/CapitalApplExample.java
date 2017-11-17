package com.gsccs.sme.plat.task.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.gsccs.sme.plat.bass.BaseExample;

public class CapitalApplExample extends BaseExample {
	
	protected String orderByClause;
	protected boolean distinct;
	protected List<Criteria> oredCriteria;

	public CapitalApplExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sme_capital_appl
	 * 
	 * @mbggenerated Sat Jul 16 17:04:25 CST 2016
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sme_capital_appl
	 * 
	 * @mbggenerated Sat Jul 16 17:04:25 CST 2016
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sme_capital_appl
	 * 
	 * @mbggenerated Sat Jul 16 17:04:25 CST 2016
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sme_capital_appl
	 * 
	 * @mbggenerated Sat Jul 16 17:04:25 CST 2016
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sme_capital_appl
	 * 
	 * @mbggenerated Sat Jul 16 17:04:25 CST 2016
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sme_capital_appl
	 * 
	 * @mbggenerated Sat Jul 16 17:04:25 CST 2016
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sme_capital_appl
	 * 
	 * @mbggenerated Sat Jul 16 17:04:25 CST 2016
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sme_capital_appl
	 * 
	 * @mbggenerated Sat Jul 16 17:04:25 CST 2016
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to
	 * the database table sme_capital_appl
	 * 
	 * @mbggenerated Sat Jul 16 17:04:25 CST 2016
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Long value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Long value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Long value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Long value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Long value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Long value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Long> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Long> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Long value1, Long value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Long value1, Long value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andCorpidIsNull() {
			addCriterion("corpid is null");
			return (Criteria) this;
		}

		public Criteria andCorpidIsNotNull() {
			addCriterion("corpid is not null");
			return (Criteria) this;
		}

		public Criteria andCorpidEqualTo(Long value) {
			addCriterion("corpid =", value, "corpid");
			return (Criteria) this;
		}

		public Criteria andCorpidNotEqualTo(Long value) {
			addCriterion("corpid <>", value, "corpid");
			return (Criteria) this;
		}

		public Criteria andCorpidGreaterThan(Long value) {
			addCriterion("corpid >", value, "corpid");
			return (Criteria) this;
		}

		public Criteria andCorpidGreaterThanOrEqualTo(Long value) {
			addCriterion("corpid >=", value, "corpid");
			return (Criteria) this;
		}

		public Criteria andCorpidLessThan(Long value) {
			addCriterion("corpid <", value, "corpid");
			return (Criteria) this;
		}

		public Criteria andCorpidLessThanOrEqualTo(Long value) {
			addCriterion("corpid <=", value, "corpid");
			return (Criteria) this;
		}

		public Criteria andCorpidIn(List<Long> values) {
			addCriterion("corpid in", values, "corpid");
			return (Criteria) this;
		}

		public Criteria andCorpidNotIn(List<Long> values) {
			addCriterion("corpid not in", values, "corpid");
			return (Criteria) this;
		}

		public Criteria andCorpidBetween(Long value1, Long value2) {
			addCriterion("corpid between", value1, value2, "corpid");
			return (Criteria) this;
		}

		public Criteria andCorpidNotBetween(Long value1, Long value2) {
			addCriterion("corpid not between", value1, value2, "corpid");
			return (Criteria) this;
		}

		public Criteria andSvgidIsNull() {
			addCriterion("svgid is null");
			return (Criteria) this;
		}

		public Criteria andSvgidIsNotNull() {
			addCriterion("svgid is not null");
			return (Criteria) this;
		}

		public Criteria andSvgidEqualTo(Long value) {
			addCriterion("svgid =", value, "svgid");
			return (Criteria) this;
		}

		public Criteria andSvgidNotEqualTo(Long value) {
			addCriterion("svgid <>", value, "svgid");
			return (Criteria) this;
		}

		public Criteria andSvgidGreaterThan(Long value) {
			addCriterion("svgid >", value, "svgid");
			return (Criteria) this;
		}

		public Criteria andSvgidGreaterThanOrEqualTo(Long value) {
			addCriterion("svgid >=", value, "svgid");
			return (Criteria) this;
		}

		public Criteria andSvgidLessThan(Long value) {
			addCriterion("svgid <", value, "svgid");
			return (Criteria) this;
		}

		public Criteria andSvgidLessThanOrEqualTo(Long value) {
			addCriterion("svgid <=", value, "svgid");
			return (Criteria) this;
		}

		public Criteria andSvgidIn(List<Long> values) {
			addCriterion("svgid in", values, "svgid");
			return (Criteria) this;
		}

		public Criteria andSvgidNotIn(List<Long> values) {
			addCriterion("svgid not in", values, "svgid");
			return (Criteria) this;
		}

		public Criteria andSvgidBetween(Long value1, Long value2) {
			addCriterion("svgid between", value1, value2, "svgid");
			return (Criteria) this;
		}

		public Criteria andSvgidNotBetween(Long value1, Long value2) {
			addCriterion("svgid not between", value1, value2, "svgid");
			return (Criteria) this;
		}

		public Criteria andAccountIsNull() {
			addCriterion("account is null");
			return (Criteria) this;
		}

		public Criteria andAccountIsNotNull() {
			addCriterion("account is not null");
			return (Criteria) this;
		}

		public Criteria andAccountEqualTo(Float value) {
			addCriterion("account =", value, "account");
			return (Criteria) this;
		}

		public Criteria andAccountNotEqualTo(Float value) {
			addCriterion("account <>", value, "account");
			return (Criteria) this;
		}

		public Criteria andAccountGreaterThan(Float value) {
			addCriterion("account >", value, "account");
			return (Criteria) this;
		}

		public Criteria andAccountGreaterThanOrEqualTo(Float value) {
			addCriterion("account >=", value, "account");
			return (Criteria) this;
		}

		public Criteria andAccountLessThan(Float value) {
			addCriterion("account <", value, "account");
			return (Criteria) this;
		}

		public Criteria andAccountLessThanOrEqualTo(Float value) {
			addCriterion("account <=", value, "account");
			return (Criteria) this;
		}

		public Criteria andAccountIn(List<Float> values) {
			addCriterion("account in", values, "account");
			return (Criteria) this;
		}

		public Criteria andAccountNotIn(List<Float> values) {
			addCriterion("account not in", values, "account");
			return (Criteria) this;
		}

		public Criteria andAccountBetween(Float value1, Float value2) {
			addCriterion("account between", value1, value2, "account");
			return (Criteria) this;
		}

		public Criteria andAccountNotBetween(Float value1, Float value2) {
			addCriterion("account not between", value1, value2, "account");
			return (Criteria) this;
		}

		public Criteria andDbtypeIsNull() {
			addCriterion("dbtype is null");
			return (Criteria) this;
		}

		public Criteria andDbtypeIsNotNull() {
			addCriterion("dbtype is not null");
			return (Criteria) this;
		}

		public Criteria andDbtypeEqualTo(String value) {
			addCriterion("dbtype =", value, "dbtype");
			return (Criteria) this;
		}

		public Criteria andDbtypeNotEqualTo(String value) {
			addCriterion("dbtype <>", value, "dbtype");
			return (Criteria) this;
		}

		public Criteria andDbtypeGreaterThan(String value) {
			addCriterion("dbtype >", value, "dbtype");
			return (Criteria) this;
		}

		public Criteria andDbtypeGreaterThanOrEqualTo(String value) {
			addCriterion("dbtype >=", value, "dbtype");
			return (Criteria) this;
		}

		public Criteria andDbtypeLessThan(String value) {
			addCriterion("dbtype <", value, "dbtype");
			return (Criteria) this;
		}

		public Criteria andDbtypeLessThanOrEqualTo(String value) {
			addCriterion("dbtype <=", value, "dbtype");
			return (Criteria) this;
		}

		public Criteria andDbtypeLike(String value) {
			addCriterion("dbtype like", value, "dbtype");
			return (Criteria) this;
		}

		public Criteria andDbtypeNotLike(String value) {
			addCriterion("dbtype not like", value, "dbtype");
			return (Criteria) this;
		}

		public Criteria andDbtypeIn(List<String> values) {
			addCriterion("dbtype in", values, "dbtype");
			return (Criteria) this;
		}

		public Criteria andDbtypeNotIn(List<String> values) {
			addCriterion("dbtype not in", values, "dbtype");
			return (Criteria) this;
		}

		public Criteria andDbtypeBetween(String value1, String value2) {
			addCriterion("dbtype between", value1, value2, "dbtype");
			return (Criteria) this;
		}

		public Criteria andDbtypeNotBetween(String value1, String value2) {
			addCriterion("dbtype not between", value1, value2, "dbtype");
			return (Criteria) this;
		}

		public Criteria andMonthIsNull() {
			addCriterion("month is null");
			return (Criteria) this;
		}

		public Criteria andMonthIsNotNull() {
			addCriterion("month is not null");
			return (Criteria) this;
		}

		public Criteria andMonthEqualTo(Integer value) {
			addCriterion("month =", value, "month");
			return (Criteria) this;
		}

		public Criteria andMonthNotEqualTo(Integer value) {
			addCriterion("month <>", value, "month");
			return (Criteria) this;
		}

		public Criteria andMonthGreaterThan(Integer value) {
			addCriterion("month >", value, "month");
			return (Criteria) this;
		}

		public Criteria andMonthGreaterThanOrEqualTo(Integer value) {
			addCriterion("month >=", value, "month");
			return (Criteria) this;
		}

		public Criteria andMonthLessThan(Integer value) {
			addCriterion("month <", value, "month");
			return (Criteria) this;
		}

		public Criteria andMonthLessThanOrEqualTo(Integer value) {
			addCriterion("month <=", value, "month");
			return (Criteria) this;
		}

		public Criteria andMonthIn(List<Integer> values) {
			addCriterion("month in", values, "month");
			return (Criteria) this;
		}

		public Criteria andMonthNotIn(List<Integer> values) {
			addCriterion("month not in", values, "month");
			return (Criteria) this;
		}

		public Criteria andMonthBetween(Integer value1, Integer value2) {
			addCriterion("month between", value1, value2, "month");
			return (Criteria) this;
		}

		public Criteria andMonthNotBetween(Integer value1, Integer value2) {
			addCriterion("month not between", value1, value2, "month");
			return (Criteria) this;
		}

		public Criteria andUseforIsNull() {
			addCriterion("usefor is null");
			return (Criteria) this;
		}

		public Criteria andUseforIsNotNull() {
			addCriterion("usefor is not null");
			return (Criteria) this;
		}

		public Criteria andUseforEqualTo(String value) {
			addCriterion("usefor =", value, "usefor");
			return (Criteria) this;
		}

		public Criteria andUseforNotEqualTo(String value) {
			addCriterion("usefor <>", value, "usefor");
			return (Criteria) this;
		}

		public Criteria andUseforGreaterThan(String value) {
			addCriterion("usefor >", value, "usefor");
			return (Criteria) this;
		}

		public Criteria andUseforGreaterThanOrEqualTo(String value) {
			addCriterion("usefor >=", value, "usefor");
			return (Criteria) this;
		}

		public Criteria andUseforLessThan(String value) {
			addCriterion("usefor <", value, "usefor");
			return (Criteria) this;
		}

		public Criteria andUseforLessThanOrEqualTo(String value) {
			addCriterion("usefor <=", value, "usefor");
			return (Criteria) this;
		}

		public Criteria andUseforLike(String value) {
			addCriterion("usefor like", value, "usefor");
			return (Criteria) this;
		}

		public Criteria andUseforNotLike(String value) {
			addCriterion("usefor not like", value, "usefor");
			return (Criteria) this;
		}

		public Criteria andUseforIn(List<String> values) {
			addCriterion("usefor in", values, "usefor");
			return (Criteria) this;
		}

		public Criteria andUseforNotIn(List<String> values) {
			addCriterion("usefor not in", values, "usefor");
			return (Criteria) this;
		}

		public Criteria andUseforBetween(String value1, String value2) {
			addCriterion("usefor between", value1, value2, "usefor");
			return (Criteria) this;
		}

		public Criteria andUseforNotBetween(String value1, String value2) {
			addCriterion("usefor not between", value1, value2, "usefor");
			return (Criteria) this;
		}

		public Criteria andAddtimeIsNull() {
			addCriterion("addtime is null");
			return (Criteria) this;
		}

		public Criteria andAddtimeIsNotNull() {
			addCriterion("addtime is not null");
			return (Criteria) this;
		}

		public Criteria andAddtimeEqualTo(Date value) {
			addCriterion("addtime =", value, "addtime");
			return (Criteria) this;
		}

		public Criteria andAddtimeNotEqualTo(Date value) {
			addCriterion("addtime <>", value, "addtime");
			return (Criteria) this;
		}

		public Criteria andAddtimeGreaterThan(Date value) {
			addCriterion("addtime >", value, "addtime");
			return (Criteria) this;
		}

		public Criteria andAddtimeGreaterThanOrEqualTo(Date value) {
			addCriterion("addtime >=", value, "addtime");
			return (Criteria) this;
		}

		public Criteria andAddtimeLessThan(Date value) {
			addCriterion("addtime <", value, "addtime");
			return (Criteria) this;
		}

		public Criteria andAddtimeLessThanOrEqualTo(Date value) {
			addCriterion("addtime <=", value, "addtime");
			return (Criteria) this;
		}

		public Criteria andAddtimeIn(List<Date> values) {
			addCriterion("addtime in", values, "addtime");
			return (Criteria) this;
		}

		public Criteria andAddtimeNotIn(List<Date> values) {
			addCriterion("addtime not in", values, "addtime");
			return (Criteria) this;
		}

		public Criteria andAddtimeBetween(Date value1, Date value2) {
			addCriterion("addtime between", value1, value2, "addtime");
			return (Criteria) this;
		}

		public Criteria andAddtimeNotBetween(Date value1, Date value2) {
			addCriterion("addtime not between", value1, value2, "addtime");
			return (Criteria) this;
		}

		public Criteria andStatusIsNull() {
			addCriterion("status is null");
			return (Criteria) this;
		}

		public Criteria andStatusIsNotNull() {
			addCriterion("status is not null");
			return (Criteria) this;
		}

		public Criteria andStatusEqualTo(String value) {
			addCriterion("status =", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotEqualTo(String value) {
			addCriterion("status <>", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThan(String value) {
			addCriterion("status >", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThanOrEqualTo(String value) {
			addCriterion("status >=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThan(String value) {
			addCriterion("status <", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThanOrEqualTo(String value) {
			addCriterion("status <=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLike(String value) {
			addCriterion("status like", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotLike(String value) {
			addCriterion("status not like", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusIn(List<String> values) {
			addCriterion("status in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotIn(List<String> values) {
			addCriterion("status not in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusBetween(String value1, String value2) {
			addCriterion("status between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotBetween(String value1, String value2) {
			addCriterion("status not between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andLinkerIsNull() {
			addCriterion("linker is null");
			return (Criteria) this;
		}

		public Criteria andLinkerIsNotNull() {
			addCriterion("linker is not null");
			return (Criteria) this;
		}

		public Criteria andLinkerEqualTo(String value) {
			addCriterion("linker =", value, "linker");
			return (Criteria) this;
		}

		public Criteria andLinkerNotEqualTo(String value) {
			addCriterion("linker <>", value, "linker");
			return (Criteria) this;
		}

		public Criteria andLinkerGreaterThan(String value) {
			addCriterion("linker >", value, "linker");
			return (Criteria) this;
		}

		public Criteria andLinkerGreaterThanOrEqualTo(String value) {
			addCriterion("linker >=", value, "linker");
			return (Criteria) this;
		}

		public Criteria andLinkerLessThan(String value) {
			addCriterion("linker <", value, "linker");
			return (Criteria) this;
		}

		public Criteria andLinkerLessThanOrEqualTo(String value) {
			addCriterion("linker <=", value, "linker");
			return (Criteria) this;
		}

		public Criteria andLinkerLike(String value) {
			addCriterion("linker like", value, "linker");
			return (Criteria) this;
		}

		public Criteria andLinkerNotLike(String value) {
			addCriterion("linker not like", value, "linker");
			return (Criteria) this;
		}

		public Criteria andLinkerIn(List<String> values) {
			addCriterion("linker in", values, "linker");
			return (Criteria) this;
		}

		public Criteria andLinkerNotIn(List<String> values) {
			addCriterion("linker not in", values, "linker");
			return (Criteria) this;
		}

		public Criteria andLinkerBetween(String value1, String value2) {
			addCriterion("linker between", value1, value2, "linker");
			return (Criteria) this;
		}

		public Criteria andLinkerNotBetween(String value1, String value2) {
			addCriterion("linker not between", value1, value2, "linker");
			return (Criteria) this;
		}

		public Criteria andLinktelIsNull() {
			addCriterion("linktel is null");
			return (Criteria) this;
		}

		public Criteria andLinktelIsNotNull() {
			addCriterion("linktel is not null");
			return (Criteria) this;
		}

		public Criteria andLinktelEqualTo(String value) {
			addCriterion("linktel =", value, "linktel");
			return (Criteria) this;
		}

		public Criteria andLinktelNotEqualTo(String value) {
			addCriterion("linktel <>", value, "linktel");
			return (Criteria) this;
		}

		public Criteria andLinktelGreaterThan(String value) {
			addCriterion("linktel >", value, "linktel");
			return (Criteria) this;
		}

		public Criteria andLinktelGreaterThanOrEqualTo(String value) {
			addCriterion("linktel >=", value, "linktel");
			return (Criteria) this;
		}

		public Criteria andLinktelLessThan(String value) {
			addCriterion("linktel <", value, "linktel");
			return (Criteria) this;
		}

		public Criteria andLinktelLessThanOrEqualTo(String value) {
			addCriterion("linktel <=", value, "linktel");
			return (Criteria) this;
		}

		public Criteria andLinktelLike(String value) {
			addCriterion("linktel like", value, "linktel");
			return (Criteria) this;
		}

		public Criteria andLinktelNotLike(String value) {
			addCriterion("linktel not like", value, "linktel");
			return (Criteria) this;
		}

		public Criteria andLinktelIn(List<String> values) {
			addCriterion("linktel in", values, "linktel");
			return (Criteria) this;
		}

		public Criteria andLinktelNotIn(List<String> values) {
			addCriterion("linktel not in", values, "linktel");
			return (Criteria) this;
		}

		public Criteria andLinktelBetween(String value1, String value2) {
			addCriterion("linktel between", value1, value2, "linktel");
			return (Criteria) this;
		}

		public Criteria andLinktelNotBetween(String value1, String value2) {
			addCriterion("linktel not between", value1, value2, "linktel");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to
	 * the database table sme_capital_appl
	 * 
	 * @mbggenerated do_not_delete_during_merge Sat Jul 16 17:04:25 CST 2016
	 */
	public static class Criteria extends GeneratedCriteria {

		protected Criteria() {
			super();
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to
	 * the database table sme_capital_appl
	 * 
	 * @mbggenerated Sat Jul 16 17:04:25 CST 2016
	 */
	public static class Criterion {
		private String condition;

		private Object value;

		private Object secondValue;

		private boolean noValue;

		private boolean singleValue;

		private boolean betweenValue;

		private boolean listValue;

		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}
}