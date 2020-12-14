package com.test.springboot.service;

import com.test.springboot.entity.User2;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    void save(User2 user2);

    List<User2> findAll();
}
