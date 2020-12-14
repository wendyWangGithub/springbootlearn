package com.test.springboot.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Date;
import java.util.Map;

//@Component//先交给工厂管理，用来做对象的创建
//@Configuration//交给工厂管理，继承了@Component，有了该注解就可以在controller中对User进行注入。注释掉，但是在config/BeansConfig
//中使用@Bean把方法返回值放到了工厂中。
public class User3 {

    //@Value("${id}")用第二种方式@ConfigurationProperties注入
    private String id;
    //@Value("${name}")
    private String name;
    //@Value("${age}")
    private Integer age;
    //@Value("${bir}")
    private Date bir;
    private Map<String,String> map;

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", bir=" + bir +
                ", map=" + map +
                '}';
    }

    public User3() {
    }

    public User3(String id, String name, Integer age, Date bir, Map<String, String> map) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.bir = bir;
        this.map = map;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBir() {
        return bir;
    }

    public void setBir(Date bir) {
        this.bir = bir;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }
}
