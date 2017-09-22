package com.chy.po;

import java.io.Serializable;

public class Student implements Serializable {
    private Stu stu;
    private Address address;
    public Stu getStu() {
        return stu;
    }

    public void setStu(Stu stu) {
        this.stu = stu;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
