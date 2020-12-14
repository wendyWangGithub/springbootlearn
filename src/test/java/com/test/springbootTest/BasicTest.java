package com.test.springbootTest;

import com.test.springboot.StartApplication;
import com.test.springboot.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * junit测试
 * 测试方法一般不放到main中，而是写一个测试类。例如针对UserService的测试，就对应写一个UserServiceTest的类，去继承BasicTest。把用户模块的所有测试都放在UserServiceTest类中。
 * 继承以后，每个类就不用写类上面的两个注解了。
 * src/main/test建了一个和java平级的文件夹，因为test只是为了测试用，所以不要发布到生产，故不需要放到java下的文件夹中。
 */
//@RunWith(SpringJUnit4ClassRunner.class)//启动工厂
@RunWith(SpringRunner.class)//因为SpringRunner类继承了SpringJUnit4ClassRunner类所以，SpringRunner等价于SpringJUnit4ClassRuner类。
//@ContextConfiguration//指定工厂的配置文件换成@SpringbootTest
@SpringBootTest(classes = StartApplication.class)//找到指定的入口类，并把入口类里的main函数启动起来。
public class BasicTest {

    @Autowired
    private UserService userService;

    @Test
    public void testFindAll() {
        userService.findAll().forEach(user2-> System.out.println(user2));
    }
}
