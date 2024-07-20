package com.comitialsign.santander.controller.dto;

import com.comitialsign.santander.domain.model.Account;

import java.math.BigDecimal;

public record AccountDto(Long id, String number, String agency, BigDecimal balance, BigDecimal limit) {

    public AccountDto(Account model) {
        this(model.getId(), model.getNumber(), model.getAgency(), model.getBalance(), model.getLimit());
    }

    public Account toModel() {
        Account model = new Account();
        model.setId(id);
        model.setNumber(number);
        model.setAgency(agency);
        model.setBalance(balance);
        model.setLimit(limit);
        return model;
    }
}
