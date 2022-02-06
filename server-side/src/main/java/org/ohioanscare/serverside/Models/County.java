package org.ohioanscare.serverside.Models;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class County {
    @Id
    @GeneratedValue
    private Long id;
    private String county;
    @ManyToOne
    private Region region;
    @ManyToMany(mappedBy = "county")
    private Collection<ZipCode> zipCode;
    @OneToMany(mappedBy = "county")
    private Collection<Address> address;

    public County(String county) {
        this.county = county;
    }

    public County() {}

    public Long getId() {
        return id;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }
}
