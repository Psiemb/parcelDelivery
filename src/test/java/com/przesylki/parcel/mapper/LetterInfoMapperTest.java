package com.przesylki.parcel.mapper;

import com.przesylki.parcel.api.letter.getAll.response.LetterInfo;
import com.przesylki.parcel.dao.entity.Letter;
import com.przesylki.parcel.dao.entity.Sender;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class LetterInfoMapperTest {

    private LetterInfoMapper letterInfoMapper;

    @BeforeEach
    void setUp() {
        this.letterInfoMapper = new LetterInfoMapper();
    }

    @Test
    void checkIfResultIsOkWhenSurnameIsGiven() {

        //given
        Sender sender = new Sender();
        sender.setSurname("fdfdsf");
        Letter letter = new Letter();
        letter.setSender(sender);
        List<Letter> letters = Arrays.asList(letter);

        //when
        LetterInfo letterInfo = letterInfoMapper.mapToResponse(letters);

        //then
        assertEquals("fdfdsf", letterInfo.getLetters().get(0).getSender().getSurname());

    }

    @Test
    void checkIfResultIsOkWhenSurnamesIsGiven() {
        //given
        Sender sender = new Sender();
        sender.setSurname("fdfdsf");
        Letter letter = new Letter();
        letter.setSender(sender);

        Sender sender2 = new Sender();
        sender2.setSurname("ewrwer");
        Letter letter2 = new Letter();
        letter2.setSender(sender2);
        List<Letter> letters = Arrays.asList(letter, letter2);

        //when
        LetterInfo letterInfo = letterInfoMapper.mapToResponse(letters);

        //then
        assertEquals("fdfdsf", letterInfo.getLetters().get(0).getSender().getSurname());
        assertEquals("ewrwer", letterInfo.getLetters().get(1).getSender().getSurname());

    }

    @Test
    void returnEmptySurnameWhenGivenEmptySurname() {

        //given
        Sender sender = new Sender();
        sender.setSurname("");
        Letter letter = new Letter();
        letter.setSender(sender);
        List<Letter> letters = Arrays.asList(letter);

        //when
        LetterInfo letterInfo = letterInfoMapper.mapToResponse(letters);

        //then

        assertEquals("", letterInfo.getLetters().get(0).getSender().getSurname());
//        assertNotNull(letterInfo);
    }

    @Test
    void checkIfGivenPhoneNumberIsNotMinusThenReturnNull() {

        //given
        Sender sender = new Sender();
        sender.setPhoneNumber("-");
        Letter letter = new Letter();
        letter.setSender(sender);
        List<Letter> letters = Arrays.asList(letter);

        //when
        LetterInfo letterInfo = letterInfoMapper.mapToResponse(letters);

        //then
        assertNull(letterInfo);
    }

    @Test
    void returnNullWhenLettersIsNull() {

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

}