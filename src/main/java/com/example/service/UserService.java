package com.example.service;

import com.example.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

public interface UserService {
    @Autowired
    User login(User user);
    void register(User user);
    User getUserDetails(String username);
    void updateuserdetails(User user);
}
