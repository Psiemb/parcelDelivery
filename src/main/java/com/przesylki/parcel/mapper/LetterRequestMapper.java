package com.przesylki.parcel.mapper;

import com.przesylki.parcel.api.letter.addLetter.request.*;
import com.przesylki.parcel.dao.entity.*;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.Collection;
import java.util.Objects;

@Component
public class LetterRequestMapper {

    public Letter mapToLetter(LetterRequest letterRequest) {
        if (Objects.isNull(letterRequest) || Objects.isNull(letterRequest.getSender2())) {
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

        Receiver2 receiver2 = new Receiver2();

        Receiver receiverEntity = new Receiver();
        receiverEntity.setName(receiver2.getName());
        receiverEntity.setSurname(receiver2.getSurname());
        receiverEntity.setPhoneNumber(receiver2.getPhoneNumber());
        receiverEntity.setEmail(receiver2.getEmail());

        ReceiverAddress2 receiverAddress2 = new ReceiverAddress2();

        ReceiverAddress receiverAddressEntity = new ReceiverAddress();
        receiverAddressEntity.setPostCode(receiverAddress2.getPostCode());
        receiverAddressEntity.setCity(receiverAddress2.getCity());
        receiverAddressEntity.setStreet(receiverAddress2.getStreet());
        receiverAddressEntity.setBuildingNumber(receiverAddress2.getBuildingNumber());
        receiverAddressEntity.setFlatNumber(receiverAddress2.getFlatNumber());

        CreatedAt2 createdAt2 = new CreatedAt2();

        CreatedAt createdAtEntity = new CreatedAt();
        createdAtEntity.setCreateDate(createdAt2.getCreateDate());

        UpdatedAt2 updatedAt2 = new UpdatedAt2();

        UpdatedAt updatedAtEntity = new UpdatedAt();
        updatedAtEntity.setUpdateDate(updatedAt2.getUpdateDate());

        Information2 information2 = new Information2();

        Information informationEntity = new Information();
        informationEntity.setSize(information2.getSize());
        informationEntity.setType(information2.getType());

        Letter letter = new Letter();
        letter.setSender(senderEntity);
        letter.setSenderAddress(senderAddressEntity);
        letter.setReceiver(receiverEntity);
        letter.setReceiverAddress(receiverAddressEntity);
        letter.setCreatedAt(createdAtEntity);
        letter.setUpdatedAt(updatedAtEntity);
        letter.setInformation(informationEntity);

        return letter;
    }
}
