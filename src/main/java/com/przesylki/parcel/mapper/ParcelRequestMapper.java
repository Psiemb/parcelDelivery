package com.przesylki.parcel.mapper;

import com.przesylki.parcel.dao.entity.ParcelInternalModel;
import com.przesylki.parcel.request.ParcelRequest;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class ParcelRequestMapper {

    public ParcelInternalModel mapToParcel(ParcelRequest parcelRequest){
        if(Objects.isNull(parcelRequest) || (parcelRequest.getPostcode() < 0)){
            return null;
        }

        ParcelInternalModel parcelInternalModel = new ParcelInternalModel();
        parcelInternalModel.setCity(parcelRequest.getCity());
        parcelInternalModel.setPostcode(parcelRequest.getPostcode());
        parcelInternalModel.setHomeNo(parcelRequest.getHomeNo());
        parcelInternalModel.setFlatNo(parcelRequest.getFlatNo());
        parcelInternalModel.setSafeDelivery(parcelRequest.isSafeDelivery());

        return parcelInternalModel;
    }


}
