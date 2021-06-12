package com.przesylki.parcel.dao;

import com.przesylki.parcel.dao.entity.Parcel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParcelRepository extends CrudRepository<Parcel,Long> {

}
