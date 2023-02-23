package com.rooibos.portfolio.service;

import com.rooibos.portfolio.service.dto.ContactFormRequest;
import com.rooibos.portfolio.service.dto.ContactFormResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class ContactFormControllerImpl implements ContactFormController{

    private final ContactService contactService;

    @Autowired
    public ContactFormControllerImpl(ContactService contactService) {
        this.contactService = contactService;
    }

    @Override
    public Optional<ContactFormResponse> contactFormCall(ContactFormRequest tokenRequest) {
        return Optional.empty();
    }
}
