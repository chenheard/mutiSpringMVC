package com.oasystem.pojo;

import java.io.Serializable;

public class TPermission implements Serializable{
    private Integer Id;

    private String Description;

    private String Keyword;

    private String Name;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getKeyword() {
		return Keyword;
	}

	public void setKeyword(String keyword) {
		Keyword = keyword;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

   
}