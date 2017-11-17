package com.gsccs.sme.plat.corp.model;

import java.util.ArrayList;
import java.util.List;

import com.gsccs.sme.plat.bass.BaseExample;

public class CorpWaterExample extends BaseExample{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sme_corp_water
     *
     * @mbggenerated Tue Jul 26 11:06:57 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sme_corp_water
     *
     * @mbggenerated Tue Jul 26 11:06:57 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sme_corp_water
     *
     * @mbggenerated Tue Jul 26 11:06:57 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sme_corp_water
     *
     * @mbggenerated Tue Jul 26 11:06:57 CST 2016
     */
    public CorpWaterExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sme_corp_water
     *
     * @mbggenerated Tue Jul 26 11:06:57 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sme_corp_water
     *
     * @mbggenerated Tue Jul 26 11:06:57 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sme_corp_water
     *
     * @mbggenerated Tue Jul 26 11:06:57 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sme_corp_water
     *
     * @mbggenerated Tue Jul 26 11:06:57 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sme_corp_water
     *
     * @mbggenerated Tue Jul 26 11:06:57 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sme_corp_water
     *
     * @mbggenerated Tue Jul 26 11:06:57 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sme_corp_water
     *
     * @mbggenerated Tue Jul 26 11:06:57 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sme_corp_water
     *
     * @mbggenerated Tue Jul 26 11:06:57 CST 2016
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sme_corp_water
     *
     * @mbggenerated Tue Jul 26 11:06:57 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sme_corp_water
     *
     * @mbggenerated Tue Jul 26 11:06:57 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sme_corp_water
     *
     * @mbggenerated Tue Jul 26 11:06:57 CST 2016
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

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
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

