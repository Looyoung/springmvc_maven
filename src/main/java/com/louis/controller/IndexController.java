package com.louis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/louis")
public class IndexController {

    @RequestMapping("/hello")
    public String index(){
        return "hello";
    }
}
