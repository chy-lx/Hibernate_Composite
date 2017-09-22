package com.chy.po;

import java.io.Serializable;

public class Stu implements Serializable {
    private String name;
    private String stuNumber;

    public Stu() {
    }

    public Stu(String name, String stuNumber) {
        this.name = name;
        this.stuNumber = stuNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(String stuNumber) {
        this.stuNumber = stuNumber;
    }
}
