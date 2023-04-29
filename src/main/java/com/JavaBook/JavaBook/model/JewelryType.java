package com.JavaBook.JavaBook.model;


import javax.persistence.*;

@Entity
@Table(name = "jewelryType") // SQL table name

public class JewelryType {


    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY) // this is the primary key
    private Long id;


    @Column // creating a column in the table
    private String brand;

    @Column // creating a column in the table
    private String description;





    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}