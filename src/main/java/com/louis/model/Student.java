package com.louis.model;

public class Student {
    private Integer studentid;

    private String studentname;

    private Integer studentage;

    private String studentphone;

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname == null ? null : studentname.trim();
    }

    public Integer getStudentage() {
        return studentage;
    }

    public void setStudentage(Integer studentage) {
        this.studentage = studentage;
    }

    public String getStudentphone() {
        return studentphone;
    }

    public void setStudentphone(String studentphone) {
        this.studentphone = studentphone == null ? null : studentphone.trim();
    }
}