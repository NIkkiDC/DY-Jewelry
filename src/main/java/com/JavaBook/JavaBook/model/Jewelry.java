package com.JavaBook.JavaBook.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Jewelry") // SQL table name

public class Jewelry {



    @Id
    @Column // to create the column inside PgAdmin
    private Long id;


    @Column
    private String metal;  //metal type, stone type, and price range

    @Column
    private String stone;  //metal type, stone type, and price range

    @Column
    private Integer price;



    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
