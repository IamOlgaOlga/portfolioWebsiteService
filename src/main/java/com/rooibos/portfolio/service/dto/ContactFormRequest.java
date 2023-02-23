package com.rooibos.portfolio.service.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ContactFormRequest {

    private String userName;

    private String userEmail;

    private String userMessage;

    public ContactFormRequest(){
    }

    public ContactFormRequest(String userName,String userEmail, String userMessage) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.userMessage = userMessage;
    }

    public String getUserName() {
        return userName;
    }

    public ContactFormRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public ContactFormRequest setUserEmail(String userEmail) {
        this.userEmail = userEmail;
        return this;
    }

    public String getUserMessage() {
        return userMessage;
    }

    public ContactFormRequest setUserMessage(String userMessage) {
        this.userMessage = userMessage;
        return this;
    }
}
