package com.przesylki.parcel.api.letter.addLetter.request;

import com.przesylki.parcel.dao.entity.Type;

public class Information2 {

    private int size;
    private Type type;

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
