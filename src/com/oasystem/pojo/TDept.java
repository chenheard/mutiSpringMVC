package com.oasystem.pojo;

public class TDept {
    private Integer cId;

    private String cDeptCode;

    private String cDeptName;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcDeptCode() {
        return cDeptCode;
    }

    public void setcDeptCode(String cDeptCode) {
        this.cDeptCode = cDeptCode == null ? null : cDeptCode.trim();
    }

    public String getcDeptName() {
        return cDeptName;
    }

    public void setcDeptName(String cDeptName) {
        this.cDeptName = cDeptName == null ? null : cDeptName.trim();
    }
}