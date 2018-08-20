package com.louis.service;

import com.louis.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IStudentService {

    void addStudent(Student student);
    List<Student> selectStudent();

}
