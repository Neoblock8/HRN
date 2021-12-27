package org.tron.common.error;

public class HrnetworkDBException extends RuntimeException {
    public HrnetworkDBException() {
  }

    public HrnetworkDBException(String s) {
    super(s);
  }

    public HrnetworkDBException(String s, Throwable throwable) {
    super(s, throwable);
  }

    public HrnetworkDBException(Throwable throwable) {
    super(throwable);
  }
}
