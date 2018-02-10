package com.oasystem.pojo;

import java.util.ArrayList;
import java.util.List;

public class TDeptExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TDeptExample() {
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

        public Criteria andCDeptCodeIsNull() {
            addCriterion("C_DEPT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCDeptCodeIsNotNull() {
            addCriterion("C_DEPT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCDeptCodeEqualTo(String value) {
            addCriterion("C_DEPT_CODE =", value, "cDeptCode");
            return (Criteria) this;
        }

        public Criteria andCDeptCodeNotEqualTo(String value) {
            addCriterion("C_DEPT_CODE <>", value, "cDeptCode");
            return (Criteria) this;
        }

        public Criteria andCDeptCodeGreaterThan(String value) {
            addCriterion("C_DEPT_CODE >", value, "cDeptCode");
            return (Criteria) this;
        }

        public Criteria andCDeptCodeGreaterThanOrEqualTo(String value) {
            addCriterion("C_DEPT_CODE >=", value, "cDeptCode");
            return (Criteria) this;
        }

        public Criteria andCDeptCodeLessThan(String value) {
            addCriterion("C_DEPT_CODE <", value, "cDeptCode");
            return (Criteria) this;
        }

        public Criteria andCDeptCodeLessThanOrEqualTo(String value) {
            addCriterion("C_DEPT_CODE <=", value, "cDeptCode");
            return (Criteria) this;
        }

        public Criteria andCDeptCodeLike(String value) {
            addCriterion("C_DEPT_CODE like", value, "cDeptCode");
            return (Criteria) this;
        }

        public Criteria andCDeptCodeNotLike(String value) {
            addCriterion("C_DEPT_CODE not like", value, "cDeptCode");
            return (Criteria) this;
        }

        public Criteria andCDeptCodeIn(List<String> values) {
            addCriterion("C_DEPT_CODE in", values, "cDeptCode");
            return (Criteria) this;
        }

        public Criteria andCDeptCodeNotIn(List<String> values) {
            addCriterion("C_DEPT_CODE not in", values, "cDeptCode");
            return (Criteria) this;
        }

        public Criteria andCDeptCodeBetween(String value1, String value2) {
            addCriterion("C_DEPT_CODE between", value1, value2, "cDeptCode");
            return (Criteria) this;
        }

        public Criteria andCDeptCodeNotBetween(String value1, String value2) {
            addCriterion("C_DEPT_CODE not between", value1, value2, "cDeptCode");
            return (Criteria) this;
        }

        public Criteria andCDeptNameIsNull() {
            addCriterion("C_DEPT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCDeptNameIsNotNull() {
            addCriterion("C_DEPT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCDeptNameEqualTo(String value) {
            addCriterion("C_DEPT_NAME =", value, "cDeptName");
            return (Criteria) this;
        }

        public Criteria andCDeptNameNotEqualTo(String value) {
            addCriterion("C_DEPT_NAME <>", value, "cDeptName");
            return (Criteria) this;
        }

        public Criteria andCDeptNameGreaterThan(String value) {
            addCriterion("C_DEPT_NAME >", value, "cDeptName");
            return (Criteria) this;
        }

        public Criteria andCDeptNameGreaterThanOrEqualTo(String value) {
            addCriterion("C_DEPT_NAME >=", value, "cDeptName");
            return (Criteria) this;
        }

        public Criteria andCDeptNameLessThan(String value) {
            addCriterion("C_DEPT_NAME <", value, "cDeptName");
            return (Criteria) this;
        }

        public Criteria andCDeptNameLessThanOrEqualTo(String value) {
            addCriterion("C_DEPT_NAME <=", value, "cDeptName");
            return (Criteria) this;
        }

        public Criteria andCDeptNameLike(String value) {
            addCriterion("C_DEPT_NAME like", value, "cDeptName");
            return (Criteria) this;
        }

        public Criteria andCDeptNameNotLike(String value) {
            addCriterion("C_DEPT_NAME not like", value, "cDeptName");
            return (Criteria) this;
        }

        public Criteria andCDeptNameIn(List<String> values) {
            addCriterion("C_DEPT_NAME in", values, "cDeptName");
            return (Criteria) this;
        }

        public Criteria andCDeptNameNotIn(List<String> values) {
            addCriterion("C_DEPT_NAME not in", values, "cDeptName");
            return (Criteria) this;
        }

        public Criteria andCDeptNameBetween(String value1, String value2) {
            addCriterion("C_DEPT_NAME between", value1, value2, "cDeptName");
            return (Criteria) this;
        }

        public Criteria andCDeptNameNotBetween(String value1, String value2) {
            addCriterion("C_DEPT_NAME not between", value1, value2, "cDeptName");
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