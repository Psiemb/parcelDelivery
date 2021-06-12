package com.przesylki.parcel.controller;

import com.przesylki.parcel.dao.entity.Parcel;
import com.przesylki.parcel.manager.ParcelManager;
import com.przesylki.parcel.mapper.ParcelRequestMapper;
import com.przesylki.parcel.request.ParcelRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
public class ParcelApi {

    private final ParcelManager parcelManager;
    private final ParcelRequestMapper parcelRequestMapper;

    @Autowired
    public ParcelApi(ParcelManager parcelManager, ParcelRequestMapper parcelRequestMapper) {
        this.parcelManager = parcelManager;
        this.parcelRequestMapper = parcelRequestMapper;
    }

//    @GetMapping("/all")
//    public Iterable<Parcel> getAll() {
//        Iterable<Parcel> all = parcelManager.findAll();
//        return all;
//    }
    @GetMapping("/all")
    public ResponseEntity<Iterable<Parcel>> getAll() {
        Iterable<Parcel> all = parcelManager.findAll();
        return ResponseEntity.ok().body(all);
    }

    @PostMapping("/add")
    public ResponseEntity<Parcel> addParcel(@RequestBody ParcelRequest parcelRequest) {
        if(Objects.isNull(parcelRequest)){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
        Parcel parcel = parcelRequestMapper.mapToParcel(parcelRequest);
        Parcel save = parcelManager.save(parcel);

        return ResponseEntity.status((HttpStatus.CREATED)).body(save);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Void> deleteParcel(@RequestParam Long index) {
        parcelManager.deleteById(index);
        return ResponseEntity.ok().build();
    }
}
