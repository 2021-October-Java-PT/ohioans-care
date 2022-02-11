package org.ohioanscare.serverside.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class City {
    @Id
    @GeneratedValue
    private Long id;
    private String city;
    @OneToMany(mappedBy = "city")
    @JsonIgnore
    private Collection<Address> addresses;


    public City(String city) {
        this.city = city;
    }

    public City() {}


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Collection<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Collection<Address> addresses) {
        this.addresses = addresses;
    }
}
