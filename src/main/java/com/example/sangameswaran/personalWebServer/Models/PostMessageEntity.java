package com.example.sangameswaran.personalWebServer.Models;

public class PostMessageEntity {
    String emailId,message;

    public PostMessageEntity(){}
    public PostMessageEntity(String emailId, String message) {
        this.emailId = emailId;
        this.message = message;
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
