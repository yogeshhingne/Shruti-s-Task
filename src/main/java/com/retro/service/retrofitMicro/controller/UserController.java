package com.retro.service.retrofitMicro.controller;



import com.retro.service.retrofitMicro.dto.User;
import com.retro.service.retrofitMicro.service.UserServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/")
public class UserController {
    @Autowired
    UserServiceImpl userService;
    @PostMapping("insertUser")
    public User insert(@RequestBody User user) throws IOException {
        return userService.insertUser(user);
    }
    @GetMapping("getAllUser")
    public List<User> getAllUser() throws IOException {
        return userService.getAll();
    }
    @GetMapping("userById/{id}")
    public User getUserById(@PathVariable int id) throws IOException {
        return userService.getUser(id);
    }
}
