package com.test.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    //访问index.jsp 1、http://localhost:8989/ems/index.jsp 2、http://localhost:8989/ems/user/findAll
    //在application.yml文件中配置了index文件的前缀和后缀
    @RequestMapping("findAll")
    public String findAll() {
        System.out.println("findAll");
        return "index";
    }
}
