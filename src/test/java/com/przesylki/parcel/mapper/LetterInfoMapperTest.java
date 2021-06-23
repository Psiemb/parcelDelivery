package com.przesylki.parcel.mapper;

import com.przesylki.parcel.api.letter.getAll.response.LetterInfo;
import com.przesylki.parcel.dao.entity.Letter;
import com.przesylki.parcel.dao.entity.Sender;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

class LetterInfoMapperTest {

    private LetterInfoMapper letterInfoMapper;

    @BeforeEach
    void setUp() {
        this.letterInfoMapper = new LetterInfoMapper();
    }

    @Test
    void returnNullWhenLettersIsNull() {

        //given

        //when

        //then
        assertNull(letterInfoMapper.mapToResponse(null));

    }

    @Test
    void returnNullWhenElementOnListIsNull() {

        //given
        List<Letter> letters = Arrays.asList(null, new Letter());

//        Sender sender = new Sender();
//        sender.setSurname("");
//        Letter letter = new Letter();
//        letter.setSender(sender);

        //when
        LetterInfo letterInfo = letterInfoMapper.mapToResponse(letters);

        //then

        assertNull(letterInfo);
    }

    @Test
    void returnNullWhenElementOnListIsEmpty() {

        //given
        Sender sender = new Sender();
        sender.setSurname("");
//        Letter letter = new Letter();
        List<Letter> letters = Arrays.asList(new Letter(),new Letter());

        //when
        LetterInfo letterInfo = letterInfoMapper.mapToResponse(letters);

        //then

        assertNotNull(letterInfo);
    }

}