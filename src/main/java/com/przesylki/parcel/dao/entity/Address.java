package com.przesylki.parcel.dao.entity;

public class Address {

    private int postcode;
    private String city;
    private String streetName;
    private String homeNo;
    private String flatNo;

    public Address() {
    }

    public Address(int postcode, String city, String streetName, String homeNo, String flatNo) {
        this.postcode = postcode;
        this.city = city;
        this.streetName = streetName;
        this.homeNo = homeNo;
        this.flatNo = flatNo;
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
}
