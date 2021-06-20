package com.przesylki.parcel.api.letter.addLetter.request;

import com.przesylki.parcel.dao.entity.Type;

public class Information2 {

    private Long id;
    private int size;
    private Type type;

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
}
