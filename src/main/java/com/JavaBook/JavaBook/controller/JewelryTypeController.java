package com.JavaBook.JavaBook.controller;


import com.JavaBook.JavaBook.model.Jewelry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


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
    public void setJewelryTypeController(JewelryTypeController jewelryTypeController) {
        this.jewelryTypeController = jewelryTypeController;
    }


    @GetMapping(path = "/jewelryTest/") //http://localhost:9091/jewelryTest/
    public String jewelryTest() {
        return "Jewelry Test";
    }

    @GetMapping(path = "/jewelry/") //http://localhost:9091/jewelry/
    public List<Jewelry> getJewelry() {
        return jewelryTypeController.getJewelry();
    }

    @GetMapping(path = "/jewelry/{jewelryId}") //http://localhost:9091/jewelry
    public Optional<Jewelry> getJewelry(@PathVariable Long jewelryId) {
        return jewelryTypeController.getJewelry(jewelryId);
    }
    // creating a new jewelry object

    @PostMapping(path = "/jewelry/")
    public Jewelry createJewelry(@RequestBody Jewelry jewelryObject) {
        return jewelryTypeController.createJewelry(jewelryObject);
    }

    @PutMapping(path = "/jewelry/")
    public Jewelry updateJewelry(@PathVariable Long jewelryId, @RequestBody Jewelry jewelryObject) {
        return jewelryTypeController.updateJewelry(jewelryId, jewelryObject);
    }




}