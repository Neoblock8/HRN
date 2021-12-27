package org.tron.core.exception;

public class DupTransactionException extends HrnetworkException {

  public DupTransactionException() {
    super();
  }

  public DupTransactionException(String message) {
    super(message);
  }
}
