package com.example.sangameswaran.personalWebServer.Models;

public class MessageEntity {
    int id;
    String emailId,message;

    public MessageEntity(int id, String emailId, String message) {
        this.id = id;
        this.emailId = emailId;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
