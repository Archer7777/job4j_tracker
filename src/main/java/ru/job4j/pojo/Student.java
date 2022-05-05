package ru.job4j.pojo;

import java.util.Date;

public class Student {

    private String fio;
    private String group;
    private Date ofBegin;

    public String getfio() {
        return fio;
    }

    public void setfio(String fio) {
        this.fio = fio;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Date getOfBegin() {
        return ofBegin;
    }

    public void setOfBegin(Date ofBegin) {
        this.ofBegin = ofBegin;
    }
}
