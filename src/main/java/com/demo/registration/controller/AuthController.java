package com.demo.registration.controller;


import com.demo.registration.dto.UserRegistrationDto;
import com.demo.registration.model.User;
import com.demo.registration.service.RegisterUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    private final RegisterUserService registerUserService;

    public AuthController(RegisterUserService registerUserService) {
        this.registerUserService = registerUserService;
    }

    @PostMapping("/post")
    public User registerUser(UserRegistrationDto userRegistrationDto) throws Exception {

        User userObj=null;
        userObj=registerUserService.registerUser(userRegistrationDto);
        return userObj;

    }


}
