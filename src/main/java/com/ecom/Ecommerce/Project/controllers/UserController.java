package com.ecom.Ecommerce.Project.controllers;


import com.ecom.Ecommerce.Project.entities.User;
import com.ecom.Ecommerce.Project.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class UserController {
    
    @Autowired
    private UserService userService;


    @GetMapping("users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }


    @PostMapping("users/register")
    public User register(@RequestBody User user){
        return userService.registeruser(user);
    }

    @GetMapping("users/{id}")
    public Optional<User> getUserbyId(@PathVariable Long id){
        return userService.getUser(id);
    }


    @PutMapping("users/{id}")
    public User updateUser(@RequestBody User user,@PathVariable Long id){
        return userService.updateUser(user,id);
    }

    @DeleteMapping("users/{id}")
    public User deleteUser(@PathVariable Long id){
        return userService.deleteUser(id);
    }

}
