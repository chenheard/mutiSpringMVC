package com.oasystem.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TUserExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCAgeIsNull() {
            addCriterion("C_AGE is null");
            return (Criteria) this;
        }

        public Criteria andCAgeIsNotNull() {
            addCriterion("C_AGE is not null");
            return (Criteria) this;
        }

        public Criteria andCAgeEqualTo(Integer value) {
            addCriterion("C_AGE =", value, "cAge");
            return (Criteria) this;
        }

        public Criteria andCAgeNotEqualTo(Integer value) {
            addCriterion("C_AGE <>", value, "cAge");
            return (Criteria) this;
        }

        public Criteria andCAgeGreaterThan(Integer value) {
            addCriterion("C_AGE >", value, "cAge");
            return (Criteria) this;
        }

        public Criteria andCAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_AGE >=", value, "cAge");
            return (Criteria) this;
        }

        public Criteria andCAgeLessThan(Integer value) {
            addCriterion("C_AGE <", value, "cAge");
            return (Criteria) this;
        }

        public Criteria andCAgeLessThanOrEqualTo(Integer value) {
            addCriterion("C_AGE <=", value, "cAge");
            return (Criteria) this;
        }

        public Criteria andCAgeIn(List<Integer> values) {
            addCriterion("C_AGE in", values, "cAge");
            return (Criteria) this;
        }

        public Criteria andCAgeNotIn(List<Integer> values) {
            addCriterion("C_AGE not in", values, "cAge");
            return (Criteria) this;
        }

        public Criteria andCAgeBetween(Integer value1, Integer value2) {
            addCriterion("C_AGE between", value1, value2, "cAge");
            return (Criteria) this;
        }

        public Criteria andCAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("C_AGE not between", value1, value2, "cAge");
            return (Criteria) this;
        }

        public Criteria andCSalaryIsNull() {
            addCriterion("C_SALARY is null");
            return (Criteria) this;
        }

        public Criteria andCSalaryIsNotNull() {
            addCriterion("C_SALARY is not null");
            return (Criteria) this;
        }

        public Criteria andCSalaryEqualTo(String value) {
            addCriterion("C_SALARY =", value, "cSalary");
            return (Criteria) this;
        }

        public Criteria andCSalaryNotEqualTo(String value) {
            addCriterion("C_SALARY <>", value, "cSalary");
            return (Criteria) this;
        }

        public Criteria andCSalaryGreaterThan(String value) {
            addCriterion("C_SALARY >", value, "cSalary");
            return (Criteria) this;
        }

        public Criteria andCSalaryGreaterThanOrEqualTo(String value) {
            addCriterion("C_SALARY >=", value, "cSalary");
            return (Criteria) this;
        }

        public Criteria andCSalaryLessThan(String value) {
            addCriterion("C_SALARY <", value, "cSalary");
            return (Criteria) this;
        }

        public Criteria andCSalaryLessThanOrEqualTo(String value) {
            addCriterion("C_SALARY <=", value, "cSalary");
            return (Criteria) this;
        }

        public Criteria andCSalaryLike(String value) {
            addCriterion("C_SALARY like", value, "cSalary");
            return (Criteria) this;
        }

        public Criteria andCSalaryNotLike(String value) {
            addCriterion("C_SALARY not like", value, "cSalary");
            return (Criteria) this;
        }

        public Criteria andCSalaryIn(List<String> values) {
            addCriterion("C_SALARY in", values, "cSalary");
            return (Criteria) this;
        }

        public Criteria andCSalaryNotIn(List<String> values) {
            addCriterion("C_SALARY not in", values, "cSalary");
            return (Criteria) this;
        }

        public Criteria andCSalaryBetween(String value1, String value2) {
            addCriterion("C_SALARY between", value1, value2, "cSalary");
            return (Criteria) this;
        }

        public Criteria andCSalaryNotBetween(String value1, String value2) {
            addCriterion("C_SALARY not between", value1, value2, "cSalary");
            return (Criteria) this;
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

        public Criteria andCBirthdayIsNull() {
            addCriterion("C_BIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andCBirthdayIsNotNull() {
            addCriterion("C_BIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andCBirthdayEqualTo(Date value) {
            addCriterion("C_BIRTHDAY =", value, "cBirthday");
            return (Criteria) this;
        }

        public Criteria andCBirthdayNotEqualTo(Date value) {
            addCriterion("C_BIRTHDAY <>", value, "cBirthday");
            return (Criteria) this;
        }

        public Criteria andCBirthdayGreaterThan(Date value) {
            addCriterion("C_BIRTHDAY >", value, "cBirthday");
            return (Criteria) this;
        }

        public Criteria andCBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("C_BIRTHDAY >=", value, "cBirthday");
            return (Criteria) this;
        }

        public Criteria andCBirthdayLessThan(Date value) {
            addCriterion("C_BIRTHDAY <", value, "cBirthday");
            return (Criteria) this;
        }

        public Criteria andCBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("C_BIRTHDAY <=", value, "cBirthday");
            return (Criteria) this;
        }

        public Criteria andCBirthdayIn(List<Date> values) {
            addCriterion("C_BIRTHDAY in", values, "cBirthday");
            return (Criteria) this;
        }

        public Criteria andCBirthdayNotIn(List<Date> values) {
            addCriterion("C_BIRTHDAY not in", values, "cBirthday");
            return (Criteria) this;
        }

        public Criteria andCBirthdayBetween(Date value1, Date value2) {
            addCriterion("C_BIRTHDAY between", value1, value2, "cBirthday");
            return (Criteria) this;
        }

        public Criteria andCBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("C_BIRTHDAY not between", value1, value2, "cBirthday");
            return (Criteria) this;
        }

        public Criteria andCGenderIsNull() {
            addCriterion("C_GENDER is null");
            return (Criteria) this;
        }

        public Criteria andCGenderIsNotNull() {
            addCriterion("C_GENDER is not null");
            return (Criteria) this;
        }

        public Criteria andCGenderEqualTo(String value) {
            addCriterion("C_GENDER =", value, "cGender");
            return (Criteria) this;
        }

        public Criteria andCGenderNotEqualTo(String value) {
            addCriterion("C_GENDER <>", value, "cGender");
            return (Criteria) this;
        }

        public Criteria andCGenderGreaterThan(String value) {
            addCriterion("C_GENDER >", value, "cGender");
            return (Criteria) this;
        }

        public Criteria andCGenderGreaterThanOrEqualTo(String value) {
            addCriterion("C_GENDER >=", value, "cGender");
            return (Criteria) this;
        }

        public Criteria andCGenderLessThan(String value) {
            addCriterion("C_GENDER <", value, "cGender");
            return (Criteria) this;
        }

        public Criteria andCGenderLessThanOrEqualTo(String value) {
            addCriterion("C_GENDER <=", value, "cGender");
            return (Criteria) this;
        }

        public Criteria andCGenderLike(String value) {
            addCriterion("C_GENDER like", value, "cGender");
            return (Criteria) this;
        }

        public Criteria andCGenderNotLike(String value) {
            addCriterion("C_GENDER not like", value, "cGender");
            return (Criteria) this;
        }

        public Criteria andCGenderIn(List<String> values) {
            addCriterion("C_GENDER in", values, "cGender");
            return (Criteria) this;
        }

        public Criteria andCGenderNotIn(List<String> values) {
            addCriterion("C_GENDER not in", values, "cGender");
            return (Criteria) this;
        }

        public Criteria andCGenderBetween(String value1, String value2) {
            addCriterion("C_GENDER between", value1, value2, "cGender");
            return (Criteria) this;
        }

        public Criteria andCGenderNotBetween(String value1, String value2) {
            addCriterion("C_GENDER not between", value1, value2, "cGender");
            return (Criteria) this;
        }

        public Criteria andCNicknameIsNull() {
            addCriterion("C_NICKNAME is null");
            return (Criteria) this;
        }

        public Criteria andCNicknameIsNotNull() {
            addCriterion("C_NICKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCNicknameEqualTo(String value) {
            addCriterion("C_NICKNAME =", value, "cNickname");
            return (Criteria) this;
        }

        public Criteria andCNicknameNotEqualTo(String value) {
            addCriterion("C_NICKNAME <>", value, "cNickname");
            return (Criteria) this;
        }

        public Criteria andCNicknameGreaterThan(String value) {
            addCriterion("C_NICKNAME >", value, "cNickname");
            return (Criteria) this;
        }

        public Criteria andCNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("C_NICKNAME >=", value, "cNickname");
            return (Criteria) this;
        }

        public Criteria andCNicknameLessThan(String value) {
            addCriterion("C_NICKNAME <", value, "cNickname");
            return (Criteria) this;
        }

        public Criteria andCNicknameLessThanOrEqualTo(String value) {
            addCriterion("C_NICKNAME <=", value, "cNickname");
            return (Criteria) this;
        }

        public Criteria andCNicknameLike(String value) {
            addCriterion("C_NICKNAME like", value, "cNickname");
            return (Criteria) this;
        }

        public Criteria andCNicknameNotLike(String value) {
            addCriterion("C_NICKNAME not like", value, "cNickname");
            return (Criteria) this;
        }

        public Criteria andCNicknameIn(List<String> values) {
            addCriterion("C_NICKNAME in", values, "cNickname");
            return (Criteria) this;
        }

        public Criteria andCNicknameNotIn(List<String> values) {
            addCriterion("C_NICKNAME not in", values, "cNickname");
            return (Criteria) this;
        }

        public Criteria andCNicknameBetween(String value1, String value2) {
            addCriterion("C_NICKNAME between", value1, value2, "cNickname");
            return (Criteria) this;
        }

        public Criteria andCNicknameNotBetween(String value1, String value2) {
            addCriterion("C_NICKNAME not between", value1, value2, "cNickname");
            return (Criteria) this;
        }

        public Criteria andCPasswordIsNull() {
            addCriterion("C_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andCPasswordIsNotNull() {
            addCriterion("C_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andCPasswordEqualTo(String value) {
            addCriterion("C_PASSWORD =", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordNotEqualTo(String value) {
            addCriterion("C_PASSWORD <>", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordGreaterThan(String value) {
            addCriterion("C_PASSWORD >", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("C_PASSWORD >=", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordLessThan(String value) {
            addCriterion("C_PASSWORD <", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordLessThanOrEqualTo(String value) {
            addCriterion("C_PASSWORD <=", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordLike(String value) {
            addCriterion("C_PASSWORD like", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordNotLike(String value) {
            addCriterion("C_PASSWORD not like", value, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordIn(List<String> values) {
            addCriterion("C_PASSWORD in", values, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordNotIn(List<String> values) {
            addCriterion("C_PASSWORD not in", values, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordBetween(String value1, String value2) {
            addCriterion("C_PASSWORD between", value1, value2, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCPasswordNotBetween(String value1, String value2) {
            addCriterion("C_PASSWORD not between", value1, value2, "cPassword");
            return (Criteria) this;
        }

        public Criteria andCRemarkIsNull() {
            addCriterion("C_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andCRemarkIsNotNull() {
            addCriterion("C_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andCRemarkEqualTo(String value) {
            addCriterion("C_REMARK =", value, "cRemark");
            return (Criteria) this;
        }

        public Criteria andCRemarkNotEqualTo(String value) {
            addCriterion("C_REMARK <>", value, "cRemark");
            return (Criteria) this;
        }

        public Criteria andCRemarkGreaterThan(String value) {
            addCriterion("C_REMARK >", value, "cRemark");
            return (Criteria) this;
        }

        public Criteria andCRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("C_REMARK >=", value, "cRemark");
            return (Criteria) this;
        }

        public Criteria andCRemarkLessThan(String value) {
            addCriterion("C_REMARK <", value, "cRemark");
            return (Criteria) this;
        }

        public Criteria andCRemarkLessThanOrEqualTo(String value) {
            addCriterion("C_REMARK <=", value, "cRemark");
            return (Criteria) this;
        }

        public Criteria andCRemarkLike(String value) {
            addCriterion("C_REMARK like", value, "cRemark");
            return (Criteria) this;
        }

        public Criteria andCRemarkNotLike(String value) {
            addCriterion("C_REMARK not like", value, "cRemark");
            return (Criteria) this;
        }

        public Criteria andCRemarkIn(List<String> values) {
            addCriterion("C_REMARK in", values, "cRemark");
            return (Criteria) this;
        }

        public Criteria andCRemarkNotIn(List<String> values) {
            addCriterion("C_REMARK not in", values, "cRemark");
            return (Criteria) this;
        }

        public Criteria andCRemarkBetween(String value1, String value2) {
            addCriterion("C_REMARK between", value1, value2, "cRemark");
            return (Criteria) this;
        }

        public Criteria andCRemarkNotBetween(String value1, String value2) {
            addCriterion("C_REMARK not between", value1, value2, "cRemark");
            return (Criteria) this;
        }

        public Criteria andCStationIsNull() {
            addCriterion("C_STATION is null");
            return (Criteria) this;
        }

        public Criteria andCStationIsNotNull() {
            addCriterion("C_STATION is not null");
            return (Criteria) this;
        }

        public Criteria andCStationEqualTo(String value) {
            addCriterion("C_STATION =", value, "cStation");
            return (Criteria) this;
        }

        public Criteria andCStationNotEqualTo(String value) {
            addCriterion("C_STATION <>", value, "cStation");
            return (Criteria) this;
        }

        public Criteria andCStationGreaterThan(String value) {
            addCriterion("C_STATION >", value, "cStation");
            return (Criteria) this;
        }

        public Criteria andCStationGreaterThanOrEqualTo(String value) {
            addCriterion("C_STATION >=", value, "cStation");
            return (Criteria) this;
        }

        public Criteria andCStationLessThan(String value) {
            addCriterion("C_STATION <", value, "cStation");
            return (Criteria) this;
        }

        public Criteria andCStationLessThanOrEqualTo(String value) {
            addCriterion("C_STATION <=", value, "cStation");
            return (Criteria) this;
        }

        public Criteria andCStationLike(String value) {
            addCriterion("C_STATION like", value, "cStation");
            return (Criteria) this;
        }

        public Criteria andCStationNotLike(String value) {
            addCriterion("C_STATION not like", value, "cStation");
            return (Criteria) this;
        }

        public Criteria andCStationIn(List<String> values) {
            addCriterion("C_STATION in", values, "cStation");
            return (Criteria) this;
        }

        public Criteria andCStationNotIn(List<String> values) {
            addCriterion("C_STATION not in", values, "cStation");
            return (Criteria) this;
        }

        public Criteria andCStationBetween(String value1, String value2) {
            addCriterion("C_STATION between", value1, value2, "cStation");
            return (Criteria) this;
        }

        public Criteria andCStationNotBetween(String value1, String value2) {
            addCriterion("C_STATION not between", value1, value2, "cStation");
            return (Criteria) this;
        }

        public Criteria andCTelephoneIsNull() {
            addCriterion("C_TELEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andCTelephoneIsNotNull() {
            addCriterion("C_TELEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andCTelephoneEqualTo(String value) {
            addCriterion("C_TELEPHONE =", value, "cTelephone");
            return (Criteria) this;
        }

        public Criteria andCTelephoneNotEqualTo(String value) {
            addCriterion("C_TELEPHONE <>", value, "cTelephone");
            return (Criteria) this;
        }

        public Criteria andCTelephoneGreaterThan(String value) {
            addCriterion("C_TELEPHONE >", value, "cTelephone");
            return (Criteria) this;
        }

        public Criteria andCTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("C_TELEPHONE >=", value, "cTelephone");
            return (Criteria) this;
        }

        public Criteria andCTelephoneLessThan(String value) {
            addCriterion("C_TELEPHONE <", value, "cTelephone");
            return (Criteria) this;
        }

        public Criteria andCTelephoneLessThanOrEqualTo(String value) {
            addCriterion("C_TELEPHONE <=", value, "cTelephone");
            return (Criteria) this;
        }

        public Criteria andCTelephoneLike(String value) {
            addCriterion("C_TELEPHONE like", value, "cTelephone");
            return (Criteria) this;
        }

        public Criteria andCTelephoneNotLike(String value) {
            addCriterion("C_TELEPHONE not like", value, "cTelephone");
            return (Criteria) this;
        }

        public Criteria andCTelephoneIn(List<String> values) {
            addCriterion("C_TELEPHONE in", values, "cTelephone");
            return (Criteria) this;
        }

        public Criteria andCTelephoneNotIn(List<String> values) {
            addCriterion("C_TELEPHONE not in", values, "cTelephone");
            return (Criteria) this;
        }

        public Criteria andCTelephoneBetween(String value1, String value2) {
            addCriterion("C_TELEPHONE between", value1, value2, "cTelephone");
            return (Criteria) this;
        }

        public Criteria andCTelephoneNotBetween(String value1, String value2) {
            addCriterion("C_TELEPHONE not between", value1, value2, "cTelephone");
            return (Criteria) this;
        }

        public Criteria andCUsernameIsNull() {
            addCriterion("C_USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andCUsernameIsNotNull() {
            addCriterion("C_USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCUsernameEqualTo(String value) {
            addCriterion("C_USERNAME =", value, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameNotEqualTo(String value) {
            addCriterion("C_USERNAME <>", value, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameGreaterThan(String value) {
            addCriterion("C_USERNAME >", value, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("C_USERNAME >=", value, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameLessThan(String value) {
            addCriterion("C_USERNAME <", value, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameLessThanOrEqualTo(String value) {
            addCriterion("C_USERNAME <=", value, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameLike(String value) {
            addCriterion("C_USERNAME like", value, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameNotLike(String value) {
            addCriterion("C_USERNAME not like", value, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameIn(List<String> values) {
            addCriterion("C_USERNAME in", values, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameNotIn(List<String> values) {
            addCriterion("C_USERNAME not in", values, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameBetween(String value1, String value2) {
            addCriterion("C_USERNAME between", value1, value2, "cUsername");
            return (Criteria) this;
        }

        public Criteria andCUsernameNotBetween(String value1, String value2) {
            addCriterion("C_USERNAME not between", value1, value2, "cUsername");
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