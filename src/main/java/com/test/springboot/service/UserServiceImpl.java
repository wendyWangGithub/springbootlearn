package com.test.springboot.service;

import com.test.springboot.dao.UserDAO;
import com.test.springboot.entity.User2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

/**
 * 业务逻辑层，处理业务逻辑
 */
@Service
@Transactional//开启事务,出现运行时异常，事务会回滚。spring和springmvc会出现父子容器问题。springboot是对她们俩的进一步封装，父子容器的问题已经解决了。
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public void save(User2 user2) {
        //user2.setId(UUID.randomUUID().toString());
        user2.setId(String.valueOf(System.currentTimeMillis()));
        userDAO.save(user2);
        //int n = 1/0;//检查事务是否回滚，springboot解决spring父子容器的问题
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<User2> findAll() {
        return userDAO.findAll();
    }
}
