package com.przesylki.parcel.dao.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class CreatedAt {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Date createDate;

    public CreatedAt() {
    }

    public CreatedAt(Date createDate) {
        this.createDate = createDate;
    }

    //    @OneToOne(mappedBy = "createdAt")
//    private Letter letter;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

//    public Letter getLetter() {
//        return letter;
//    }
//
//    public void setLetter(Letter letter) {
//        this.letter = letter;
//    }
}
