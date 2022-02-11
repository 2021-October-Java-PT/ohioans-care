package org.ohioanscare.serverside.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;

@Entity
public class Service {
    @Id
    @GeneratedValue
    private Long id;
    private String service;
    @ManyToMany(mappedBy = "services")
    @JsonIgnore
    private Collection<OhioResource> ohioResources;


    public Service(String service) {
        this.service = service;
    }

    public Service() {}


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public Collection<OhioResource> getOhioResources() {
        return ohioResources;
    }

    public void setOhioResources(Collection<OhioResource> ohioResources) {
        this.ohioResources = ohioResources;
    }
}
