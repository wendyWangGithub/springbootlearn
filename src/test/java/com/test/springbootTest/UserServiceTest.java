package com.test.springbootTest;

import com.test.springboot.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceTest extends BasicTest {

    @Autowired
    private UserService userService;

    @Test
    public void testFindAll() {
        userService.findAll().forEach(user2-> System.out.println(user2));
    }
}
