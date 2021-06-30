package com.przesylki.parcel.api.letter.getAll.response;

import java.util.List;

public class LetterInfo {

    private List<LetterResponse> letters;
    private int numberOfLetters;

    public LetterInfo() {
    }

    public List<LetterResponse> getLetters() {
        return letters;
    }

    public void setLetters(List<LetterResponse> letters) {
        this.letters = letters;
    }

    public int getNumberOfLetters() {
        return numberOfLetters;
    }

    public void setNumberOfLetters(int numberOfLetters) {
        this.numberOfLetters = numberOfLetters;
    }
}
