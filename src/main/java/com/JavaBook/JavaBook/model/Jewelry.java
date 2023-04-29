package com.JavaBook.JavaBook.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "jewelry") // SQL table name

public class Jewelry {



    @Id
    @Column // to create the column inside PgAdmin
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column
    private String metal;  //metal type, stone type, and price range

    @Column
    private String stone;  //metal type, stone type, and price range

    @Column
    private Integer price;  //metal type, stone type, and price range



    @JsonIgnore //used to ignore this property during serialization and deserialization
    @ManyToOne //many jewelry to one jewelry tpe.
    @JoinColumn(name = "jewelryType_id") // the column in this entity will map to the foreign key column in the join table
    private JewelryType jewelryType;



    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
