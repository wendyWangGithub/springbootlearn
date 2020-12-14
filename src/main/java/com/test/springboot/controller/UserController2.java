package com.test.springboot.controller;

import com.test.springboot.entity.User2;
import com.test.springboot.entity.User3;
import com.test.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("user2")
public class UserController2 {

    @Autowired//要求工厂中必须存在的
    private UserService userService;

    @Autowired
    private User3 user3;

    @RequestMapping("user3")
    public void test3() {
        System.out.println("user3的值为：" + user3);
    }

    //添加用户信息
    @RequestMapping("save")
    public String save(User2 user2){
        userService.save(user2);
        return "redirect:/user2/findAll";
    }

    //查询所有
    @RequestMapping("findAll")
    public String findAll(Model model) {
        List<User2> users = userService.findAll();
        //渲染到页面
        model.addAttribute("users",users);
        return "showAll";
    }


}
