package com.example.mapper;

import com.example.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    User login(User user);
    void register(User user);
    User getUserDetails(String username);
    void updateuserdetails(User user);
}
