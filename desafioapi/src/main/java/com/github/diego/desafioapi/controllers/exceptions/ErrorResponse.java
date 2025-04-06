package com.github.diego.desafioapi.controllers.exceptions;


import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ErrorResponse {
    private int status;
    private String message;
    private List<String> details;

    public ErrorResponse(int status, String message) {
        this(status, message, null);
    }
}