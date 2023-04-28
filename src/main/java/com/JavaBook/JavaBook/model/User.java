package com.JavaBook.JavaBook.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {


    @Id // id attributes below. Once You enter @Entity / @Table w/o an id attribute an error will be thrown
    // the error will go away once you create the id attributes, which are below.
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
