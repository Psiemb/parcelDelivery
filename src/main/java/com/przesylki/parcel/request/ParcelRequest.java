package com.przesylki.parcel.request;

import com.przesylki.parcel.dao.entity.Size;

public class ParcelRequest {

    private int postcode;
    private String city;
    private String streetName;
    private String homeNo;
    private String flatNo;
    private Size size;
    private boolean safeDelivery;

    public ParcelRequest(int postcode, String city, String streetName, String homeNo, String flatNo, Size size, boolean safeDelivery) {
        this.postcode = postcode;
        this.city = city;
        this.streetName = streetName;
        this.homeNo = homeNo;
        this.flatNo = flatNo;
        this.size = size;
        this.safeDelivery = safeDelivery;
    }

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
