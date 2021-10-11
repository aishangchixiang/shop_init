package com.example.service.impl;

import com.example.entity.User;
import com.example.mapper.UserMapper;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    public User login(User user){
        return userMapper.login(user);
    }
    public void register(User user){
        userMapper.register(user);
    }
    @Override
    public User getUserDetails(String username) {
        return userMapper.getUserDetails(username);
    }

    @Override
    public void updateuserdetails(User user) {
        userMapper.updateuserdetails(user);
    }
}
