package com.przesylki.parcel.dao.entity;

import javax.persistence.*;

@Entity
public class Sender {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String surname;
    private int phoneNumber;
    private String email;

    @OneToOne(mappedBy = "sender")
    private Letter letter;

    public Sender() {
    }

    public Sender(Long id, String surname, int phoneNumber, String email) {
        this.id = id;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.email = email;

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

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
