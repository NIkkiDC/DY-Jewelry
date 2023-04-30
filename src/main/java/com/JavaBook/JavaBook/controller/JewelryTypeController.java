package com.JavaBook.JavaBook.controller;


import com.JavaBook.JavaBook.model.Jewelry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


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

    @Autowired
    public void setJewelryTypeController(JewelryTypeController jewelryTypeController){this.jewelryTypeController = jewelryTypeController;}


    @GetMapping(path = "/jewelryTest/") //http://localhost:9091/jewelryTest/
    public String jewelryTest() {return "Jewelry Test";}

    @GetMapping(path = "/controller/") //http://localhost:9091/controller/
    public List<Jewelry> getJewelry() {return jewelryTypeController.getJewelry();}
}
