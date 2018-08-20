package com.louis.model;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private Integer studentId;

    private String studentName;

    private Integer studentAge;

    private String studentPhone;

    public Student(){

    }

    public Student(String studentName,int studentAge,String studentPhone){
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentPhone = studentPhone;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(Integer studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

    @Override
    public String toString() {
        return "studentId:"+studentId+",studentName:"+studentName+",studentAge:"+studentAge+",studentPhone:"+studentPhone;
    }
}