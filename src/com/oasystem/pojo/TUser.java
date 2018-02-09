package com.oasystem.pojo;

import java.io.Serializable;
import java.util.Date;

public class TUser{
    private Integer id;

    private Integer age;

    private String salary;

    private Integer cId;

    private String birthday;

    private String gender;

    private String nickname;

    private String password;

    private String remark;

    private String station;

    private String telephone;

    private String username;

	@Override
	public String toString() { 
		return "TUser [id=" + id + ", age=" + age + ", salary=" + salary + ", cId=" + cId + ", birthday=" + birthday
				+ ", gender=" + gender + ", nickname=" + nickname + ", password=" + password + ", remark=" + remark
				+ ", station=" + station + ", telephone=" + telephone + ", username=" + username + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public Integer getcId() {
		return cId;
	}

	public void setcId(Integer cId) {
		this.cId = cId;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getStation() {
		return station;
	}

	public void setStation(String station) {
		this.station = station;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
    
}