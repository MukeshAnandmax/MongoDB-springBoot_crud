package com.practice.mongodbspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/get_user")
    public List<User> getUsers(){
        return userRepository.findAll();
    }



    @PostMapping("/insert_User")
    public void saveUser(@RequestBody User user){
        userRepository.save(user);
    }


    @GetMapping("/get_user_by_age")
    public  List<User> getUserByage(@RequestParam("min") int min,@RequestParam("max") int max){
       return userRepository.getUserByAge(min,max);
    }
}
