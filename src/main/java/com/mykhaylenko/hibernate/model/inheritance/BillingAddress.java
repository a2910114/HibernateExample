package com.mykhaylenko.hibernate.model.inheritance;

import javax.persistence.Entity;

/**
 * Created by Pavlo.Mykhaylenko on 5/25/2016.
 */
@Entity
public class BillingAddress extends Address {

    private String bank;
    private String bankAccount;

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }
}
