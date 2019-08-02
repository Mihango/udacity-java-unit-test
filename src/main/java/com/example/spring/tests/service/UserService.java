package com.example.spring.tests.service;

import com.example.spring.tests.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    private UserDao userDao;

    public String getUser() {
        return userDao.getUser();
    }
}
