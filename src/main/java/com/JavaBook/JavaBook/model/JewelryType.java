package com.JavaBook.JavaBook.model;


import javax.persistence.*;

@Entity
@Table(name = "jewelryType") // SQL table name

public class JewelryType {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column
    private Long id;






    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}