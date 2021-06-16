package com.przesylki.parcel.controller;

import com.przesylki.parcel.dao.entity.Letter;
import com.przesylki.parcel.dao.entity.Sender;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LetterController {

    @PostMapping("/addLetter")
    public ResponseEntity<Void> addLetter() {

        Sender sender = new Sender();
        sender.setSurname("Michal");

        Letter letter = new Letter();
        letter.setSender(sender);
//
//
//        daoManger.save(letter);

        // wchodzisz w console (localhost8080/console) i sprawdzasz czy sie zapisał letter oraz sender

        return ResponseEntity.ok().build();

    }
}

