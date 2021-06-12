package com.przesylki.parcel.manager;

import com.przesylki.parcel.dao.ParcelRepository;
import com.przesylki.parcel.dao.entity.Parcel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParcelManager {

    private ParcelRepository parcelRepository;

    @Autowired
    public ParcelManager(ParcelRepository parcelRepository) {
        this.parcelRepository = parcelRepository;
    }

    public Iterable<Parcel> findAll() {
        return parcelRepository.findAll();
    }

    public Parcel save(Parcel parcel){
        return parcelRepository.save(parcel);
    }

    public boolean deleteById(Long id){
         parcelRepository.deleteById(id);
        return false;
    }

}
