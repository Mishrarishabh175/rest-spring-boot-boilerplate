package com.delivery.core.domain;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class EmailAlreadyUsedException extends DomainException {
    public EmailAlreadyUsedException(String message) {
        super(message);
    }
}
