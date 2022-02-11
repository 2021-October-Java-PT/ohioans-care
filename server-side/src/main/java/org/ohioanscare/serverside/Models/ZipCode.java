package org.ohioanscare.serverside.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ZipCode {
    @Id
    @GeneratedValue
    private Long id;
    private String zipCode;
    private String zipCodePlusFour;


    public ZipCode(String zipCode, String zipCodePlusFour) {
        this.zipCode = zipCode;
        this.zipCodePlusFour = zipCodePlusFour;
    }

    public ZipCode() {}


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getZipCodePlusFour() {
        return zipCodePlusFour;
    }

    public void setZipCodePlusFour(String zipCodePlusFour) {
        this.zipCodePlusFour = zipCodePlusFour;
    }
}
