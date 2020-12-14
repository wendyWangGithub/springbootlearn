package com.test.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * SpringbootApplication注解代表这是一个springboot入口类，这个注解只能出现一次
 * 相当于以下三个注解
 * @SpringBootConfiguration
 * @EnableAutoConfiguration//开启自动配置，初始化spring和springmvc环境，但是无法扫描到控制器类中的注解，
 * 控制器类中的注解放到次文件中是可以扫描到的。只能用在类上
 * 实际作用：根据pom文件中依赖自动判断，如pom中引入spring-boot-starter-web，会自动根据引入的这个依赖构建相关环境
 * 如springmvc和web容器环境。
 * @ComponentScan//用来扫描相关注解，扫描范围：扫描当前包及子包。如果需要把入口类和控制器解藕就需要此注解
 * 只能用在类上。
 */
@SpringBootApplication
@MapperScan("com.test.springboot.dao")//扫描dao接口
@RestController
public class StartApplication {

    /**main方法，通过标准java入口方式委托给SpringApplication，并告知当前springboot主应用类，是谁，
    从而启动pringboot中的tomcat容器。*/
    public static void main(String[] args) {
        /**启动springboot应用
        //参数1：入口类类对象，参数2：main函数参数，可以在启动时，使用外部参数。用来覆盖springboot中的默认配置。
        //SpringApplication是spirng的应用类，用来启动springboot应用*/
        SpringApplication.run(StartApplication.class, args);
    }

    //但是一般情况，需要把控制器和主入口类进行分离解藕
    @RequestMapping("/hello")
    public String hello() {
        System.out.println("hello");
        return "hello springboot!";
    }
}
