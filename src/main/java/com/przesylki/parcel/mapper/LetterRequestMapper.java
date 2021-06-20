package com.przesylki.parcel.mapper;

import com.przesylki.parcel.api.letter.addLetter.request.LetterRequest;
import com.przesylki.parcel.api.letter.addLetter.request.Sender2;
import com.przesylki.parcel.api.letter.addLetter.request.SenderAddress2;
import com.przesylki.parcel.dao.entity.Letter;
import com.przesylki.parcel.dao.entity.Sender;
import com.przesylki.parcel.dao.entity.SenderAddress;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class LetterRequestMapper {

    public Letter maptoLetter(LetterRequest letterRequest) {
        if (Objects.isNull(letterRequest)) {
            return null;
        }
        Sender2 sender2 = letterRequest.getSender2();

        Sender senderEntity = new Sender();
        senderEntity.setSurname(sender2.getSurname2());
        senderEntity.setPhoneNumber(sender2.getPhoneNumber2());
        senderEntity.setEmail(sender2.getEmail2());

        SenderAddress2 senderAddress2 = letterRequest.getSenderAddress2();

        SenderAddress senderAddressEntity = new SenderAddress();
        senderAddressEntity.setBuildingNumber((senderAddress2.getBuildingNumber()));
        senderAddressEntity.setCity(senderAddress2.getCity());
        senderAddressEntity.setFlatNumber(senderAddress2.getFlatNumber());
        senderAddressEntity.setPostcode(senderAddress2.getPostcode());



        Letter letter = new Letter();
        letter.setSender(senderEntity);
        letter.setSenderAddress(letterRequest.getSenderAddress2().);
//        letter.setReceiver(letterRequest.getReceiver());
//        letter.setReceiverAddress(letterRequest.getReceiverAddress());
//        letter.setCreatedAt(letterRequest.getCreatedAt());
//        letter.setUpdatedAt(letterRequest.getUpdatedAt());
//        letter.setInformation(letterRequest.getInformation());

        return letter;

    }
}
