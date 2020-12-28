package com.exchange.api.dto;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransactionResponse {

  private Long transactionId;
  private Long clientId;
  private Double originalValue;
  private Currency originalCurrency;
  private Double destinyValue;
  private Currency destinyCurrency;
  private Double conversionRate;
  private Date transactionDate;
}