        public Criteria andYearIsNull() {
            addCriterion("year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(Integer value) {
            addCriterion("year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(Integer value) {
            addCriterion("year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(Integer value) {
            addCriterion("year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(Integer value) {
            addCriterion("year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(Integer value) {
            addCriterion("year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<Integer> values) {
            addCriterion("year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<Integer> values) {
            addCriterion("year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(Integer value1, Integer value2) {
            addCriterion("year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(Integer value1, Integer value2) {
            addCriterion("year not between", value1, value2, "year");
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

        public Criteria andQDbIsNull() {
            addCriterion("q_db is null");
            return (Criteria) this;
        }

        public Criteria andQDbIsNotNull() {
            addCriterion("q_db is not null");
            return (Criteria) this;
        }

        public Criteria andQDbEqualTo(Float value) {
            addCriterion("q_db =", value, "qDb");
            return (Criteria) this;
        }

        public Criteria andQDbNotEqualTo(Float value) {
            addCriterion("q_db <>", value, "qDb");
            return (Criteria) this;
        }

        public Criteria andQDbGreaterThan(Float value) {
            addCriterion("q_db >", value, "qDb");
            return (Criteria) this;
        }

        public Criteria andQDbGreaterThanOrEqualTo(Float value) {
            addCriterion("q_db >=", value, "qDb");
            return (Criteria) this;
        }

        public Criteria andQDbLessThan(Float value) {
            addCriterion("q_db <", value, "qDb");
            return (Criteria) this;
        }

        public Criteria andQDbLessThanOrEqualTo(Float value) {
            addCriterion("q_db <=", value, "qDb");
            return (Criteria) this;
        }

        public Criteria andQDbIn(List<Float> values) {
            addCriterion("q_db in", values, "qDb");
            return (Criteria) this;
        }

        public Criteria andQDbNotIn(List<Float> values) {
            addCriterion("q_db not in", values, "qDb");
            return (Criteria) this;
        }

        public Criteria andQDbBetween(Float value1, Float value2) {
            addCriterion("q_db between", value1, value2, "qDb");
            return (Criteria) this;
        }

        public Criteria andQDbNotBetween(Float value1, Float value2) {
            addCriterion("q_db not between", value1, value2, "qDb");
            return (Criteria) this;
        }

        public Criteria andQDxIsNull() {
            addCriterion("q_dx is null");
            return (Criteria) this;
        }

        public Criteria andQDxIsNotNull() {
            addCriterion("q_dx is not null");
            return (Criteria) this;
        }

        public Criteria andQDxEqualTo(Float value) {
            addCriterion("q_dx =", value, "qDx");
            return (Criteria) this;
        }

        public Criteria andQDxNotEqualTo(Float value) {
            addCriterion("q_dx <>", value, "qDx");
            return (Criteria) this;
        }

        public Criteria andQDxGreaterThan(Float value) {
            addCriterion("q_dx >", value, "qDx");
            return (Criteria) this;
        }

        public Criteria andQDxGreaterThanOrEqualTo(Float value) {
            addCriterion("q_dx >=", value, "qDx");
            return (Criteria) this;
        }

        public Criteria andQDxLessThan(Float value) {
            addCriterion("q_dx <", value, "qDx");
            return (Criteria) this;
        }

        public Criteria andQDxLessThanOrEqualTo(Float value) {
            addCriterion("q_dx <=", value, "qDx");
            return (Criteria) this;
        }

        public Criteria andQDxIn(List<Float> values) {
            addCriterion("q_dx in", values, "qDx");
            return (Criteria) this;
        }

        public Criteria andQDxNotIn(List<Float> values) {
            addCriterion("q_dx not in", values, "qDx");
            return (Criteria) this;
        }

        public Criteria andQDxBetween(Float value1, Float value2) {
            addCriterion("q_dx between", value1, value2, "qDx");
            return (Criteria) this;
        }

        public Criteria andQDxNotBetween(Float value1, Float value2) {
            addCriterion("q_dx not between", value1, value2, "qDx");
            return (Criteria) this;
        }

        public Criteria andQZlIsNull() {
            addCriterion("q_zl is null");
            return (Criteria) this;
        }

        public Criteria andQZlIsNotNull() {
            addCriterion("q_zl is not null");
            return (Criteria) this;
        }

        public Criteria andQZlEqualTo(Float value) {
            addCriterion("q_zl =", value, "qZl");
            return (Criteria) this;
        }

        public Criteria andQZlNotEqualTo(Float value) {
            addCriterion("q_zl <>", value, "qZl");
            return (Criteria) this;
        }

        public Criteria andQZlGreaterThan(Float value) {
            addCriterion("q_zl >", value, "qZl");
            return (Criteria) this;
        }

        public Criteria andQZlGreaterThanOrEqualTo(Float value) {
            addCriterion("q_zl >=", value, "qZl");
            return (Criteria) this;
        }

        public Criteria andQZlLessThan(Float value) {
            addCriterion("q_zl <", value, "qZl");
            return (Criteria) this;
        }

        public Criteria andQZlLessThanOrEqualTo(Float value) {
            addCriterion("q_zl <=", value, "qZl");
            return (Criteria) this;
        }

        public Criteria andQZlIn(List<Float> values) {
            addCriterion("q_zl in", values, "qZl");
            return (Criteria) this;
        }

        public Criteria andQZlNotIn(List<Float> values) {
            addCriterion("q_zl not in", values, "qZl");
            return (Criteria) this;
        }

        public Criteria andQZlBetween(Float value1, Float value2) {
            addCriterion("q_zl between", value1, value2, "qZl");
            return (Criteria) this;
        }

        public Criteria andQZlNotBetween(Float value1, Float value2) {
            addCriterion("q_zl not between", value1, value2, "qZl");
            return (Criteria) this;
        }

        public Criteria andQQtIsNull() {
            addCriterion("q_qt is null");
            return (Criteria) this;
        }

        public Criteria andQQtIsNotNull() {
            addCriterion("q_qt is not null");
            return (Criteria) this;
        }

        public Criteria andQQtEqualTo(Float value) {
            addCriterion("q_qt =", value, "qQt");
            return (Criteria) this;
        }

        public Criteria andQQtNotEqualTo(Float value) {
            addCriterion("q_qt <>", value, "qQt");
            return (Criteria) this;
        }

        public Criteria andQQtGreaterThan(Float value) {
            addCriterion("q_qt >", value, "qQt");
            return (Criteria) this;
        }

        public Criteria andQQtGreaterThanOrEqualTo(Float value) {
            addCriterion("q_qt >=", value, "qQt");
            return (Criteria) this;
        }

        public Criteria andQQtLessThan(Float value) {
            addCriterion("q_qt <", value, "qQt");
            return (Criteria) this;
        }

        public Criteria andQQtLessThanOrEqualTo(Float value) {
            addCriterion("q_qt <=", value, "qQt");
            return (Criteria) this;
        }

        public Criteria andQQtIn(List<Float> values) {
            addCriterion("q_qt in", values, "qQt");
            return (Criteria) this;
        }

        public Criteria andQQtNotIn(List<Float> values) {
            addCriterion("q_qt not in", values, "qQt");
            return (Criteria) this;
        }

        public Criteria andQQtBetween(Float value1, Float value2) {
            addCriterion("q_qt between", value1, value2, "qQt");
            return (Criteria) this;
        }

        public Criteria andQQtNotBetween(Float value1, Float value2) {
            addCriterion("q_qt not between", value1, value2, "qQt");
            return (Criteria) this;
        }

        public Criteria andQSumIsNull() {
            addCriterion("q_sum is null");
            return (Criteria) this;
        }

        public Criteria andQSumIsNotNull() {
            addCriterion("q_sum is not null");
            return (Criteria) this;
        }

        public Criteria andQSumEqualTo(Float value) {
            addCriterion("q_sum =", value, "qSum");
            return (Criteria) this;
        }

        public Criteria andQSumNotEqualTo(Float value) {
            addCriterion("q_sum <>", value, "qSum");
            return (Criteria) this;
        }

        public Criteria andQSumGreaterThan(Float value) {
            addCriterion("q_sum >", value, "qSum");
            return (Criteria) this;
        }

        public Criteria andQSumGreaterThanOrEqualTo(Float value) {
            addCriterion("q_sum >=", value, "qSum");
            return (Criteria) this;
        }

        public Criteria andQSumLessThan(Float value) {
            addCriterion("q_sum <", value, "qSum");
            return (Criteria) this;
        }

        public Criteria andQSumLessThanOrEqualTo(Float value) {
            addCriterion("q_sum <=", value, "qSum");
            return (Criteria) this;
        }

        public Criteria andQSumIn(List<Float> values) {
            addCriterion("q_sum in", values, "qSum");
            return (Criteria) this;
        }

        public Criteria andQSumNotIn(List<Float> values) {
            addCriterion("q_sum not in", values, "qSum");
            return (Criteria) this;
        }

        public Criteria andQSumBetween(Float value1, Float value2) {
            addCriterion("q_sum between", value1, value2, "qSum");
            return (Criteria) this;
        }

        public Criteria andQSumNotBetween(Float value1, Float value2) {
            addCriterion("q_sum not between", value1, value2, "qSum");
            return (Criteria) this;
        }

        public Criteria andYGynewIsNull() {
            addCriterion("y_gynew is null");
            return (Criteria) this;
        }

        public Criteria andYGynewIsNotNull() {
            addCriterion("y_gynew is not null");
            return (Criteria) this;
        }

        public Criteria andYGynewEqualTo(Float value) {
            addCriterion("y_gynew =", value, "yGynew");
            return (Criteria) this;
        }

        public Criteria andYGynewNotEqualTo(Float value) {
            addCriterion("y_gynew <>", value, "yGynew");
            return (Criteria) this;
        }

        public Criteria andYGynewGreaterThan(Float value) {
            addCriterion("y_gynew >", value, "yGynew");
            return (Criteria) this;
        }

        public Criteria andYGynewGreaterThanOrEqualTo(Float value) {
            addCriterion("y_gynew >=", value, "yGynew");
            return (Criteria) this;
        }

        public Criteria andYGynewLessThan(Float value) {
            addCriterion("y_gynew <", value, "yGynew");
            return (Criteria) this;
        }

        public Criteria andYGynewLessThanOrEqualTo(Float value) {
            addCriterion("y_gynew <=", value, "yGynew");
            return (Criteria) this;
        }

        public Criteria andYGynewIn(List<Float> values) {
            addCriterion("y_gynew in", values, "yGynew");
            return (Criteria) this;
        }

        public Criteria andYGynewNotIn(List<Float> values) {
            addCriterion("y_gynew not in", values, "yGynew");
            return (Criteria) this;
        }

        public Criteria andYGynewBetween(Float value1, Float value2) {
            addCriterion("y_gynew between", value1, value2, "yGynew");
            return (Criteria) this;
        }

        public Criteria andYGynewNotBetween(Float value1, Float value2) {
            addCriterion("y_gynew not between", value1, value2, "yGynew");
            return (Criteria) this;
        }

        public Criteria andYFgynewIsNull() {
            addCriterion("y_fgynew is null");
            return (Criteria) this;
        }

        public Criteria andYFgynewIsNotNull() {
            addCriterion("y_fgynew is not null");
            return (Criteria) this;
        }

        public Criteria andYFgynewEqualTo(Float value) {
            addCriterion("y_fgynew =", value, "yFgynew");
            return (Criteria) this;
        }

        public Criteria andYFgynewNotEqualTo(Float value) {
            addCriterion("y_fgynew <>", value, "yFgynew");
            return (Criteria) this;
        }

        public Criteria andYFgynewGreaterThan(Float value) {
            addCriterion("y_fgynew >", value, "yFgynew");
            return (Criteria) this;
        }

        public Criteria andYFgynewGreaterThanOrEqualTo(Float value) {
            addCriterion("y_fgynew >=", value, "yFgynew");
            return (Criteria) this;
        }

        public Criteria andYFgynewLessThan(Float value) {
            addCriterion("y_fgynew <", value, "yFgynew");
            return (Criteria) this;
        }

        public Criteria andYFgynewLessThanOrEqualTo(Float value) {
            addCriterion("y_fgynew <=", value, "yFgynew");
            return (Criteria) this;
        }

        public Criteria andYFgynewIn(List<Float> values) {
            addCriterion("y_fgynew in", values, "yFgynew");
            return (Criteria) this;
        }

        public Criteria andYFgynewNotIn(List<Float> values) {
            addCriterion("y_fgynew not in", values, "yFgynew");
            return (Criteria) this;
        }

        public Criteria andYFgynewBetween(Float value1, Float value2) {
            addCriterion("y_fgynew between", value1, value2, "yFgynew");
            return (Criteria) this;
        }

        public Criteria andYFgynewNotBetween(Float value1, Float value2) {
            addCriterion("y_fgynew not between", value1, value2, "yFgynew");
            return (Criteria) this;
        }

        public Criteria andYWgnewIsNull() {
            addCriterion("y_wgnew is null");
            return (Criteria) this;
        }

        public Criteria andYWgnewIsNotNull() {
            addCriterion("y_wgnew is not null");
            return (Criteria) this;
        }

        public Criteria andYWgnewEqualTo(Float value) {
            addCriterion("y_wgnew =", value, "yWgnew");
            return (Criteria) this;
        }

        public Criteria andYWgnewNotEqualTo(Float value) {
            addCriterion("y_wgnew <>", value, "yWgnew");
            return (Criteria) this;
        }

        public Criteria andYWgnewGreaterThan(Float value) {
            addCriterion("y_wgnew >", value, "yWgnew");
            return (Criteria) this;
        }

        public Criteria andYWgnewGreaterThanOrEqualTo(Float value) {
            addCriterion("y_wgnew >=", value, "yWgnew");
            return (Criteria) this;
        }

        public Criteria andYWgnewLessThan(Float value) {
            addCriterion("y_wgnew <", value, "yWgnew");
            return (Criteria) this;
        }

        public Criteria andYWgnewLessThanOrEqualTo(Float value) {
            addCriterion("y_wgnew <=", value, "yWgnew");
            return (Criteria) this;
        }

        public Criteria andYWgnewIn(List<Float> values) {
            addCriterion("y_wgnew in", values, "yWgnew");
            return (Criteria) this;
        }

        public Criteria andYWgnewNotIn(List<Float> values) {
            addCriterion("y_wgnew not in", values, "yWgnew");
            return (Criteria) this;
        }

        public Criteria andYWgnewBetween(Float value1, Float value2) {
            addCriterion("y_wgnew between", value1, value2, "yWgnew");
            return (Criteria) this;
        }

        public Criteria andYWgnewNotBetween(Float value1, Float value2) {
            addCriterion("y_wgnew not between", value1, value2, "yWgnew");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sme_corp_water
     *
     * @mbggenerated do_not_delete_during_merge Tue Jul 26 11:06:57 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sme_corp_water
     *
     * @mbggenerated Tue Jul 26 11:06:57 CST 2016
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

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
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