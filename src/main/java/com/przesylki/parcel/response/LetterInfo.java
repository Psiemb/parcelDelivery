package com.przesylki.parcel.response;

import com.przesylki.parcel.dao.entity.Letter;

import java.util.List;

public class LetterInfo {

    private List<Letter> letters;

    public LetterInfo() {
    }

    public LetterInfo(List<Letter> letters) {
        this.letters = letters;
    }

    public List<Letter> getLetters() {
        return letters;
    }

    public void setLetters(List<Letter> letters) {
        this.letters = letters;
    }

}
