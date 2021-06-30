package com.przesylki.parcel.dao.entity;

import javax.persistence.*;

@Entity
public class Receiver {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String surname;
    private String phoneNumber;
    private String email;

//    @OneToOne(mappedBy = "receiver")
//    private Letter letter;

    public Receiver() {
    }

    public Receiver(String name, String surname, String phoneNumber, String email) {
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public Letter getLetter() {
//        return letter;
//    }
//
//    public void setLetter(Letter letter) {
//        this.letter = letter;
//    }
}
