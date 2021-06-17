package com.przesylki.parcel.dao.entity;

import javax.persistence.*;

@Entity
public class Letter {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "sender_id", referencedColumnName = "id")
    private Sender sender;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "senderAddress_id", referencedColumnName = "id")
    private SenderAddress senderAddress;

    public Letter() {
    }

    public Letter(Long id, Sender sender) {
        this.id = id;
        this.sender = sender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Sender getSender() {
        return sender;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }
}
