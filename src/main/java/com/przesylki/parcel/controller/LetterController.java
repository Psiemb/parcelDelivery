package com.przesylki.parcel.controller;

import com.przesylki.parcel.dao.entity.Letter;
import com.przesylki.parcel.dao.entity.Sender;
import com.przesylki.parcel.manager.LetterManager;
import com.przesylki.parcel.mapper.ParcelInfoMapper;
import com.przesylki.parcel.response.LetterInfo;
import com.przesylki.parcel.response.ParcelInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LetterController {

    private LetterManager letterManager;

    @Autowired
    public LetterController(LetterManager letterManager) {
        this.letterManager = letterManager;
    }

    @PostMapping("/addLetter")
    public ResponseEntity<Void> addLetter() {

        Sender sender = new Sender();
        sender.setSurname("Michal");

        Letter letter = new Letter();
        letter.setSender(sender);

        letterManager.add(letter);
//
//
//        daoManger.save(letter);

        // wchodzisz w console (localhost8080/console) i sprawdzasz czy sie zapisał letter oraz sender

        return ResponseEntity.ok().build();

    }
    @GetMapping("/getAll")
    public ResponseEntity<List<Letter>> getAll(){

        Iterable<Letter> all = letterManager.getAll();

        List<Letter> result = new ArrayList<>();
        all.forEach(result::add);



//        ParcelInfoMapper parcelInfoMapper = new ParcelInfoMapper();
//        ParcelInfo parcelInfoResponse = parcelInfoMapper.mapToResponse(result);

        return ResponseEntity.status(HttpStatus.OK).body(result);
    }



}

