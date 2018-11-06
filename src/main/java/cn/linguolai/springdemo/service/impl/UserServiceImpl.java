package cn.linguolai.springdemo.service.impl;

import cn.linguolai.springdemo.bean.User;
import cn.linguolai.springdemo.mapper.UserMapper;
import cn.linguolai.springdemo.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public void addUser(User user) {

        if (user != null && user.getUsername() != null) {
            userMapper.insert(user);
        }


    }

    @Override
    public void updateUser(User user) {
        if (user != null && user.getUsername() != null) {
            userMapper.update(user);
        }
    }

    @Override
    public void deleteByUsername(String username) {
        if (username != null) {
            userMapper.delete(username);
        }
    }

    @Override
    public List<User> selectAll() {

        return userMapper.selectAll();
    }

    @Override
    public User selectByUsername(String username) {
        if (username == null) {
            return null;
        }
        return userMapper.selectOne(username);
    }

}
