package com.oasystem.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TTmpltExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TTmpltExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andCIdIsNull() {
            addCriterion("C_ID is null");
            return (Criteria) this;
        }

        public Criteria andCIdIsNotNull() {
            addCriterion("C_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCIdEqualTo(Integer value) {
            addCriterion("C_ID =", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotEqualTo(Integer value) {
            addCriterion("C_ID <>", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThan(Integer value) {
            addCriterion("C_ID >", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_ID >=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThan(Integer value) {
            addCriterion("C_ID <", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThanOrEqualTo(Integer value) {
            addCriterion("C_ID <=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdIn(List<Integer> values) {
            addCriterion("C_ID in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotIn(List<Integer> values) {
            addCriterion("C_ID not in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdBetween(Integer value1, Integer value2) {
            addCriterion("C_ID between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotBetween(Integer value1, Integer value2) {
            addCriterion("C_ID not between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCTempNameIsNull() {
            addCriterion("C_TEMP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCTempNameIsNotNull() {
            addCriterion("C_TEMP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCTempNameEqualTo(String value) {
            addCriterion("C_TEMP_NAME =", value, "cTempName");
            return (Criteria) this;
        }

        public Criteria andCTempNameNotEqualTo(String value) {
            addCriterion("C_TEMP_NAME <>", value, "cTempName");
            return (Criteria) this;
        }

        public Criteria andCTempNameGreaterThan(String value) {
            addCriterion("C_TEMP_NAME >", value, "cTempName");
            return (Criteria) this;
        }

        public Criteria andCTempNameGreaterThanOrEqualTo(String value) {
            addCriterion("C_TEMP_NAME >=", value, "cTempName");
            return (Criteria) this;
        }

        public Criteria andCTempNameLessThan(String value) {
            addCriterion("C_TEMP_NAME <", value, "cTempName");
            return (Criteria) this;
        }

        public Criteria andCTempNameLessThanOrEqualTo(String value) {
            addCriterion("C_TEMP_NAME <=", value, "cTempName");
            return (Criteria) this;
        }

        public Criteria andCTempNameLike(String value) {
            addCriterion("C_TEMP_NAME like", value, "cTempName");
            return (Criteria) this;
        }

        public Criteria andCTempNameNotLike(String value) {
            addCriterion("C_TEMP_NAME not like", value, "cTempName");
            return (Criteria) this;
        }

        public Criteria andCTempNameIn(List<String> values) {
            addCriterion("C_TEMP_NAME in", values, "cTempName");
            return (Criteria) this;
        }

        public Criteria andCTempNameNotIn(List<String> values) {
            addCriterion("C_TEMP_NAME not in", values, "cTempName");
            return (Criteria) this;
        }

        public Criteria andCTempNameBetween(String value1, String value2) {
            addCriterion("C_TEMP_NAME between", value1, value2, "cTempName");
            return (Criteria) this;
        }

        public Criteria andCTempNameNotBetween(String value1, String value2) {
            addCriterion("C_TEMP_NAME not between", value1, value2, "cTempName");
            return (Criteria) this;
        }

        public Criteria andCSubmitDeptIsNull() {
            addCriterion("C_SUBMIT_DEPT is null");
            return (Criteria) this;
        }

        public Criteria andCSubmitDeptIsNotNull() {
            addCriterion("C_SUBMIT_DEPT is not null");
            return (Criteria) this;
        }

        public Criteria andCSubmitDeptEqualTo(String value) {
            addCriterion("C_SUBMIT_DEPT =", value, "cSubmitDept");
            return (Criteria) this;
        }

        public Criteria andCSubmitDeptNotEqualTo(String value) {
            addCriterion("C_SUBMIT_DEPT <>", value, "cSubmitDept");
            return (Criteria) this;
        }

        public Criteria andCSubmitDeptGreaterThan(String value) {
            addCriterion("C_SUBMIT_DEPT >", value, "cSubmitDept");
            return (Criteria) this;
        }

        public Criteria andCSubmitDeptGreaterThanOrEqualTo(String value) {
            addCriterion("C_SUBMIT_DEPT >=", value, "cSubmitDept");
            return (Criteria) this;
        }

        public Criteria andCSubmitDeptLessThan(String value) {
            addCriterion("C_SUBMIT_DEPT <", value, "cSubmitDept");
            return (Criteria) this;
        }

        public Criteria andCSubmitDeptLessThanOrEqualTo(String value) {
            addCriterion("C_SUBMIT_DEPT <=", value, "cSubmitDept");
            return (Criteria) this;
        }

        public Criteria andCSubmitDeptLike(String value) {
            addCriterion("C_SUBMIT_DEPT like", value, "cSubmitDept");
            return (Criteria) this;
        }

        public Criteria andCSubmitDeptNotLike(String value) {
            addCriterion("C_SUBMIT_DEPT not like", value, "cSubmitDept");
            return (Criteria) this;
        }

        public Criteria andCSubmitDeptIn(List<String> values) {
            addCriterion("C_SUBMIT_DEPT in", values, "cSubmitDept");
            return (Criteria) this;
        }

        public Criteria andCSubmitDeptNotIn(List<String> values) {
            addCriterion("C_SUBMIT_DEPT not in", values, "cSubmitDept");
            return (Criteria) this;
        }

        public Criteria andCSubmitDeptBetween(String value1, String value2) {
            addCriterion("C_SUBMIT_DEPT between", value1, value2, "cSubmitDept");
            return (Criteria) this;
        }

        public Criteria andCSubmitDeptNotBetween(String value1, String value2) {
            addCriterion("C_SUBMIT_DEPT not between", value1, value2, "cSubmitDept");
            return (Criteria) this;
        }

        public Criteria andCSubmitDateIsNull() {
            addCriterion("C_SUBMIT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCSubmitDateIsNotNull() {
            addCriterion("C_SUBMIT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCSubmitDateEqualTo(Date value) {
            addCriterion("C_SUBMIT_DATE =", value, "cSubmitDate");
            return (Criteria) this;
        }

        public Criteria andCSubmitDateNotEqualTo(Date value) {
            addCriterion("C_SUBMIT_DATE <>", value, "cSubmitDate");
            return (Criteria) this;
        }

        public Criteria andCSubmitDateGreaterThan(Date value) {
            addCriterion("C_SUBMIT_DATE >", value, "cSubmitDate");
            return (Criteria) this;
        }

        public Criteria andCSubmitDateGreaterThanOrEqualTo(Date value) {
            addCriterion("C_SUBMIT_DATE >=", value, "cSubmitDate");
            return (Criteria) this;
        }

        public Criteria andCSubmitDateLessThan(Date value) {
            addCriterion("C_SUBMIT_DATE <", value, "cSubmitDate");
            return (Criteria) this;
        }

        public Criteria andCSubmitDateLessThanOrEqualTo(Date value) {
            addCriterion("C_SUBMIT_DATE <=", value, "cSubmitDate");
            return (Criteria) this;
        }

        public Criteria andCSubmitDateIn(List<Date> values) {
            addCriterion("C_SUBMIT_DATE in", values, "cSubmitDate");
            return (Criteria) this;
        }

        public Criteria andCSubmitDateNotIn(List<Date> values) {
            addCriterion("C_SUBMIT_DATE not in", values, "cSubmitDate");
            return (Criteria) this;
        }

        public Criteria andCSubmitDateBetween(Date value1, Date value2) {
            addCriterion("C_SUBMIT_DATE between", value1, value2, "cSubmitDate");
            return (Criteria) this;
        }

        public Criteria andCSubmitDateNotBetween(Date value1, Date value2) {
            addCriterion("C_SUBMIT_DATE not between", value1, value2, "cSubmitDate");
            return (Criteria) this;
        }

        public Criteria andCApproveDept1IsNull() {
            addCriterion("C_APPROVE_DEPT_1 is null");
            return (Criteria) this;
        }

        public Criteria andCApproveDept1IsNotNull() {
            addCriterion("C_APPROVE_DEPT_1 is not null");
            return (Criteria) this;
        }

        public Criteria andCApproveDept1EqualTo(String value) {
            addCriterion("C_APPROVE_DEPT_1 =", value, "cApproveDept1");
            return (Criteria) this;
        }

        public Criteria andCApproveDept1NotEqualTo(String value) {
            addCriterion("C_APPROVE_DEPT_1 <>", value, "cApproveDept1");
            return (Criteria) this;
        }

        public Criteria andCApproveDept1GreaterThan(String value) {
            addCriterion("C_APPROVE_DEPT_1 >", value, "cApproveDept1");
            return (Criteria) this;
        }

        public Criteria andCApproveDept1GreaterThanOrEqualTo(String value) {
            addCriterion("C_APPROVE_DEPT_1 >=", value, "cApproveDept1");
            return (Criteria) this;
        }

        public Criteria andCApproveDept1LessThan(String value) {
            addCriterion("C_APPROVE_DEPT_1 <", value, "cApproveDept1");
            return (Criteria) this;
        }

        public Criteria andCApproveDept1LessThanOrEqualTo(String value) {
            addCriterion("C_APPROVE_DEPT_1 <=", value, "cApproveDept1");
            return (Criteria) this;
        }

        public Criteria andCApproveDept1Like(String value) {
            addCriterion("C_APPROVE_DEPT_1 like", value, "cApproveDept1");
            return (Criteria) this;
        }

        public Criteria andCApproveDept1NotLike(String value) {
            addCriterion("C_APPROVE_DEPT_1 not like", value, "cApproveDept1");
            return (Criteria) this;
        }

        public Criteria andCApproveDept1In(List<String> values) {
            addCriterion("C_APPROVE_DEPT_1 in", values, "cApproveDept1");
            return (Criteria) this;
        }

        public Criteria andCApproveDept1NotIn(List<String> values) {
            addCriterion("C_APPROVE_DEPT_1 not in", values, "cApproveDept1");
            return (Criteria) this;
        }

        public Criteria andCApproveDept1Between(String value1, String value2) {
            addCriterion("C_APPROVE_DEPT_1 between", value1, value2, "cApproveDept1");
            return (Criteria) this;
        }

        public Criteria andCApproveDept1NotBetween(String value1, String value2) {
            addCriterion("C_APPROVE_DEPT_1 not between", value1, value2, "cApproveDept1");
            return (Criteria) this;
        }

        public Criteria andCApproveDept2IsNull() {
            addCriterion("C_APPROVE_DEPT_2 is null");
            return (Criteria) this;
        }

        public Criteria andCApproveDept2IsNotNull() {
            addCriterion("C_APPROVE_DEPT_2 is not null");
            return (Criteria) this;
        }

        public Criteria andCApproveDept2EqualTo(String value) {
            addCriterion("C_APPROVE_DEPT_2 =", value, "cApproveDept2");
            return (Criteria) this;
        }

        public Criteria andCApproveDept2NotEqualTo(String value) {
            addCriterion("C_APPROVE_DEPT_2 <>", value, "cApproveDept2");
            return (Criteria) this;
        }

        public Criteria andCApproveDept2GreaterThan(String value) {
            addCriterion("C_APPROVE_DEPT_2 >", value, "cApproveDept2");
            return (Criteria) this;
        }

        public Criteria andCApproveDept2GreaterThanOrEqualTo(String value) {
            addCriterion("C_APPROVE_DEPT_2 >=", value, "cApproveDept2");
            return (Criteria) this;
        }

        public Criteria andCApproveDept2LessThan(String value) {
            addCriterion("C_APPROVE_DEPT_2 <", value, "cApproveDept2");
            return (Criteria) this;
        }

        public Criteria andCApproveDept2LessThanOrEqualTo(String value) {
            addCriterion("C_APPROVE_DEPT_2 <=", value, "cApproveDept2");
            return (Criteria) this;
        }

        public Criteria andCApproveDept2Like(String value) {
            addCriterion("C_APPROVE_DEPT_2 like", value, "cApproveDept2");
            return (Criteria) this;
        }

        public Criteria andCApproveDept2NotLike(String value) {
            addCriterion("C_APPROVE_DEPT_2 not like", value, "cApproveDept2");
            return (Criteria) this;
        }

        public Criteria andCApproveDept2In(List<String> values) {
            addCriterion("C_APPROVE_DEPT_2 in", values, "cApproveDept2");
            return (Criteria) this;
        }

        public Criteria andCApproveDept2NotIn(List<String> values) {
            addCriterion("C_APPROVE_DEPT_2 not in", values, "cApproveDept2");
            return (Criteria) this;
        }

        public Criteria andCApproveDept2Between(String value1, String value2) {
            addCriterion("C_APPROVE_DEPT_2 between", value1, value2, "cApproveDept2");
            return (Criteria) this;
        }

        public Criteria andCApproveDept2NotBetween(String value1, String value2) {
            addCriterion("C_APPROVE_DEPT_2 not between", value1, value2, "cApproveDept2");
            return (Criteria) this;
        }

        public Criteria andCApproveDept3IsNull() {
            addCriterion("C_APPROVE_DEPT_3 is null");
            return (Criteria) this;
        }

        public Criteria andCApproveDept3IsNotNull() {
            addCriterion("C_APPROVE_DEPT_3 is not null");
            return (Criteria) this;
        }

        public Criteria andCApproveDept3EqualTo(String value) {
            addCriterion("C_APPROVE_DEPT_3 =", value, "cApproveDept3");
            return (Criteria) this;
        }

        public Criteria andCApproveDept3NotEqualTo(String value) {
            addCriterion("C_APPROVE_DEPT_3 <>", value, "cApproveDept3");
            return (Criteria) this;
        }

        public Criteria andCApproveDept3GreaterThan(String value) {
            addCriterion("C_APPROVE_DEPT_3 >", value, "cApproveDept3");
            return (Criteria) this;
        }

        public Criteria andCApproveDept3GreaterThanOrEqualTo(String value) {
            addCriterion("C_APPROVE_DEPT_3 >=", value, "cApproveDept3");
            return (Criteria) this;
        }

        public Criteria andCApproveDept3LessThan(String value) {
            addCriterion("C_APPROVE_DEPT_3 <", value, "cApproveDept3");
            return (Criteria) this;
        }

        public Criteria andCApproveDept3LessThanOrEqualTo(String value) {
            addCriterion("C_APPROVE_DEPT_3 <=", value, "cApproveDept3");
            return (Criteria) this;
        }

        public Criteria andCApproveDept3Like(String value) {
            addCriterion("C_APPROVE_DEPT_3 like", value, "cApproveDept3");
            return (Criteria) this;
        }

        public Criteria andCApproveDept3NotLike(String value) {
            addCriterion("C_APPROVE_DEPT_3 not like", value, "cApproveDept3");
            return (Criteria) this;
        }

        public Criteria andCApproveDept3In(List<String> values) {
            addCriterion("C_APPROVE_DEPT_3 in", values, "cApproveDept3");
            return (Criteria) this;
        }

        public Criteria andCApproveDept3NotIn(List<String> values) {
            addCriterion("C_APPROVE_DEPT_3 not in", values, "cApproveDept3");
            return (Criteria) this;
        }

        public Criteria andCApproveDept3Between(String value1, String value2) {
            addCriterion("C_APPROVE_DEPT_3 between", value1, value2, "cApproveDept3");
            return (Criteria) this;
        }

        public Criteria andCApproveDept3NotBetween(String value1, String value2) {
            addCriterion("C_APPROVE_DEPT_3 not between", value1, value2, "cApproveDept3");
            return (Criteria) this;
        }

        public Criteria andCApproveDept4IsNull() {
            addCriterion("C_APPROVE_DEPT_4 is null");
            return (Criteria) this;
        }

        public Criteria andCApproveDept4IsNotNull() {
            addCriterion("C_APPROVE_DEPT_4 is not null");
            return (Criteria) this;
        }

        public Criteria andCApproveDept4EqualTo(String value) {
            addCriterion("C_APPROVE_DEPT_4 =", value, "cApproveDept4");
            return (Criteria) this;
        }

        public Criteria andCApproveDept4NotEqualTo(String value) {
            addCriterion("C_APPROVE_DEPT_4 <>", value, "cApproveDept4");
            return (Criteria) this;
        }

        public Criteria andCApproveDept4GreaterThan(String value) {
            addCriterion("C_APPROVE_DEPT_4 >", value, "cApproveDept4");
            return (Criteria) this;
        }

        public Criteria andCApproveDept4GreaterThanOrEqualTo(String value) {
            addCriterion("C_APPROVE_DEPT_4 >=", value, "cApproveDept4");
            return (Criteria) this;
        }

        public Criteria andCApproveDept4LessThan(String value) {
            addCriterion("C_APPROVE_DEPT_4 <", value, "cApproveDept4");
            return (Criteria) this;
        }

        public Criteria andCApproveDept4LessThanOrEqualTo(String value) {
            addCriterion("C_APPROVE_DEPT_4 <=", value, "cApproveDept4");
            return (Criteria) this;
        }

        public Criteria andCApproveDept4Like(String value) {
            addCriterion("C_APPROVE_DEPT_4 like", value, "cApproveDept4");
            return (Criteria) this;
        }

        public Criteria andCApproveDept4NotLike(String value) {
            addCriterion("C_APPROVE_DEPT_4 not like", value, "cApproveDept4");
            return (Criteria) this;
        }

        public Criteria andCApproveDept4In(List<String> values) {
            addCriterion("C_APPROVE_DEPT_4 in", values, "cApproveDept4");
            return (Criteria) this;
        }

        public Criteria andCApproveDept4NotIn(List<String> values) {
            addCriterion("C_APPROVE_DEPT_4 not in", values, "cApproveDept4");
            return (Criteria) this;
        }

        public Criteria andCApproveDept4Between(String value1, String value2) {
            addCriterion("C_APPROVE_DEPT_4 between", value1, value2, "cApproveDept4");
            return (Criteria) this;
        }

        public Criteria andCApproveDept4NotBetween(String value1, String value2) {
            addCriterion("C_APPROVE_DEPT_4 not between", value1, value2, "cApproveDept4");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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