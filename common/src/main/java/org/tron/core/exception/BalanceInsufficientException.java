package org.tron.core.exception;

public class BalanceInsufficientException extends HrnetworkException {

  public BalanceInsufficientException() {
    super();
  }

  public BalanceInsufficientException(String message) {
    super(message);
  }
}
