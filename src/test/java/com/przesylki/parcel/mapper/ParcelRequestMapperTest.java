package com.przesylki.parcel.mapper;

import com.przesylki.parcel.dao.entity.Parcel;
import com.przesylki.parcel.request.ParcelRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;

class ParcelRequestMapperTest {

    private  ParcelRequestMapper parcelRequestMapper;

    @BeforeEach
    void SetUp(){
        this.parcelRequestMapper = new ParcelRequestMapper();
    }

    @Test
    void returnNullWhenParcelRequestIsNull(){

        //given

        //when

        //then

        assertNull(parcelRequestMapper.mapToParcel(null));
    }

    @Test
    void returnNullWhenParcelPostCodeIsMinus(){

        //given
        ParcelRequest parcelRequest = new ParcelRequest();
        parcelRequest.setPostcode(-213);

        //when
        Parcel parcel = parcelRequestMapper.mapToParcel(parcelRequest);

        //then
        assertNull(parcel);
    }

}