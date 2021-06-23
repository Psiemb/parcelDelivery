package com.przesylki.parcel.mapper;

import com.przesylki.parcel.api.letter.addLetter.request.LetterRequest;
import com.przesylki.parcel.api.letter.addLetter.request.Sender2;
import com.przesylki.parcel.dao.entity.Letter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;

class LetterRequestMapperTest {

    private LetterRequestMapper letterRequestMapper;

    @BeforeEach
    void setUp() {
        this.letterRequestMapper = new LetterRequestMapper();
    }

    @Test
    void returnNullWhenLetterRequestIsNull() {

        //given

        //when

        //then

        assertNull(letterRequestMapper.mapToLetter(null));
    }

    @Test
    void returnNullWhenLetterRequestSender2IsNull() {

        //given
        LetterRequest letterRequest = new LetterRequest();
        letterRequest.setSender2(null);

        //when

        Letter letter = letterRequestMapper.mapToLetter(letterRequest);

        //then

        assertNull(letter);

    }

    @Test
    void returnNullWhenLetterRequestSender2Surname2IsNull() {

        //given
        LetterRequest letterRequest = new LetterRequest();
        Sender2 sender2 = new Sender2();
        sender2.setSurname2(null);

        //when

        Letter letter = letterRequestMapper.mapToLetter(letterRequest);

        //then

        assertNull(letter);


    }
}