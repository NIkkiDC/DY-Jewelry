package com.JavaBook.JavaBook.model;


/**
 * creating two instance variables email & password
 * create a getter & a return for both (no setter)
 * The email or the password cannot be changed once the objects have been created
 */

public class LoginRequest {
    private String email;
    private String password;

    public String getEmail() {return email;}

    public String getPassword() {return password;}
}
