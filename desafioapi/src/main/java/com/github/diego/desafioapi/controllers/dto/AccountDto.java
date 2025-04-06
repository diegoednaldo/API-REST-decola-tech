package com.github.diego.desafioapi.controllers.dto;


import com.github.diego.desafioapi.entities.Account;

import java.math.BigDecimal;

public record AccountDto(
        Long id,

        @NotBlank(message = "Account number cannot be blank")
        @Size(min = 5, max = 20)
        String number,

        @NotBlank(message = "Agency cannot be blank")
        String agency,

        @NotNull(message = "Balance cannot be null")
        BigDecimal balance,

        @NotNull(message = "Limit cannot be null")
        BigDecimal limit
) {

    public AccountDto(Account model) {
        this(model.getId(), model.getNumber(), model.getAgency(), model.getBalance(), model.getLimit());
    }

    public Account toModel() {
        Account model = new Account();
        model.setId(this.id);
        model.setNumber(this.number);
        model.setAgency(this.agency);
        model.setBalance(this.balance);
        model.setLimit(this.limit);
        return model;
    }
}