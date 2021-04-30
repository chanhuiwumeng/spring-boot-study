package com.xdkj.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * (Student)实体类
 *
 * @author makejava
 * @since 2021-04-28 16:28:00
 */
@TableName(value = "student")
public class Student implements Serializable {
    private static final long serialVersionUID = 541095891822166843L;
    @TableId(value = "id")
    private Integer id;
    @TableField(value = "stuname")
    private String stuname;
    @TableField(value = "stubirth")
    private Object stubirth;
    @TableField(value = "stusex")
    private String stusex;
    @TableField(value = "department")
    private String department;
    @TableField(value = "address")
    private String address;
    @TableField(value = "age")
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
