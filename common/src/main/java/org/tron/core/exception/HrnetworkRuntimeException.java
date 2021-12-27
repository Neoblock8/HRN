package org.tron.core.exception;

public class HrnetworkRuntimeException extends RuntimeException {

  public HrnetworkRuntimeException() {
    super();
  }

  public HrnetworkRuntimeException(String message) {
    super(message);
  }

  public HrnetworkRuntimeException(String message, Throwable cause) {
    super(message, cause);
  }

  public HrnetworkRuntimeException(Throwable cause) {
    super(cause);
  }

  protected HrnetworkRuntimeException(String message, Throwable cause,
      boolean enableSuppression,
      boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }


}
