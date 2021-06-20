package com.przesylki.parcel.api.letter.getAll.response;

import com.przesylki.parcel.dao.entity.*;

public class LetterResponse {

    private Sender sender;
    private SenderAddress senderAddress;
    private Receiver receiver;
    private ReceiverAddress receiverAddress;
    private CreatedAt createdAt;
    private UpdatedAt updatedAt;
    private Information information;

    public Sender getSender() {
        return sender;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    public SenderAddress getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(SenderAddress senderAddress) {
        this.senderAddress = senderAddress;
    }

    public Receiver getReceiver() {
        return receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    public ReceiverAddress getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(ReceiverAddress receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public CreatedAt getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(CreatedAt createdAt) {
        this.createdAt = createdAt;
    }

    public UpdatedAt getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(UpdatedAt updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Information getInformation() {
        return information;
    }

    public void setInformation(Information information) {
        this.information = information;
    }
}
