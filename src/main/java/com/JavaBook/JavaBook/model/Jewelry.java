package com.JavaBook.JavaBook.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "jewelry") // SQL table name

public class Jewelry {



    @Id
    @Column // to create the column inside PgAdmin
    @GeneratedValue(strategy = GenerationType.IDENTITY) // this is the primary key
    private Long id;

// im not sure why they are grey, and not purple, I hope they work
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

    public Jewelry(Long id, String metal, String stone, Integer price, JewelryType jewelryType) {
        this.id = id;
        this.metal = metal;
        this.stone = stone;
        this.price = price;
        this.jewelryType = jewelryType;
    }

    public Jewelry() {

    }


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override // overriding the class "Jewelry
    public String toString() { // returning a string that includes the values of instance variables of the Jewelry
        return "Jewelry{" +
                "id=" + id +
                ", metal='" + metal + '\'' + // metal & stone in single quotes
                ", stone='" + stone + '\'' + // bc this isnt returning a numeric value
                ", price=" + price + // not returning the single quotes bc it is a numeric value
                ", jewelryType=" + jewelryType +
                '}';
    }

    public String getMetal() {
        return metal;
    }

    public void setMetal(String metal) {
        this.metal = metal;
    }

    public String getStone() {
        return stone;
    }

    public void setStone(String stone) {
        this.stone = stone;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public JewelryType getJewelryType() {
        return jewelryType;
    }

    public void setJewelryType(JewelryType jewelryType) {
        this.jewelryType = jewelryType;
    }
}
