package com.oasystem.pojo;

public class TMenu {
    private Integer cId;

    private String cDescription;

    private String cName;

    private String cPage;

    private Integer cPriority;

    private Integer cPid;

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

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public String getcPage() {
        return cPage;
    }

    public void setcPage(String cPage) {
        this.cPage = cPage == null ? null : cPage.trim();
    }

    public Integer getcPriority() {
        return cPriority;
    }

    public void setcPriority(Integer cPriority) {
        this.cPriority = cPriority;
    }

    public Integer getcPid() {
        return cPid;
    }

    public void setcPid(Integer cPid) {
        this.cPid = cPid;
    }
}