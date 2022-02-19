package org.ohioanscare.serverside.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Collection;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String email;

    @ManyToOne
    private ZipCode zipCode;


    public User() {

    }

    public User(String firstName, String lastName, String userName, String password, String email, ZipCode zipCode){
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.zipCode = zipCode;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public Collection<ZipCode> getZipCode() {
        return (Collection<ZipCode>) zipCode;
    }
}
