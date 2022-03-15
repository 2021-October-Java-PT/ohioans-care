package org.ohioanscare.serverside.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class County {
    @Id
    @GeneratedValue
    private Long id;
    private String county;
    @ManyToOne
    @JsonIgnore
    private Region region;
    @OneToMany(mappedBy = "county")
    @JsonIgnore
    private Collection<Address> address;


    public County(String county) {
        this.county = county;
    }

    public County() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public Collection<Address> getAddress() {
        return address;
    }

    public void setAddress(Collection<Address> address) {
        this.address = address;
    }
}
