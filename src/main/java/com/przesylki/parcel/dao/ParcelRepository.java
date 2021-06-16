package com.przesylki.parcel.dao;

import com.przesylki.parcel.dao.entity.ParcelInternalModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParcelRepository extends CrudRepository<ParcelInternalModel,Long> {

}
