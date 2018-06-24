package com.wmusial.controller;

import com.wmusial.model.User;
import com.wmusial.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class UserRestController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/api/users", method = RequestMethod.GET)
    public List<User> getUsers(){


        return userRepository.findAll();

    }
    @RequestMapping(value ="/api/users/{id}")
    public User getUser(@PathVariable Long id){
        User user = userRepository.findOne(id);

        return user;
    }


}
