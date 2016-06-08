package com.mykhaylenko.hibernate.model.composition;

import javax.persistence.Embeddable;

/**
 * Created by Pavlo.Mykhaylenko on 5/27/2016.
 */
@Embeddable
public class PersonalInformation {

    private String firstName;
    private String secondName;

    public PersonalInformation() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
}
