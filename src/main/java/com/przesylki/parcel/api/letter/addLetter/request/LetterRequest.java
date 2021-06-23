package com.przesylki.parcel.api.letter.addLetter.request;

import javax.validation.constraints.NotNull;

public class LetterRequest {

    @NotNull
    private Sender2 sender2;
    @NotNull
    private SenderAddress2 senderAddress2;
    @NotNull
    private Receiver2 receiver2;
    @NotNull
    private ReceiverAddress2 receiverAddress2;
    @NotNull
    private CreatedAt2 createdAt2;
    @NotNull
    private UpdatedAt2 updatedAt2;
    @NotNull
    private Information2 information2;

    public Sender2 getSender2() {
        return sender2;
    }

    public void setSender2(Sender2 sender2) {
        this.sender2 = sender2;
    }

    public SenderAddress2 getSenderAddress2() {
        return senderAddress2;
    }

    public void setSenderAddress2(SenderAddress2 senderAddress2) {
        this.senderAddress2 = senderAddress2;
    }

    public Receiver2 getReceiver2() {
        return receiver2;
    }

    public void setReceiver2(Receiver2 receiver2) {
        this.receiver2 = receiver2;
    }

    public ReceiverAddress2 getReceiverAddress2() {
        return receiverAddress2;
    }

    public void setReceiverAddress2(ReceiverAddress2 receiverAddress2) {
        this.receiverAddress2 = receiverAddress2;
    }

    public CreatedAt2 getCreatedAt2() {
        return createdAt2;
    }

    public void setCreatedAt2(CreatedAt2 createdAt2) {
        this.createdAt2 = createdAt2;
    }

    public UpdatedAt2 getUpdatedAt2() {
        return updatedAt2;
    }

    public void setUpdatedAt2(UpdatedAt2 updatedAt2) {
        this.updatedAt2 = updatedAt2;
    }

    public Information2 getInformation2() {
        return information2;
    }

    public void setInformation2(Information2 information2) {
        this.information2 = information2;
    }
}
