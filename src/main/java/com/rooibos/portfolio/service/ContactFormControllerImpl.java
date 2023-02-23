package com.rooibos.portfolio.service;

import com.rooibos.portfolio.service.dto.ContactFormRequest;
import com.rooibos.portfolio.service.dto.ContactFormResponse;
import com.rooibos.portfolio.service.exception.PortfolioWebsiteException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactFormControllerImpl implements ContactFormController{

    private final ContactService contactService;

    private final static String SUCCESS_MESSAGE = "Thank you for your message!";


    @Autowired
    public ContactFormControllerImpl(ContactService contactService) {
        this.contactService = contactService;
    }

    @Override
    public ContactFormResponse contactFormCall(ContactFormRequest contactFormRequest) {
        try {
            contactService.processContactMessage(contactFormRequest.getUserName(), contactFormRequest.getUserEmail(), contactFormRequest.getUserMessage());
        } catch (PortfolioWebsiteException error) {
            return new ContactFormResponse(error.getStandardErrorMessage());
        }
        return new ContactFormResponse(SUCCESS_MESSAGE);
    }
}
