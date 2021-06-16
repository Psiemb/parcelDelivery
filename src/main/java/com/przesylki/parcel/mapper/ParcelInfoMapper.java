package com.przesylki.parcel.mapper;

import com.przesylki.parcel.dao.entity.ParcelInternalModel;
import com.przesylki.parcel.response.ParcelInfo;
import com.przesylki.parcel.response.ParcelResponse;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class ParcelInfoMapper {

    public ParcelInfo mapToResponse(List<ParcelInternalModel> parcelInternalModels) {
        if (CollectionUtils.isEmpty(parcelInternalModels)) {
            return null;
        }

        List<ParcelResponse> parcelResponses = parcelInternalModels.stream()
//                .filter(parcelInternalModel -> Objects.nonNull(parcelInternalModel))
                .filter(Objects::nonNull)
//                .map(parcelInternalModel -> toParcelResponse(parcelInternalModel))
                .map(this::toParcelResponse)
                .collect(Collectors.toList());

        ParcelInfo parcelInfo = new ParcelInfo();
        parcelInfo.setParcelResponses(parcelResponses);
        parcelInfo.setNoOfParcels(parcelResponses.size());

        return parcelInfo;
    }

    private ParcelResponse toParcelResponse(ParcelInternalModel parcelInternalModel) {
        ParcelResponse parcelResponse = new ParcelResponse();
        parcelResponse.setDate(parcelInternalModel.getDate());
        parcelResponse.setPostcode(parcelInternalModel.getPostcode());
        parcelResponse.setCity(parcelInternalModel.getCity());
        parcelResponse.setStreetName(parcelInternalModel.getStreetName());
        parcelResponse.setHomeNo(parcelInternalModel.getHomeNo());
        parcelResponse.setFlatNo(parcelInternalModel.getFlatNo());
        parcelResponse.setSafeDelivery(parcelInternalModel.isSafeDelivery());

        return parcelResponse;
    }

}
