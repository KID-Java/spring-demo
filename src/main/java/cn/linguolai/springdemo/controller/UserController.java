package cn.linguolai.springdemo.controller;


import cn.linguolai.springdemo.bean.User;
import cn.linguolai.springdemo.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/users")
    public List<User> selectAll() {
        return userService.selectAll();
    }
    @GetMapping("/user/{username}")
    public User selectOne(@PathVariable("username") String username) {
        return userService.selectByUsername(username);
    }



    @PostMapping("/user")
    public String insert(User user) {
        System.out.println(user);
        if (user != null) {
            userService.addUser(user);
            return "success";
        }
        return "failed";
    }

    @PutMapping("/user")
    public String update(User user) {
        if (user != null) {
            userService.updateUser(user);
            return "success";
        }
        return "failed";
    }

    @DeleteMapping("user")
    public String delete(String username) {
        if (username != null) {
            userService.deleteByUsername(username);
            return "success";
        }
        return "failed";
    }
}
