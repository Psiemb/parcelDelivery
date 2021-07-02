package com.przesylki.parcel.dao;

import com.przesylki.parcel.dao.entity.Letter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LetterRepository extends CrudRepository<Letter, Long> {

}
