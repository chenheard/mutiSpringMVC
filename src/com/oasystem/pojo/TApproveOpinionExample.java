package com.oasystem.pojo;

import java.util.ArrayList;
import java.util.List;

public class TApproveOpinionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TApproveOpinionExample() {
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

        public Criteria andCRequisitionIdIsNull() {
            addCriterion("C_REQUISITION_ID is null");
            return (Criteria) this;
        }

        public Criteria andCRequisitionIdIsNotNull() {
            addCriterion("C_REQUISITION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCRequisitionIdEqualTo(Integer value) {
            addCriterion("C_REQUISITION_ID =", value, "cRequisitionId");
            return (Criteria) this;
        }

        public Criteria andCRequisitionIdNotEqualTo(Integer value) {
            addCriterion("C_REQUISITION_ID <>", value, "cRequisitionId");
            return (Criteria) this;
        }

        public Criteria andCRequisitionIdGreaterThan(Integer value) {
            addCriterion("C_REQUISITION_ID >", value, "cRequisitionId");
            return (Criteria) this;
        }

        public Criteria andCRequisitionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_REQUISITION_ID >=", value, "cRequisitionId");
            return (Criteria) this;
        }

        public Criteria andCRequisitionIdLessThan(Integer value) {
            addCriterion("C_REQUISITION_ID <", value, "cRequisitionId");
            return (Criteria) this;
        }

        public Criteria andCRequisitionIdLessThanOrEqualTo(Integer value) {
            addCriterion("C_REQUISITION_ID <=", value, "cRequisitionId");
            return (Criteria) this;
        }

        public Criteria andCRequisitionIdIn(List<Integer> values) {
            addCriterion("C_REQUISITION_ID in", values, "cRequisitionId");
            return (Criteria) this;
        }

        public Criteria andCRequisitionIdNotIn(List<Integer> values) {
            addCriterion("C_REQUISITION_ID not in", values, "cRequisitionId");
            return (Criteria) this;
        }

        public Criteria andCRequisitionIdBetween(Integer value1, Integer value2) {
            addCriterion("C_REQUISITION_ID between", value1, value2, "cRequisitionId");
            return (Criteria) this;
        }

        public Criteria andCRequisitionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("C_REQUISITION_ID not between", value1, value2, "cRequisitionId");
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

        public Criteria andTDeptOpinionIsNull() {
            addCriterion("t_DEPT_OPINION is null");
            return (Criteria) this;
        }

        public Criteria andTDeptOpinionIsNotNull() {
            addCriterion("t_DEPT_OPINION is not null");
            return (Criteria) this;
        }

        public Criteria andTDeptOpinionEqualTo(String value) {
            addCriterion("t_DEPT_OPINION =", value, "tDeptOpinion");
            return (Criteria) this;
        }

        public Criteria andTDeptOpinionNotEqualTo(String value) {
            addCriterion("t_DEPT_OPINION <>", value, "tDeptOpinion");
            return (Criteria) this;
        }

        public Criteria andTDeptOpinionGreaterThan(String value) {
            addCriterion("t_DEPT_OPINION >", value, "tDeptOpinion");
            return (Criteria) this;
        }

        public Criteria andTDeptOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("t_DEPT_OPINION >=", value, "tDeptOpinion");
            return (Criteria) this;
        }

        public Criteria andTDeptOpinionLessThan(String value) {
            addCriterion("t_DEPT_OPINION <", value, "tDeptOpinion");
            return (Criteria) this;
        }

        public Criteria andTDeptOpinionLessThanOrEqualTo(String value) {
            addCriterion("t_DEPT_OPINION <=", value, "tDeptOpinion");
            return (Criteria) this;
        }

        public Criteria andTDeptOpinionLike(String value) {
            addCriterion("t_DEPT_OPINION like", value, "tDeptOpinion");
            return (Criteria) this;
        }

        public Criteria andTDeptOpinionNotLike(String value) {
            addCriterion("t_DEPT_OPINION not like", value, "tDeptOpinion");
            return (Criteria) this;
        }

        public Criteria andTDeptOpinionIn(List<String> values) {
            addCriterion("t_DEPT_OPINION in", values, "tDeptOpinion");
            return (Criteria) this;
        }

        public Criteria andTDeptOpinionNotIn(List<String> values) {
            addCriterion("t_DEPT_OPINION not in", values, "tDeptOpinion");
            return (Criteria) this;
        }

        public Criteria andTDeptOpinionBetween(String value1, String value2) {
            addCriterion("t_DEPT_OPINION between", value1, value2, "tDeptOpinion");
            return (Criteria) this;
        }

        public Criteria andTDeptOpinionNotBetween(String value1, String value2) {
            addCriterion("t_DEPT_OPINION not between", value1, value2, "tDeptOpinion");
            return (Criteria) this;
        }

        public Criteria andCFlagIsNull() {
            addCriterion("C_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andCFlagIsNotNull() {
            addCriterion("C_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andCFlagEqualTo(String value) {
            addCriterion("C_FLAG =", value, "cFlag");
            return (Criteria) this;
        }

        public Criteria andCFlagNotEqualTo(String value) {
            addCriterion("C_FLAG <>", value, "cFlag");
            return (Criteria) this;
        }

        public Criteria andCFlagGreaterThan(String value) {
            addCriterion("C_FLAG >", value, "cFlag");
            return (Criteria) this;
        }

        public Criteria andCFlagGreaterThanOrEqualTo(String value) {
            addCriterion("C_FLAG >=", value, "cFlag");
            return (Criteria) this;
        }

        public Criteria andCFlagLessThan(String value) {
            addCriterion("C_FLAG <", value, "cFlag");
            return (Criteria) this;
        }

        public Criteria andCFlagLessThanOrEqualTo(String value) {
            addCriterion("C_FLAG <=", value, "cFlag");
            return (Criteria) this;
        }

        public Criteria andCFlagLike(String value) {
            addCriterion("C_FLAG like", value, "cFlag");
            return (Criteria) this;
        }

        public Criteria andCFlagNotLike(String value) {
            addCriterion("C_FLAG not like", value, "cFlag");
            return (Criteria) this;
        }

        public Criteria andCFlagIn(List<String> values) {
            addCriterion("C_FLAG in", values, "cFlag");
            return (Criteria) this;
        }

        public Criteria andCFlagNotIn(List<String> values) {
            addCriterion("C_FLAG not in", values, "cFlag");
            return (Criteria) this;
        }

        public Criteria andCFlagBetween(String value1, String value2) {
            addCriterion("C_FLAG between", value1, value2, "cFlag");
            return (Criteria) this;
        }

        public Criteria andCFlagNotBetween(String value1, String value2) {
            addCriterion("C_FLAG not between", value1, value2, "cFlag");
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