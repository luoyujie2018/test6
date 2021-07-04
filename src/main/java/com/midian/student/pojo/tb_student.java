package com.midian.student.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel("学生对象")
public class tb_student {

    @ApiModelProperty("学生编号")
    private Integer studentno;

    private String loginpwd;

    private String studentname;

    private Boolean sex;

    private Integer gradeid;

    private String phone;

    private String address;

    private Date borndate;

    private String email;

    private String identitycard;

    private String img;

    public String getCTest() {
        return cTest;
    }

    public void setCTest(String cTest) {
        this.cTest = cTest;
    }

    @ApiModelProperty("测试属性")
    private String cTest;

    public Integer getStudentno() {
        return studentno;
    }

    public void setStudentno(Integer studentno) {
        this.studentno = studentno;
    }

    public String getLoginpwd() {
        return loginpwd;
    }

    public void setLoginpwd(String loginpwd) {
        this.loginpwd = loginpwd;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public Integer getGradeid() {
        return gradeid;
    }

    public void setGradeid(Integer gradeid) {
        this.gradeid = gradeid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBorndate() {
        return borndate;
    }

    public void setBorndate(Date borndate) {
        this.borndate = borndate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdentitycard() {
        return identitycard;
    }

    public void setIdentitycard(String identitycard) {
        this.identitycard = identitycard;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "tb_student{" +
                "studentno=" + studentno +
                ", loginpwd='" + loginpwd + '\'' +
                ", studentname='" + studentname + '\'' +
                ", sex=" + sex +
                ", gradeid=" + gradeid +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", borndate=" + borndate +
                ", email='" + email + '\'' +
                ", identitycard='" + identitycard + '\'' +
                ", img='" + img + '\'' +
                '}';
    }
}