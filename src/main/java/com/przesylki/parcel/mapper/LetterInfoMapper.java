package com.przesylki.parcel.mapper;

import com.przesylki.parcel.api.letter.getAll.response.LetterInfo;
import com.przesylki.parcel.api.letter.getAll.response.LetterResponse;
import com.przesylki.parcel.dao.entity.Letter;
import com.przesylki.parcel.dao.entity.Receiver;
import com.przesylki.parcel.dao.entity.Sender;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class LetterInfoMapper {

    public LetterInfo mapToResponse(List<Letter> letters) {
        if (CollectionUtils.isEmpty(letters)) {
            return null;
        }

        Sender sender = new Sender();
        Receiver receiver = new Receiver();
        if (sender.getPhoneNumber() < 0 || receiver.getPhoneNumber() < 0) {
            return null;
        }

        List<LetterResponse> letterResponses = letters.stream()
                .filter(Objects::nonNull)
                .map(this::toLetterResponse)
                .collect(Collectors.toList());

        LetterInfo letterInfo = new LetterInfo();
        letterInfo.setLetters(letterResponses);
        letterInfo.setNumberOfLetters(letterResponses.size());

        return letterInfo;
    }

    private LetterResponse toLetterResponse(Letter letter) {
        LetterResponse letterResponse = new LetterResponse();
        letterResponse.setSender(letter.getSender());
        letterResponse.setSenderAddress(letter.getSenderAddress());
        letterResponse.setReceiver(letter.getReceiver());
        letterResponse.setReceiverAddress(letter.getReceiverAddress());
        letterResponse.setCreatedAt(letter.getCreatedAt());
        letterResponse.setUpdatedAt(letter.getUpdatedAt());
        letterResponse.setInformation(letter.getInformation());

        return letterResponse;

    }

}

