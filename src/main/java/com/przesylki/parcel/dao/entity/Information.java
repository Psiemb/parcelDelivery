package com.przesylki.parcel.dao.entity;

import javax.persistence.*;


@Entity
public class Information {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int size;
    private Type type;

    @OneToOne(mappedBy = "information")
    private Letter letter;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Letter getLetter() {
        return letter;
    }

    public void setLetter(Letter letter) {
        this.letter = letter;
    }
}
