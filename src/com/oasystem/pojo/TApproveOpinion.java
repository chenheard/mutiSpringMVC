package com.oasystem.pojo;

public class TApproveOpinion {
    private Integer cId;

    private Integer cRequisitionId;

    private String cDeptCode;

    private String tDeptOpinion;

    private String cFlag;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Integer getcRequisitionId() {
        return cRequisitionId;
    }

    public void setcRequisitionId(Integer cRequisitionId) {
        this.cRequisitionId = cRequisitionId;
    }

    public String getcDeptCode() {
        return cDeptCode;
    }

    public void setcDeptCode(String cDeptCode) {
        this.cDeptCode = cDeptCode == null ? null : cDeptCode.trim();
    }

    public String gettDeptOpinion() {
        return tDeptOpinion;
    }

    public void settDeptOpinion(String tDeptOpinion) {
        this.tDeptOpinion = tDeptOpinion == null ? null : tDeptOpinion.trim();
    }

    public String getcFlag() {
        return cFlag;
    }

    public void setcFlag(String cFlag) {
        this.cFlag = cFlag == null ? null : cFlag.trim();
    }
}