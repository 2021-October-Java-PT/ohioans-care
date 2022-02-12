package org.ohioanscare.serverside.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Region {

    @Id
    @GeneratedValue
    private Long id;
    private String region;
    @OneToMany(mappedBy = "region")
    @JsonIgnore
    private Collection<County> county;
    @OneToMany(mappedBy = "region")
    @JsonIgnore
    private Collection<Address> addresses;


    public Region(String region) {
        this.region = region;
    }

    public Region() {}


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Collection<County> getCounty() {
        return county;
    }

    public void setCounty(Collection<County> county) {
        this.county = county;
    }
}
