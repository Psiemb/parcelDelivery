package com.przesylki.parcel.response;

import java.util.List;

public class ParcelInfo {

    private List<ParcelResponse> parcelResponses;
    private int noOfParcels;

    public ParcelInfo() {
    }

    public ParcelInfo(List<ParcelResponse> parcelResponses, int noOfParcels) {
        this.parcelResponses = parcelResponses;
        this.noOfParcels = noOfParcels;
    }

    public List<ParcelResponse> getParcelResponses() {
        return parcelResponses;
    }

    public void setParcelResponses(List<ParcelResponse> parcelResponses) {
        this.parcelResponses = parcelResponses;
    }

    public int getNoOfParcels() {
        return noOfParcels;
    }

    public void setNoOfParcels(int noOfParcels) {
        this.noOfParcels = noOfParcels;
    }
}
