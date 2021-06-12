package com.przesylki.parcel.mapper;

import com.przesylki.parcel.dao.entity.Parcel;
import com.przesylki.parcel.request.ParcelRequest;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class ParcelRequestMapper {

    public Parcel mapToParcel(ParcelRequest parcelRequest){
        if(Objects.isNull(parcelRequest) || (parcelRequest.getPostcode() < 0)){
            return null;
        }

        Parcel parcel = new Parcel();
        parcel.setCity(parcelRequest.getCity());
        parcel.setPostcode(parcelRequest.getPostcode());
        parcel.setHomeNo(parcelRequest.getHomeNo());
        parcel.setFlatNo(parcelRequest.getFlatNo());
        parcel.setSafeDelivery(parcelRequest.isSafeDelivery());

        return parcel;
    }


}
