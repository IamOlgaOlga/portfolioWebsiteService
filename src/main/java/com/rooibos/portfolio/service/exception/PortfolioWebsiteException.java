package com.rooibos.portfolio.service.exception;

public class PortfolioWebsiteException extends Exception {

    private final static String STANDARD_ERROR = "Sorry, something goes wrong! Could you write your message to olga.ostrikova.business@gmail.com directly.";

    public PortfolioWebsiteException(String message) {
        super(message);
    }

    public String getStandardErrorMessage() {
        return STANDARD_ERROR;
    }

}
