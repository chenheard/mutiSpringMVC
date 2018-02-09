package com.oasystem.pojo;

import java.io.Serializable;

public class TApproveOpinion implements Serializable{
    private Integer Id;

    private Integer RequisitionId;

    private String DeptCode;

    private String DeptOpinion;

    private String Flag;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Integer getRequisitionId() {
		return RequisitionId;
	}

	public void setRequisitionId(Integer requisitionId) {
		RequisitionId = requisitionId;
	}

	public String getDeptCode() {
		return DeptCode;
	}

	public void setDeptCode(String deptCode) {
		DeptCode = deptCode;
	}

	public String getDeptOpinion() {
		return DeptOpinion;
	}

	public void setDeptOpinion(String deptOpinion) {
		DeptOpinion = deptOpinion;
	}

	public String getFlag() {
		return Flag;
	}

	public void setFlag(String flag) {
		Flag = flag;
	}

}