package student.demo.pro.parcticePro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import student.demo.pro.parcticePro.entity.User;
import student.demo.pro.parcticePro.service.UserServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/")
public class UserController {
    @Autowired
    UserServiceImpl userService;
    @PostMapping("insertUser")
    public User insertUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping("user/{id}")
    public User getUser(@PathVariable Long id){
        return userService.getUserByID(id);
    }
    @GetMapping("allUser")
    public List<User>  getAll(){
        return userService.getAllUser();
    }
}
