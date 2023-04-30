package com.JavaBook.JavaBook.controller;

import com.JavaBook.JavaBook.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/auth/users")
public class UserController {

    private UserController userController;

    @Autowired
    public void setUserController(UserController userController) {this.userController = userController;}


    @PostMapping("/register")
    public User createUser(@RequestBody User userObject) {return userController.createUser(userObject);}

    @PostMapping
    public ResponseEntity<?> loginUser(@RequestBody LoginRequest loginRequest) {
        return userController.loginUser(loginRequest);
    }

}
