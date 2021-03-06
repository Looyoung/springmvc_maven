package com.louis.dao;

import com.louis.model.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.springframework.stereotype.Component;

import java.util.List;

public interface StudentDao {
//    int deleteByPrimaryKey(Integer studentId);

    @Insert("insert into student(student_name,student_age,student_phone)" +
            "values(#{studentName,jdbcType=VARCHAR},#{studentAge,jdbcType=INTEGER},#{studentPhone,jdbcType=VARCHAR})")
//    @Options(useGeneratedKeys = true, keyProperty = "studentId")
    int insert(Student student);

//    int insertSelective(Student student);
//
//    Student selectByPrimaryKey(Integer studentId);
//
//    int updateByPrimaryKeySelective(Student student);
//
//    int updateByPrimaryKey(Student student);

    List<Student> selectAll();
}