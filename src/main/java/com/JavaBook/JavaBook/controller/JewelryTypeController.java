package com.JavaBook.JavaBook.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/*
Defining the REST API endpoint for jewelry types that can be accessed through the http request (the url)
 */
@RestController
@RequestMapping(path = "restapi") //http://localhost:9091/testing
public class JewelryTypeController {
private JewelryTypeController jewelryTypeController; //declaring a private instance variable jewelryTypeController of type JewelryTypeController.


    /*
    defining the public method taking the parameter JewelryTypeController. = to set the value of the jewelryTypeController instance variable.
    when this method is called it is setting the value of jewelryTypeController (used in dependency)
     */


    public void setJewelryTypeController(JewelryTypeController jewelryTypeController){this.jewelryTypeController = jewelryTypeController;}


    @GetMapping(path = "/jewelryTest/") //http://localhost:9091/jewelryTest/
    public String jewelryTest() {return "Jewelry Test";}



}
