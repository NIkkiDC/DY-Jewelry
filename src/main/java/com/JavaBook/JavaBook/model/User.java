package com.JavaBook.JavaBook.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {


    @Id // id attributes below. Once You enter @Entity / @Table w/o an id attribute an error will be thrown
    // the error will go away once you create the id attributes, which are below.
    @Column
    @GeneratedValue
    private Long id;

    @Column // creating column
    private String userName;

    @Column(unique = true) // creating column
    private String emailAddress;

    @Column // creating column
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY) //converted to JSON when writing to a JSON string and not converted from JSON when reading from a JSON string
    private String password; // ^ this is used to hide the password

    public User(){

    }

    public User(Long id, String userName, String emailAddress, String password) {
        this.id = id;
        this.userName = userName;
        this.emailAddress = emailAddress;
        this.password = password;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
