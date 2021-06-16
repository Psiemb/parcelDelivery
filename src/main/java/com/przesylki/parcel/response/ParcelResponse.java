package com.przesylki.parcel.response;

import com.przesylki.parcel.dao.entity.Size;

import java.util.Date;

public class ParcelResponse {

    private Date date;
    private int postcode;
    private String city;
    private String streetName;
    private String homeNo;
    private String flatNo;
    private boolean safeDelivery;

    public ParcelResponse(Date date, int postcode, String city, String streetName, String homeNo, String flatNo, boolean safeDelivery) {
        this.date = date;
        this.postcode = postcode;
        this.city = city;
        this.streetName = streetName;
        this.homeNo = homeNo;
        this.flatNo = flatNo;
        this.safeDelivery = safeDelivery;
    }

    public ParcelResponse() {

    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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

    public boolean isSafeDelivery() {
        return safeDelivery;
    }

    public void setSafeDelivery(boolean safeDelivery) {
        this.safeDelivery = safeDelivery;
    }
}
