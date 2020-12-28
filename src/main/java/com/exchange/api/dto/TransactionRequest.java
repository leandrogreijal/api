package com.exchange.api.dto;

import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransactionRequest {

  @NotNull
  private Long clientId;
  @NotNull
  private Double value;
  @NotNull
  private Currency valueCurrency;
  @NotNull
  private Currency destinyCurrency;


}
