package com.xdkj.beans;

import lombok.Data;

import javax.persistence.*;

/**
 * ClassName Student
 * Description:
 *
 * @Author:一尘
 * @Version:1.0
 * @Date:2021-04-27-16:37
 */
@Data
@Entity
@Table(name = "student")
public class Student {
    //声明id是主键
    @Id
    //主键的自增方式
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //指定列名
    @Column(name = "id")
    private Integer id;
    @Column(name = "stuname")
    private String stuname;
    @Column(name = "stubirth")
    private String stubirth;
    @Column(name = "stusex")
    private String stusex;
    @Column(name = "department")
    private String department;
    @Column(name = "address")
    private String address;
    @Column(name = "age")
    private Integer age;

}
