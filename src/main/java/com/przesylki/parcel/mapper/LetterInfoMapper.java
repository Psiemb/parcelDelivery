package com.przesylki.parcel.mapper;

import com.przesylki.parcel.dao.LetterRepository;
import com.przesylki.parcel.dao.entity.Letter;
import com.przesylki.parcel.response.LetterInfo;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Objects;

//@Component
//public class LetterInfoMapper {
//
//    public LetterInfo mapToLetterInfoResponse(List<Letter> letters) {
//        if (CollectionUtils.isEmpty(letters)) {
//            return null;
//        }
//        letters.stream()
//                .filter(Objects::nonNull)
//                .map(this::toLetterResponse)
//    }
//
//    private LetterReponse toLetterResponse(Letter letter) {
//    }
//
//}
