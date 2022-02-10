package org.ohioanscare.serverside.Models;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Region {

    @Id
    @GeneratedValue
    private Long id;
    private String region;
    @OneToMany(mappedBy = "region")
    private Collection<County> county;
//    @ManyToMany(mappedBy = "region")
//    private Collection<OhioResource> ohioResources;

    public Region(String region) {
        this.region = region;
    }

    public Region() {}

    public Long getId() {
        return id;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
