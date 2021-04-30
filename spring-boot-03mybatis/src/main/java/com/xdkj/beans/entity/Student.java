package com.xdkj.beans.entity;

import java.io.Serializable;

/**
 * (Student)实体类
 *
 * @author makejava
 * @since 2021-04-26 15:15:13
 */
public class Student implements Serializable {
    private static final long serialVersionUID = -11478021337098961L;

    private Integer id;

    private String stuname;

    private Object stubirth;

    private String stusex;

    private String department;

    private String address;

    private Integer age;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public Object getStubirth() {
        return stubirth;
    }

    public void setStubirth(Object stubirth) {
        this.stubirth = stubirth;
    }

    public String getStusex() {
        return stusex;
    }

    public void setStusex(String stusex) {
        this.stusex = stusex;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
