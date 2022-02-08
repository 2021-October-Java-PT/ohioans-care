package org.ohioanscare.serverside.Models;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class OhioResource {
    @Id
    @GeneratedValue
    private Long id;
    private String entityName;
    private String organizationName;
    private String description;
    private String mainServices;
    private String serving;
    private String hours; //Format ---> HH:MM - HH:MM (12-hour format)
    private String websiteUrl;
    private String phone;
    private String languages;
    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;
    @ManyToMany
    private Collection<Region> region;

    public OhioResource(String entityName, String organizationName, String description, String mainServices, String serving, String hours, String websiteUrl, String phone, String languages, Address address) {
        this.entityName = entityName;
        this.organizationName = organizationName;
        this.description = description;
        this.mainServices = mainServices;
        this.serving = serving;
        this.hours = hours;
        this.websiteUrl = websiteUrl;
        this.phone = phone;
        this.languages = languages;
        this.address = address;
    }

    public OhioResource() {}

    public Long getId() {
        return id;
    }

    public String getEntityName() {
        return entityName;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public String getDescription() {
        return description;
    }

    public String getMainServices() {
        return mainServices;
    }

    public String getServing() {
        return serving;
    }

    public String getHours() {
        return hours;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public String getPhone() {
        return phone;
    }

    public String getLanguages() {
        return languages;
    }

    public Address getAddress() {
        return address;
    }

    public Collection<Region> getRegion() {
        return region;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setMainServices(String mainServices) {
        this.mainServices = mainServices;
    }

    public void setServing(String serving) {
        this.serving = serving;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setRegion(Collection<Region> region) {
        this.region = region;
    }
}
