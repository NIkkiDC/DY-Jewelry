package com.JavaBook.JavaBook.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "profiles")
public class UserProfile {


    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY) // primary key
    private Long id;

    private String firstName;


    private String lastName;

    private String accountDescription;

    @JsonIgnore
    @OneToOne(mappedBy = "userProfile")
    private User user;





    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
