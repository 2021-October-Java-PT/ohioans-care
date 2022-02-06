package org.ohioanscare.serverside.Models;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Address {
    @Id
    @GeneratedValue
    private Long id;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    @OneToOne
    private ZipCode zipCode;
    private String zipCodePlusFour;
    @ManyToOne
    private County county;
    @OneToOne
    private Region region;
    @OneToMany
    private Collection<OhioResource> ohioResources;

    public Address(String addressLine1, String addressLine2, String city, String state, ZipCode zipCode, String zipCodePlusFour, County county, Region region) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.zipCodePlusFour = zipCodePlusFour;
        this.county = county;
        this.region = region;
    }

    public Long getId() {
        return id;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public ZipCode getZipCode() {
        return zipCode;
    }

    public String getZipCodePlusFour() {
        return zipCodePlusFour;
    }

    public County getCounty() {
        return county;
    }

    public Region getRegion() {
        return region;
    }

    public Collection<OhioResource> getOhioResources() {
        return ohioResources;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZipCode(ZipCode zipCode) {
        this.zipCode = zipCode;
    }

    public void setZipCodePlusFour(String zipCodePlusFour) {
        this.zipCodePlusFour = zipCodePlusFour;
    }

    public void setCounty(County county) {
        this.county = county;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public void setOhioResources(Collection<OhioResource> ohioResources) {
        this.ohioResources = ohioResources;
    }
}