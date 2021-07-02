package com.przesylki.parcel.api.parcel.add.request;

import com.przesylki.parcel.dao.entity.Size;

import javax.validation.constraints.NotBlank;

public class ParcelRequest {

    @NotBlank
    private String city;

    @NotBlank
    private String streetName;

    private int postcode;
    private String homeNo;
    private String flatNo;
    private Size size;
    private boolean safeDelivery;

    public ParcelRequest() {
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getHomeNo() {
        return homeNo;
    }

    public void setHomeNo(String homeNo) {
        this.homeNo = homeNo;
    }

    public String getFlatNo() {
        return flatNo;
    }

    public void setFlatNo(String flatNo) {
        this.flatNo = flatNo;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public boolean isSafeDelivery() {
        return safeDelivery;
    }

    public void setSafeDelivery(boolean safeDelivery) {
        this.safeDelivery = safeDelivery;
    }
}
