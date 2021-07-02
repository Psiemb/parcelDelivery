package com.przesylki.parcel.controller;

import com.przesylki.parcel.api.parcel.add.request.ParcelRequest;
import com.przesylki.parcel.api.parcel.all.response.ParcelInfo;
import com.przesylki.parcel.dao.entity.ParcelInternalModel;
import com.przesylki.parcel.manager.ParcelManager;
import com.przesylki.parcel.mapper.ParcelInfoMapper;
import com.przesylki.parcel.mapper.ParcelRequestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
public class ParcelController {

    private final ParcelManager parcelManager;
    private final ParcelRequestMapper parcelRequestMapper;

    @Autowired
    public ParcelController(ParcelManager parcelManager, ParcelRequestMapper parcelRequestMapper) {
        this.parcelManager = parcelManager;
        this.parcelRequestMapper = parcelRequestMapper;
    }

//    @GetMapping("/all")
//    public Iterable<Parcel> getAll() {
//        Iterable<Parcel> all = parcelManager.findAll();
//        return all;
//    }

    @GetMapping("/all")
    public ResponseEntity<ParcelInfo> getAll() {
        Iterable<ParcelInternalModel> all = parcelManager.findAll();

        List<ParcelInternalModel> result = new ArrayList<>();
        all.forEach(result::add);

        ParcelInfoMapper parcelInfoMapper = new ParcelInfoMapper();
        ParcelInfo parcelInfoResponse = parcelInfoMapper.mapToResponse(result);
//        List<NoweGobiekty> collect = result.stream()
//                .filter()
//                .map()
//                .filter(
//                )
//                .collect(Collectors.toList());

        //mapper, który zmieni all na jakiś obiekt response
        return ResponseEntity.ok().body(parcelInfoResponse);
    }
//    @GetMapping("/all")
//    public ResponseEntity<Iterable<ParcelInternalModel>> getAll() {
//        Iterable<ParcelInternalModel> all = parcelManager.findAll();
//
//        List<ParcelInternalModel> result = new ArrayList<ParcelInternalModel>();
//        all.forEach(result::add);
//
//        List<NoweGobiekty> collect = result.stream()
//                .filter()
//                .map()
//                .filter(
//                )
//                .collect(Collectors.toList());

    //mapper, który zmieni all na jakiś obiekt response
//        return ResponseEntity.ok().body(result);
//    }

    @PostMapping("/add")
    public ResponseEntity<Void> addParcel(@RequestBody @Valid ParcelRequest parcelRequest) {
        if (Objects.isNull(parcelRequest)) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
        ParcelInternalModel parcelInternalModel = parcelRequestMapper.mapToParcel(parcelRequest);
        parcelManager.save(parcelInternalModel);

        return ResponseEntity.status((HttpStatus.CREATED)).build();
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Void> deleteParcel(@RequestParam Long index) {
        parcelManager.deleteById(index);
        return ResponseEntity.ok().build();
    }
}
