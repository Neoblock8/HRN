package org.tron.core.exception;

public class UnLinkedBlockException extends HrnetworkException {

  public UnLinkedBlockException() {
    super();
  }

  public UnLinkedBlockException(String message) {
    super(message);
  }

  public UnLinkedBlockException(String message, Throwable cause) {
    super(message, cause);
  }
}
