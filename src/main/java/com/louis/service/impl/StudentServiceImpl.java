package com.louis.service.impl;

import com.louis.dao.StudentDao;
import com.louis.model.Student;
import com.louis.service.IStudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements IStudentService {

    @Resource
    private StudentDao studentDao;

    @Override
    public void addStudent(Student student) {
        studentDao.insert(student);
    }

    @Override
    public List<Student> selectStudent() {
        return studentDao.selectAll();
    }
}
