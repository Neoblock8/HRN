package org.tron.core.exception;

public class TooBigTransactionException extends HrnetworkException {

  public TooBigTransactionException() {
    super();
  }

  public TooBigTransactionException(String message) {
    super(message);
  }
}
