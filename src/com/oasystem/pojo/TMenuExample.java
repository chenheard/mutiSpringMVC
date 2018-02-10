package com.oasystem.pojo;

import java.util.ArrayList;
import java.util.List;

public class TMenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TMenuExample() {
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

        public Criteria andCDescriptionIsNull() {
            addCriterion("C_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andCDescriptionIsNotNull() {
            addCriterion("C_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andCDescriptionEqualTo(String value) {
            addCriterion("C_DESCRIPTION =", value, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCDescriptionNotEqualTo(String value) {
            addCriterion("C_DESCRIPTION <>", value, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCDescriptionGreaterThan(String value) {
            addCriterion("C_DESCRIPTION >", value, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("C_DESCRIPTION >=", value, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCDescriptionLessThan(String value) {
            addCriterion("C_DESCRIPTION <", value, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCDescriptionLessThanOrEqualTo(String value) {
            addCriterion("C_DESCRIPTION <=", value, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCDescriptionLike(String value) {
            addCriterion("C_DESCRIPTION like", value, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCDescriptionNotLike(String value) {
            addCriterion("C_DESCRIPTION not like", value, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCDescriptionIn(List<String> values) {
            addCriterion("C_DESCRIPTION in", values, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCDescriptionNotIn(List<String> values) {
            addCriterion("C_DESCRIPTION not in", values, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCDescriptionBetween(String value1, String value2) {
            addCriterion("C_DESCRIPTION between", value1, value2, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCDescriptionNotBetween(String value1, String value2) {
            addCriterion("C_DESCRIPTION not between", value1, value2, "cDescription");
            return (Criteria) this;
        }

        public Criteria andCNameIsNull() {
            addCriterion("C_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCNameIsNotNull() {
            addCriterion("C_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCNameEqualTo(String value) {
            addCriterion("C_NAME =", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotEqualTo(String value) {
            addCriterion("C_NAME <>", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThan(String value) {
            addCriterion("C_NAME >", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThanOrEqualTo(String value) {
            addCriterion("C_NAME >=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThan(String value) {
            addCriterion("C_NAME <", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThanOrEqualTo(String value) {
            addCriterion("C_NAME <=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLike(String value) {
            addCriterion("C_NAME like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotLike(String value) {
            addCriterion("C_NAME not like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameIn(List<String> values) {
            addCriterion("C_NAME in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotIn(List<String> values) {
            addCriterion("C_NAME not in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameBetween(String value1, String value2) {
            addCriterion("C_NAME between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotBetween(String value1, String value2) {
            addCriterion("C_NAME not between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andCPageIsNull() {
            addCriterion("C_PAGE is null");
            return (Criteria) this;
        }

        public Criteria andCPageIsNotNull() {
            addCriterion("C_PAGE is not null");
            return (Criteria) this;
        }

        public Criteria andCPageEqualTo(String value) {
            addCriterion("C_PAGE =", value, "cPage");
            return (Criteria) this;
        }

        public Criteria andCPageNotEqualTo(String value) {
            addCriterion("C_PAGE <>", value, "cPage");
            return (Criteria) this;
        }

        public Criteria andCPageGreaterThan(String value) {
            addCriterion("C_PAGE >", value, "cPage");
            return (Criteria) this;
        }

        public Criteria andCPageGreaterThanOrEqualTo(String value) {
            addCriterion("C_PAGE >=", value, "cPage");
            return (Criteria) this;
        }

        public Criteria andCPageLessThan(String value) {
            addCriterion("C_PAGE <", value, "cPage");
            return (Criteria) this;
        }

        public Criteria andCPageLessThanOrEqualTo(String value) {
            addCriterion("C_PAGE <=", value, "cPage");
            return (Criteria) this;
        }

        public Criteria andCPageLike(String value) {
            addCriterion("C_PAGE like", value, "cPage");
            return (Criteria) this;
        }

        public Criteria andCPageNotLike(String value) {
            addCriterion("C_PAGE not like", value, "cPage");
            return (Criteria) this;
        }

        public Criteria andCPageIn(List<String> values) {
            addCriterion("C_PAGE in", values, "cPage");
            return (Criteria) this;
        }

        public Criteria andCPageNotIn(List<String> values) {
            addCriterion("C_PAGE not in", values, "cPage");
            return (Criteria) this;
        }

        public Criteria andCPageBetween(String value1, String value2) {
            addCriterion("C_PAGE between", value1, value2, "cPage");
            return (Criteria) this;
        }

        public Criteria andCPageNotBetween(String value1, String value2) {
            addCriterion("C_PAGE not between", value1, value2, "cPage");
            return (Criteria) this;
        }

        public Criteria andCPriorityIsNull() {
            addCriterion("C_PRIORITY is null");
            return (Criteria) this;
        }

        public Criteria andCPriorityIsNotNull() {
            addCriterion("C_PRIORITY is not null");
            return (Criteria) this;
        }

        public Criteria andCPriorityEqualTo(Integer value) {
            addCriterion("C_PRIORITY =", value, "cPriority");
            return (Criteria) this;
        }

        public Criteria andCPriorityNotEqualTo(Integer value) {
            addCriterion("C_PRIORITY <>", value, "cPriority");
            return (Criteria) this;
        }

        public Criteria andCPriorityGreaterThan(Integer value) {
            addCriterion("C_PRIORITY >", value, "cPriority");
            return (Criteria) this;
        }

        public Criteria andCPriorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_PRIORITY >=", value, "cPriority");
            return (Criteria) this;
        }

        public Criteria andCPriorityLessThan(Integer value) {
            addCriterion("C_PRIORITY <", value, "cPriority");
            return (Criteria) this;
        }

        public Criteria andCPriorityLessThanOrEqualTo(Integer value) {
            addCriterion("C_PRIORITY <=", value, "cPriority");
            return (Criteria) this;
        }

        public Criteria andCPriorityIn(List<Integer> values) {
            addCriterion("C_PRIORITY in", values, "cPriority");
            return (Criteria) this;
        }

        public Criteria andCPriorityNotIn(List<Integer> values) {
            addCriterion("C_PRIORITY not in", values, "cPriority");
            return (Criteria) this;
        }

        public Criteria andCPriorityBetween(Integer value1, Integer value2) {
            addCriterion("C_PRIORITY between", value1, value2, "cPriority");
            return (Criteria) this;
        }

        public Criteria andCPriorityNotBetween(Integer value1, Integer value2) {
            addCriterion("C_PRIORITY not between", value1, value2, "cPriority");
            return (Criteria) this;
        }

        public Criteria andCPidIsNull() {
            addCriterion("C_PID is null");
            return (Criteria) this;
        }

        public Criteria andCPidIsNotNull() {
            addCriterion("C_PID is not null");
            return (Criteria) this;
        }

        public Criteria andCPidEqualTo(Integer value) {
            addCriterion("C_PID =", value, "cPid");
            return (Criteria) this;
        }

        public Criteria andCPidNotEqualTo(Integer value) {
            addCriterion("C_PID <>", value, "cPid");
            return (Criteria) this;
        }

        public Criteria andCPidGreaterThan(Integer value) {
            addCriterion("C_PID >", value, "cPid");
            return (Criteria) this;
        }

        public Criteria andCPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_PID >=", value, "cPid");
            return (Criteria) this;
        }

        public Criteria andCPidLessThan(Integer value) {
            addCriterion("C_PID <", value, "cPid");
            return (Criteria) this;
        }

        public Criteria andCPidLessThanOrEqualTo(Integer value) {
            addCriterion("C_PID <=", value, "cPid");
            return (Criteria) this;
        }

        public Criteria andCPidIn(List<Integer> values) {
            addCriterion("C_PID in", values, "cPid");
            return (Criteria) this;
        }

        public Criteria andCPidNotIn(List<Integer> values) {
            addCriterion("C_PID not in", values, "cPid");
            return (Criteria) this;
        }

        public Criteria andCPidBetween(Integer value1, Integer value2) {
            addCriterion("C_PID between", value1, value2, "cPid");
            return (Criteria) this;
        }

        public Criteria andCPidNotBetween(Integer value1, Integer value2) {
            addCriterion("C_PID not between", value1, value2, "cPid");
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