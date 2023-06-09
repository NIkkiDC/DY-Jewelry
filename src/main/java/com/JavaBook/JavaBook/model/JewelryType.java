package com.JavaBook.JavaBook.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

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

    @OneToMany(mappedBy = "jewelryType", orphanRemoval = true)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Jewelry> jewelryList;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonIgnore
    private User user;

    public JewelryType() {
    }

    public JewelryType(Long id, String brand, String description) {
        this.id = id;
        this.brand = brand;
        this.description = description;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "JewelryType{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
    public List<Jewelry> getJewelryList() {return jewelryList; }

    public void setJewelryList(List<Jewelry> jewelryList) {this.jewelryList = jewelryList;}




}