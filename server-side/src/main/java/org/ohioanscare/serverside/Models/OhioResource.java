package org.ohioanscare.serverside.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@Entity
public class OhioResource {
    @Id
    @GeneratedValue
    private Long id;
    private String entityName;
    private String organizationName;
    @Lob
    private String description;
    private String serving;
    private String sunHours; //Format ---> HH:MM - HH:MM (12-hour format)
    private String monHours; //Format ---> HH:MM - HH:MM (12-hour format)
    private String tuesHours; //Format ---> HH:MM - HH:MM (12-hour format)
    private String wedHours; //Format ---> HH:MM - HH:MM (12-hour format)
    private String thursHours; //Format ---> HH:MM - HH:MM (12-hour format)
    private String friHours; //Format ---> HH:MM - HH:MM (12-hour format)
    private String satHours; //Format ---> HH:MM - HH:MM (12-hour format)
    private String websiteUrl;
    private String phone;
    private String languages;
    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;
    @ManyToMany
    private Collection<Service> services;


    public OhioResource(String entityName, String organizationName, String description, String serving, String sunHours, String monHours, String tuesHours, String wedHours, String thursHours, String friHours, String satHours, String websiteUrl, String phone, String languages, Address address, Service... services) {
        this.entityName = entityName;
        this.organizationName = organizationName;
        this.description = description;
        this.serving = serving;
        this.sunHours = sunHours;
        this.monHours = monHours;
        this.tuesHours = tuesHours;
        this.wedHours = wedHours;
        this.thursHours = thursHours;
        this.friHours = friHours;
        this.satHours = satHours;
        this.websiteUrl = websiteUrl;
        this.phone = phone;
        this.languages = languages;
        this.address = address;
        this.services = new ArrayList<>(Arrays.asList(services));
    }

    public OhioResource() {}


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getServing() {
        return serving;
    }

    public void setServing(String serving) {
        this.serving = serving;
    }

    public String getSunHours() {
        return sunHours;
    }

    public void setSunHours(String sunHours) {
        this.sunHours = sunHours;
    }

    public String getMonHours() {
        return monHours;
    }

    public void setMonHours(String monHours) {
        this.monHours = monHours;
    }

    public String getTuesHours() {
        return tuesHours;
    }

    public void setTuesHours(String tuesHours) {
        this.tuesHours = tuesHours;
    }

    public String getWedHours() {
        return wedHours;
    }

    public void setWedHours(String wedHours) {
        this.wedHours = wedHours;
    }

    public String getThursHours() {
        return thursHours;
    }

    public void setThursHours(String thursHours) {
        this.thursHours = thursHours;
    }

    public String getFriHours() {
        return friHours;
    }

    public void setFriHours(String friHours) {
        this.friHours = friHours;
    }

    public String getSatHours() {
        return satHours;
    }

    public void setSatHours(String satHours) {
        this.satHours = satHours;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Collection<Service> getServices() {
        return services;
    }

    public void setServices(Collection<Service> services) {
        this.services = services;
    }
}
