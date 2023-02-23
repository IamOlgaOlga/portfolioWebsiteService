package com.rooibos.portfolio.service.dto;

public class ContactFormResponse {

    private String responseMessage;

    public ContactFormResponse() {}

    public ContactFormResponse(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public ContactFormResponse setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
        return this;
    }
}
