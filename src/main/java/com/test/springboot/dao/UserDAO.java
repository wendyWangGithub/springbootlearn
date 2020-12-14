package com.test.springboot.dao;

import com.test.springboot.entity.User2;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

@Repository
public interface UserDAO extends BaseDAO<User2> {



}
