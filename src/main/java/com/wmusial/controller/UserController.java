package com.wmusial.controller;


import com.wmusial.model.User;
import com.wmusial.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class UserController {


    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/users", method=RequestMethod.GET)
    public String showUsers(Model model){

        List<User> users = userRepository.findAll();
        model.addAttribute("usersList", users);


        return "users";
    }

}
