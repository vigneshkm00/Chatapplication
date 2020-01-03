package com.vignesh.chatapplication.models;

public class ModelChat {

    private String message,sender,receiver, time;
    boolean isSeen;

    public ModelChat() {
    }

    public ModelChat(String message, String sender, String receiver, String time, boolean isSeen) {
        this.message = message;
        this.sender = sender;
        this.receiver = receiver;
        this.time = time;
        this.isSeen = isSeen;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public boolean isSeen() {
        return isSeen;
    }

    public void setSeen(boolean seen) {
        isSeen = seen;
    }
}
