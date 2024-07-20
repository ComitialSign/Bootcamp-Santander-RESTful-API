package com.comitialsign.santander.service.exception;

public class NotFoundException extends BusinessException {

    private static final long serialVersionUID = 1L;

    public NotFoundException() {
        super("Resource Not found.");
    }
}
