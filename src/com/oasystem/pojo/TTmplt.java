package com.oasystem.pojo;

import java.io.Serializable;
import java.util.Date;

public class TTmplt  implements Serializable{
    private Integer Id;

    private String TempName;

    private String SubmitDept;

    private Date SubmitDate;

    private String ApproveDept1;

    private String ApproveDept2;

    private String ApproveDept3;

    private String ApproveDept4;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getTempName() {
		return TempName;
	}

	public void setTempName(String tempName) {
		TempName = tempName;
	}

	public String getSubmitDept() {
		return SubmitDept;
	}

	public void setSubmitDept(String submitDept) {
		SubmitDept = submitDept;
	}

	public Date getSubmitDate() {
		return SubmitDate;
	}

	public void setSubmitDate(Date submitDate) {
		SubmitDate = submitDate;
	}

	public String getApproveDept1() {
		return ApproveDept1;
	}

	public void setApproveDept1(String approveDept1) {
		ApproveDept1 = approveDept1;
	}

	public String getApproveDept2() {
		return ApproveDept2;
	}

	public void setApproveDept2(String approveDept2) {
		ApproveDept2 = approveDept2;
	}

	public String getApproveDept3() {
		return ApproveDept3;
	}

	public void setApproveDept3(String approveDept3) {
		ApproveDept3 = approveDept3;
	}

	public String getApproveDept4() {
		return ApproveDept4;
	}

	public void setApproveDept4(String approveDept4) {
		ApproveDept4 = approveDept4;
	}
    
    
}