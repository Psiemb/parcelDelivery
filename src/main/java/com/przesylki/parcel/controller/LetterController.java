package com.przesylki.parcel.controller;

import com.przesylki.parcel.api.letter.addLetter.request.LetterRequest;
import com.przesylki.parcel.api.letter.getAll.response.LetterInfo;
import com.przesylki.parcel.dao.entity.Letter;
import com.przesylki.parcel.manager.LetterManager;
import com.przesylki.parcel.mapper.LetterInfoMapper;
import com.przesylki.parcel.mapper.LetterRequestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
public class LetterController {

    private final LetterManager letterManager;
    private final LetterRequestMapper letterRequestMapper;

    @Autowired
    public LetterController(LetterManager letterManager, LetterRequestMapper letterRequestMapper) {
        this.letterManager = letterManager;
        this.letterRequestMapper = letterRequestMapper;
    }

    @PostMapping("/addLetter")
    public ResponseEntity<Void> addLetter(@RequestBody @Valid LetterRequest letterRequest) {
        if (Objects.isNull(letterRequest)) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

        Letter letter = letterRequestMapper.mapToLetter(letterRequest);
        letterManager.add(letter);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/getAll")
    public ResponseEntity<LetterInfo> getAll() {

        Iterable<Letter> all = letterManager.getAll();

        List<Letter> result = new ArrayList<>();
        all.forEach(result::add);

        LetterInfoMapper letterInfoMapper = new LetterInfoMapper();
        LetterInfo letterInfo = letterInfoMapper.mapToResponse(result);

        return ResponseEntity.status(HttpStatus.OK).body(letterInfo);
    }

}

