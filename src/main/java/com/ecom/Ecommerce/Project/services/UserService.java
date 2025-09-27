package com.ecom.Ecommerce.Project.services;

import com.ecom.Ecommerce.Project.entities.User;
import com.ecom.Ecommerce.Project.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepo;

    public User registeruser(User user){
        return userRepo.save(user);

    };

    public Optional<User> getUser(Long id) {
        return userRepo.findById(id);
    }


    public User updateUser(@RequestBody User user, @RequestParam Long id) {
        Optional<User> existUser=getUser(id);
        if (existUser.isEmpty()) {
            return null;
        }
        User updateUser = existUser.get();
        updateUser.setFirstName(user.getFirstName());
        updateUser.setEmail(user.getEmail());
        updateUser.setPassword(user.getPassword());
        User savedUser = userRepo.save(updateUser);
        return savedUser;

    }


    public User deleteUser(Long id) {
        Optional<User> existUser = userRepo.findById(id);
        if (existUser.isEmpty()) {
            return null;
        }
        User userToDelete = existUser.get();
        userRepo.deleteById(id);
        return userToDelete;
    }

    public List<User> getAllUsers() {
        return userRepo.findAll();
    }
}
