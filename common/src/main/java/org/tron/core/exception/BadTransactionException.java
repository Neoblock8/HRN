package org.tron.core.exception;

public class BadTransactionException extends HrnetworkException {

  public BadTransactionException() {
    super();
  }

  public BadTransactionException(String message) {
    super(message);
  }

  public BadTransactionException(String message, Throwable cause) {
    super(message, cause);
  }
}
