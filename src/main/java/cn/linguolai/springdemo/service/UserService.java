package cn.linguolai.springdemo.service;

import cn.linguolai.springdemo.bean.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    void updateUser(User user);

    void deleteByUsername(String username);

    List<User> selectAll();

    User selectByUsername(String username);
}
