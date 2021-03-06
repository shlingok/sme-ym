package com.gsccs.sme.plat.task.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.gsccs.sme.plat.bass.BaseExample;

public class CapitalReplyExample extends BaseExample {

	protected String orderByClause;
	protected boolean distinct;
	protected List<Criteria> oredCriteria;

	public CapitalReplyExample() {
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
	 * to the database table sme_capital_reply
	 * 
	 * @mbggenerated Sat Jul 16 21:18:37 CST 2016
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sme_capital_reply
	 * 
	 * @mbggenerated Sat Jul 16 21:18:37 CST 2016
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sme_capital_reply
	 * 
	 * @mbggenerated Sat Jul 16 21:18:37 CST 2016
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sme_capital_reply
	 * 
	 * @mbggenerated Sat Jul 16 21:18:37 CST 2016
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sme_capital_reply
	 * 
	 * @mbggenerated Sat Jul 16 21:18:37 CST 2016
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sme_capital_reply
	 * 
	 * @mbggenerated Sat Jul 16 21:18:37 CST 2016
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
	 * to the database table sme_capital_reply
	 * 
	 * @mbggenerated Sat Jul 16 21:18:37 CST 2016
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table sme_capital_reply
	 * 
	 * @mbggenerated Sat Jul 16 21:18:37 CST 2016
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to
	 * the database table sme_capital_reply
	 * 
	 * @mbggenerated Sat Jul 16 21:18:37 CST 2016
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

		public Criteria andApplidIsNull() {
			addCriterion("applid is null");
			return (Criteria) this;
		}

		public Criteria andApplidIsNotNull() {
			addCriterion("applid is not null");
			return (Criteria) this;
		}

		public Criteria andApplidEqualTo(Long value) {
			addCriterion("applid =", value, "applid");
			return (Criteria) this;
		}

		public Criteria andApplidNotEqualTo(Long value) {
			addCriterion("applid <>", value, "applid");
			return (Criteria) this;
		}

		public Criteria andApplidGreaterThan(Long value) {
			addCriterion("applid >", value, "applid");
			return (Criteria) this;
		}

		public Criteria andApplidGreaterThanOrEqualTo(Long value) {
			addCriterion("applid >=", value, "applid");
			return (Criteria) this;
		}

		public Criteria andApplidLessThan(Long value) {
			addCriterion("applid <", value, "applid");
			return (Criteria) this;
		}

		public Criteria andApplidLessThanOrEqualTo(Long value) {
			addCriterion("applid <=", value, "applid");
			return (Criteria) this;
		}

		public Criteria andApplidIn(List<Long> values) {
			addCriterion("applid in", values, "applid");
			return (Criteria) this;
		}

		public Criteria andApplidNotIn(List<Long> values) {
			addCriterion("applid not in", values, "applid");
			return (Criteria) this;
		}

		public Criteria andApplidBetween(Long value1, Long value2) {
			addCriterion("applid between", value1, value2, "applid");
			return (Criteria) this;
		}

		public Criteria andApplidNotBetween(Long value1, Long value2) {
			addCriterion("applid not between", value1, value2, "applid");
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

		public Criteria andContentIsNull() {
			addCriterion("content is null");
			return (Criteria) this;
		}

		public Criteria andContentIsNotNull() {
			addCriterion("content is not null");
			return (Criteria) this;
		}

		public Criteria andContentEqualTo(String value) {
			addCriterion("content =", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentNotEqualTo(String value) {
			addCriterion("content <>", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentGreaterThan(String value) {
			addCriterion("content >", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentGreaterThanOrEqualTo(String value) {
			addCriterion("content >=", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentLessThan(String value) {
			addCriterion("content <", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentLessThanOrEqualTo(String value) {
			addCriterion("content <=", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentLike(String value) {
			addCriterion("content like", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentNotLike(String value) {
			addCriterion("content not like", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentIn(List<String> values) {
			addCriterion("content in", values, "content");
			return (Criteria) this;
		}

		public Criteria andContentNotIn(List<String> values) {
			addCriterion("content not in", values, "content");
			return (Criteria) this;
		}

		public Criteria andContentBetween(String value1, String value2) {
			addCriterion("content between", value1, value2, "content");
			return (Criteria) this;
		}

		public Criteria andContentNotBetween(String value1, String value2) {
			addCriterion("content not between", value1, value2, "content");
			return (Criteria) this;
		}

		public Criteria andIsstonedIsNull() {
			addCriterion("isstoned is null");
			return (Criteria) this;
		}

		public Criteria andIsstonedIsNotNull() {
			addCriterion("isstoned is not null");
			return (Criteria) this;
		}

		public Criteria andIsstonedEqualTo(String value) {
			addCriterion("isstoned =", value, "isstoned");
			return (Criteria) this;
		}

		public Criteria andIsstonedNotEqualTo(String value) {
			addCriterion("isstoned <>", value, "isstoned");
			return (Criteria) this;
		}

		public Criteria andIsstonedGreaterThan(String value) {
			addCriterion("isstoned >", value, "isstoned");
			return (Criteria) this;
		}

		public Criteria andIsstonedGreaterThanOrEqualTo(String value) {
			addCriterion("isstoned >=", value, "isstoned");
			return (Criteria) this;
		}

		public Criteria andIsstonedLessThan(String value) {
			addCriterion("isstoned <", value, "isstoned");
			return (Criteria) this;
		}

		public Criteria andIsstonedLessThanOrEqualTo(String value) {
			addCriterion("isstoned <=", value, "isstoned");
			return (Criteria) this;
		}

		public Criteria andIsstonedLike(String value) {
			addCriterion("isstoned like", value, "isstoned");
			return (Criteria) this;
		}

		public Criteria andIsstonedNotLike(String value) {
			addCriterion("isstoned not like", value, "isstoned");
			return (Criteria) this;
		}

		public Criteria andIsstonedIn(List<String> values) {
			addCriterion("isstoned in", values, "isstoned");
			return (Criteria) this;
		}

		public Criteria andIsstonedNotIn(List<String> values) {
			addCriterion("isstoned not in", values, "isstoned");
			return (Criteria) this;
		}

		public Criteria andIsstonedBetween(String value1, String value2) {
			addCriterion("isstoned between", value1, value2, "isstoned");
			return (Criteria) this;
		}

		public Criteria andIsstonedNotBetween(String value1, String value2) {
			addCriterion("isstoned not between", value1, value2, "isstoned");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to
	 * the database table sme_capital_reply
	 * 
	 * @mbggenerated do_not_delete_during_merge Sat Jul 16 21:18:37 CST 2016
	 */
	public static class Criteria extends GeneratedCriteria {

		protected Criteria() {
			super();
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to
	 * the database table sme_capital_reply
	 * 
	 * @mbggenerated Sat Jul 16 21:18:37 CST 2016
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