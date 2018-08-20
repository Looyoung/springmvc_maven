package com.louis.controller;

import com.louis.model.Student;
import com.louis.service.IStudentService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;


@Controller
@RequestMapping("/louis")
public class IndexController {

    private static Logger logger = Logger.getLogger(IndexController.class);

    @Resource
    private IStudentService studentService;

    @RequestMapping("/hello")
    public String index(){
        logger.info("info logger");
        logger.debug("debug logger");
        logger.error("error logger");
        logger.warn("warn logger");
        logger.fatal("fatal logger");
        return "hello";
    }

    @RequestMapping("/add")
    public String add(){
        Student student = new Student("张曼玉",42,"18813292018");
        studentService.addStudent(student);
        logger.info("info logger");
        logger.error("error logger");
        return "success";
    }
}
