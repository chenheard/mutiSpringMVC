package com.oasystem.pojo;

import java.util.Date;

public class TTmplt {
    private Integer cId;

    private String cTempName;

    private String cSubmitDept;

    private Date cSubmitDate;

    private String cApproveDept1;

    private String cApproveDept2;

    private String cApproveDept3;

    private String cApproveDept4;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcTempName() {
        return cTempName;
    }

    public void setcTempName(String cTempName) {
        this.cTempName = cTempName == null ? null : cTempName.trim();
    }

    public String getcSubmitDept() {
        return cSubmitDept;
    }

    public void setcSubmitDept(String cSubmitDept) {
        this.cSubmitDept = cSubmitDept == null ? null : cSubmitDept.trim();
    }

    public Date getcSubmitDate() {
        return cSubmitDate;
    }

    public void setcSubmitDate(Date cSubmitDate) {
        this.cSubmitDate = cSubmitDate;
    }

    public String getcApproveDept1() {
        return cApproveDept1;
    }

    public void setcApproveDept1(String cApproveDept1) {
        this.cApproveDept1 = cApproveDept1 == null ? null : cApproveDept1.trim();
    }

    public String getcApproveDept2() {
        return cApproveDept2;
    }

    public void setcApproveDept2(String cApproveDept2) {
        this.cApproveDept2 = cApproveDept2 == null ? null : cApproveDept2.trim();
    }

    public String getcApproveDept3() {
        return cApproveDept3;
    }

    public void setcApproveDept3(String cApproveDept3) {
        this.cApproveDept3 = cApproveDept3 == null ? null : cApproveDept3.trim();
    }

    public String getcApproveDept4() {
        return cApproveDept4;
    }

    public void setcApproveDept4(String cApproveDept4) {
        this.cApproveDept4 = cApproveDept4 == null ? null : cApproveDept4.trim();
    }
}