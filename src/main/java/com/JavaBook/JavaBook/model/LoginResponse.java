package com.JavaBook.JavaBook.model;


/**
 * creating a constructor that takes a string
 * creating a class(LoginResponse) that will take the parameter response
 * that will then set the value as response
 * creating a getter method for the String response
 *
 */
public class LoginResponse {
private String response;

public LoginResponse(String response) {this.response = response;}

    public String getResponse() {return response;}

    public void setResponse(String response) {this.response = response;}
}


