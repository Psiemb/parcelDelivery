package com.przesylki.parcel.api.letter.addLetter.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Sender2 {

    @NotBlank
    private String surname2;
    @NotBlank
    private int phoneNumber2;
    @NotBlank
    private String email2;

    public String getSurname2() {
        return surname2;
    }

    public void setSurname2(String surname2) {
        this.surname2 = surname2;
    }

    public int getPhoneNumber2() {
        return phoneNumber2;
    }

    public void setPhoneNumber2(int phoneNumber2) {
        this.phoneNumber2 = phoneNumber2;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }
}
