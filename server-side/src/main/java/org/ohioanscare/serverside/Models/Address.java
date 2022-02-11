package org.ohioanscare.serverside.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Address {
    @Id
    @GeneratedValue
    private Long id;
    private String addressLine1;
    private String addressLine2;
    @ManyToOne
    private City city;
    @ManyToOne
    private County county;
    private String state;
    @OneToOne
    private ZipCode zipCode;
    @ManyToOne
    private Region region;
    @OneToMany
    @JsonIgnore
    private Collection<OhioResource> ohioResources;


    public Address(String addressLine1, String addressLine2, City city, County county, String state, ZipCode zipCode, Region region) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.county = county;
        this.state = state;
        this.zipCode = zipCode;
        this.region = region;
    }

    public Address() {}


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public County getCounty() {
        return county;
    }

    public void setCounty(County county) {
        this.county = county;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ZipCode getZipCode() {
        return zipCode;
    }

    public void setZipCode(ZipCode zipCode) {
        this.zipCode = zipCode;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public Collection<OhioResource> getOhioResources() {
        return ohioResources;
    }

    public void setOhioResources(Collection<OhioResource> ohioResources) {
        this.ohioResources = ohioResources;
    }
}