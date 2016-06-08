package com.mykhaylenko.hibernate.model.inheritance;

import javax.persistence.Entity;

/**
 * Created by Pavlo.Mykhaylenko on 5/25/2016.
 */
@Entity
public class LocalAddress extends Address {

    private String city;
    private String Street;
    private String building;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }
}
