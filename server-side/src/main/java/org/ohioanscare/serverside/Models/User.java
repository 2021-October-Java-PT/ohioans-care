package org.ohioanscare.serverside.Models;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

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

    @ManyToMany
    private Collection<OhioResource> resources;


    public User() {

    }

    public User(String firstName, String lastName, String userName, String password, String email, ZipCode zipCode, OhioResource ...resources){
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.zipCode = zipCode;
        this.resources = new HashSet<>(Arrays.asList(resources));
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

    public ZipCode getZipCode() {
        return zipCode;
    }

    public Collection<OhioResource> getResources() {
        return resources;
    }
}
