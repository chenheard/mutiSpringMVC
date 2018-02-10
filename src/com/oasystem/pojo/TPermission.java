package com.oasystem.pojo;

public class TPermission {
    private Integer cId;

    private String cDescription;

    private String cKeyword;

    private String cName;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcDescription() {
        return cDescription;
    }

    public void setcDescription(String cDescription) {
        this.cDescription = cDescription == null ? null : cDescription.trim();
    }

    public String getcKeyword() {
        return cKeyword;
    }

    public void setcKeyword(String cKeyword) {
        this.cKeyword = cKeyword == null ? null : cKeyword.trim();
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }
}