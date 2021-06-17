package com.przesylki.parcel.manager;

import com.przesylki.parcel.dao.LetterRepository;
import com.przesylki.parcel.dao.entity.Letter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LetterManager {

    private LetterRepository letterRepository;

    @Autowired
    public LetterManager(LetterRepository letterRepository) {
        this.letterRepository = letterRepository;
    }

    public Letter add(Letter letter) {
        return letterRepository.save(letter);
    }

    public Iterable<Letter> getAll() {
        return letterRepository.findAll();
    }

}
