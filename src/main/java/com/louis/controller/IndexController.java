package com.louis.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/louis")
public class IndexController {

    private static Logger logger = Logger.getLogger(IndexController.class);

    @RequestMapping("/hello")
    public String index(){
        logger.info("info logger");
        logger.debug("debug logger");
        logger.error("error logger");
        logger.warn("warn logger");
        logger.fatal("fatal logger");
        return "hello";
    }
}
