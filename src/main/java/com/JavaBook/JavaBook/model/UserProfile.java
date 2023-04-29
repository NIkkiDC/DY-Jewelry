package com.JavaBook.JavaBook.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "profiles")
public class UserProfile {


    @Id
    private Long id;

    // I have to go in, and make private, but right now i am having issues w/ my security

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
