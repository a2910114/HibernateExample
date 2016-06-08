package com.mykhaylenko.hibernate.model.associations;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Pavlo.Mykhaylenko on 5/25/2016.
 */
@Entity
public class Car implements Serializable{

    @Id
    private long id;
    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Wheel> wheels;

    public Car() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public void setWheels(List<Wheel> wheels) {
        this.wheels = wheels;
    }
}
