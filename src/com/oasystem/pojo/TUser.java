package com.oasystem.pojo;

import java.util.Date;

public class TUser {
    private Integer id;

    private Integer cAge;

    private String cSalary;

    private Integer cId;

    private String cBirthday;

    private String cGender;

    private String cNickname;

    private String cPassword;

    private String cRemark;

    private String cStation;

    private String cTelephone;

    private String cUsername;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getcAge() {
        return cAge;
    }

    public void setcAge(Integer cAge) {
        this.cAge = cAge;
    }

    public String getcSalary() {
        return cSalary;
    }

    public void setcSalary(String cSalary) {
        this.cSalary = cSalary == null ? null : cSalary.trim();
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcBirthday() {
        return cBirthday;
    }

    public void setcBirthday(String cBirthday) {
        this.cBirthday = cBirthday;
    }

    public String getcGender() {
        return cGender;
    }

    public void setcGender(String cGender) {
        this.cGender = cGender == null ? null : cGender.trim();
    }

    public String getcNickname() {
        return cNickname;
    }

    public void setcNickname(String cNickname) {
        this.cNickname = cNickname == null ? null : cNickname.trim();
    }

    public String getcPassword() {
        return cPassword;
    }

    public void setcPassword(String cPassword) {
        this.cPassword = cPassword == null ? null : cPassword.trim();
    }

    public String getcRemark() {
        return cRemark;
    }

    public void setcRemark(String cRemark) {
        this.cRemark = cRemark == null ? null : cRemark.trim();
    }

    public String getcStation() {
        return cStation;
    }

    public void setcStation(String cStation) {
        this.cStation = cStation == null ? null : cStation.trim();
    }

    public String getcTelephone() {
        return cTelephone;
    }

    public void setcTelephone(String cTelephone) {
        this.cTelephone = cTelephone == null ? null : cTelephone.trim();
    }

    public String getcUsername() {
        return cUsername;
    }

    public void setcUsername(String cUsername) {
        this.cUsername = cUsername == null ? null : cUsername.trim();
    }

	@Override
	public String toString() {
		return "TUser [id=" + id + ", cAge=" + cAge + ", cSalary=" + cSalary + ", cId=" + cId + ", cBirthday="
				+ cBirthday + ", cGender=" + cGender + ", cNickname=" + cNickname + ", cPassword=" + cPassword
				+ ", cRemark=" + cRemark + ", cStation=" + cStation + ", cTelephone=" + cTelephone + ", cUsername="
				+ cUsername + "]";
	}
    
}