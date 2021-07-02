package com.przesylki.parcel.manager;

import com.przesylki.parcel.dao.ParcelRepository;
import com.przesylki.parcel.dao.entity.ParcelInternalModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParcelManager {

    private ParcelRepository parcelRepository;

    @Autowired
    public ParcelManager(ParcelRepository parcelRepository) {
        this.parcelRepository = parcelRepository;
    }

    public Iterable<ParcelInternalModel> findAll() {
        return parcelRepository.findAll();
    }

    public ParcelInternalModel save(ParcelInternalModel parcelInternalModel) {
        return parcelRepository.save(parcelInternalModel);
    }

    public void deleteById(Long id) {
        parcelRepository.deleteById(id);
    }

}
