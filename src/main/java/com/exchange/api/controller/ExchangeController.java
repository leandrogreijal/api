package com.exchange.api.controller;

import com.exchange.api.dto.TransactionRequest;
import com.exchange.api.dto.TransactionResponse;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExchangeController {

  public TransactionResponse exchange(@RequestBody(required = true) TransactionRequest request) {
    
    return null;

  }

}
