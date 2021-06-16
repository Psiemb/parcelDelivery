package com.przesylki.parcel.dao.entity;

import javax.persistence.Entity;

@Entity
public class Sender {

    private Long id;
    private String surname;

    public Sender() {
    }

    public Sender(Long id, String surname) {
        this.id = id;
        this.surname = surname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
