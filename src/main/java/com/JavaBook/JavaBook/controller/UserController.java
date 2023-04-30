package com.JavaBook.JavaBook.controller;

import com.JavaBook.JavaBook.model.User;
import org.springframework.web.bind.annotation.RequestBody;

public class UserController {

    private UserController userController;


    public void setUserController(UserController userController) {this.userController = userController;}

    public User createUser(@RequestBody User userObject) {return userController.createUser(userObject);}

}
