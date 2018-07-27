package com.louis.dao;

import com.louis.model.Student;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class StudentMapperTest {

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        Student student = new Student("Rachel",32,"13923917418");
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        int i = studentMapper.insert(student);
        sqlSession.commit();  // 一定要提交,不然数据库查不到数据,但id有在自增,不知道为什么???
        System.out.println(student);
        System.out.println(i);
        SqlSessionUtil.closeSqlSession(sqlSession);
    }

    @Test
    public void insertSelective() {
    }

    @Test
    public void selectByPrimaryKey() throws IOException {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        Student student = null;
        if (sqlSession != null) {
            student = sqlSession.selectOne("com.louis.dao.StudentMapper.selectByPrimaryKey", 2);
        }
        sqlSession.commit();
        if (student != null) {
            System.out.println(student);
        }
        SqlSessionUtil.closeSqlSession(sqlSession);
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void updateByPrimaryKey() {
    }

    @Test
    public void selectAll() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        List<Student> studentList = null;
        if (sqlSession != null) {
            studentList = sqlSession.selectList("com.louis.dao.StudentMapper.selectAll");
        }
        sqlSession.commit();
        for (Student student : studentList) {
            System.out.println(student);
        }
        SqlSessionUtil.closeSqlSession(sqlSession);
    }

}