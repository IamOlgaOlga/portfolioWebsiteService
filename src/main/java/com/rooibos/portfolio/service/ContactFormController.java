package com.rooibos.portfolio.service;


import com.rooibos.portfolio.service.dto.ContactFormRequest;
import com.rooibos.portfolio.service.dto.ContactFormResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

public interface ContactFormController {

    @PostMapping(value = "/sentContactMessage", produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
    @ResponseBody
    ContactFormResponse contactFormCall( @RequestBody ContactFormRequest tokenRequest);
}
