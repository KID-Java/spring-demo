package cn.linguolai.springdemo.mapper;

import cn.linguolai.springdemo.bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    List<User> selectAll();

    User selectOne(String username);

    void insert(User user);

    void update(User user);

    void delete(String  username);

}
