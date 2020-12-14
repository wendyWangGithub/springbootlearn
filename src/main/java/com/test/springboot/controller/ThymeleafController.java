package com.test.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//使用thymeleaf不能再用RestController，因为RestController是把方法的返回值变成json类型传递给浏览器。
//@controller 才支持页面的跳转
@Controller
@RequestMapping("HelloThymeleaf")
public class ThymeleafController {

    @GetMapping("findAll")
    public String findAll() {
        System.out.println("查询所有");
        //逻辑名，只要引入了thymeleaf依赖，就会去templates中去找index.html
        //解析：classpath:/templates/逻辑名.html
        return "thymeleafIndex";

    }

}
