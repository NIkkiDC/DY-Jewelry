package com.JavaBook.JavaBook.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

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
    private Double price;  //metal type, stone type, and price range

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "beverageType_id")
    private JewelryType jewelryType;


    public Jewelry() {
    }

    public Jewelry(Long id, String metal, String stone, Double price, User user, JewelryType jewelryType) {
        this.id = id;
        this.metal = metal;
        this.stone = stone;
        this.price = price;
        this.user = user;
        this.jewelryType = jewelryType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public JewelryType getJewelryType() {
        return jewelryType;
    }

    public void setJewelryType(JewelryType jewelryType) {
        this.jewelryType = jewelryType;
    }

    @Override
    public String toString() {
        return "Jewelry{" +
                "id=" + id +
                ", metal='" + metal + '\'' +
                ", stone='" + stone + '\'' +
                ", price=" + price +
                ", user=" + user +
                ", jewelryType=" + jewelryType +
                '}';
    }
}
