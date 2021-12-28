package org.tron.core.vm.config;

import lombok.Setter;
import org.tron.common.parameter.CommonParameter;

/**
 * For developer only
 */
public class VMConfig {

  private static boolean vmTraceCompressed = false;

  @Setter
  private static boolean vmTrace = false;

  private static boolean ALLOW_HVM_TRANSFER_TRC10 = false;

  private static boolean ALLOW_HVM_CONSTANTINOPLE = false;

  private static boolean ALLOW_MULTI_SIGN = false;

  private static boolean ALLOW_HVM_SOLIDITY_059 = false;

  private static boolean ALLOW_SHIELDED_TRC20_TRANSACTION = false;

  private static boolean ALLOW_HVM_ISTANBUL = false;

  private static boolean ALLOW_HVM_FREEZE = false;

  private static boolean ALLOW_HVM_VOTE = false;

  private static boolean ALLOW_HVM_LONDON = false;

  private static boolean ALLOW_HVM_COMPATIBLE_EVM = false;

  private VMConfig() {
  }

  public static boolean vmTrace() {
    return vmTrace;
  }

  public static boolean vmTraceCompressed() {
    return vmTraceCompressed;
  }

  public static void initVmHardFork(boolean pass) {
    CommonParameter.ENERGY_LIMIT_HARD_FORK = pass;
  }

  public static void initAllowMultiSign(long allow) {
    ALLOW_MULTI_SIGN = allow == 1;
  }

  public static void initAllowHvmTransferTrc10(long allow) {
    ALLOW_HVM_TRANSFER_TRC10 = allow == 1;
  }

  public static void initAllowHvmConstantinople(long allow) {
    ALLOW_HVM_CONSTANTINOPLE = allow == 1;
  }

  public static void initAllowHvmSolidity059(long allow) {
    ALLOW_HVM_SOLIDITY_059 = allow == 1;
  }

  public static void initAllowShieldedTRC20Transaction(long allow) {
    ALLOW_SHIELDED_TRC20_TRANSACTION = allow == 1;
  }

  public static void initAllowHvmIstanbul(long allow) {
    ALLOW_HVM_ISTANBUL = allow == 1;
  }

  public static void initAllowHvmFreeze(long allow) {
    ALLOW_HVM_FREEZE = allow == 1;
  }

  public static void initAllowHvmVote(long allow) {
    ALLOW_HVM_VOTE = allow == 1;
  }

  public static void initAllowHvmLondon(long allow) {
    ALLOW_HVM_LONDON = allow == 1;
  }

  public static void initAllowHvmCompatibleEvm(long allow) {
    ALLOW_HVM_COMPATIBLE_EVM = allow == 1;
  }

  public static boolean getEnergyLimitHardFork() {
    return CommonParameter.ENERGY_LIMIT_HARD_FORK;
  }

  public static boolean allowHvmTransferTrc10() {
    return ALLOW_HVM_TRANSFER_TRC10;
  }

  public static boolean allowHvmConstantinople() {
    return ALLOW_HVM_CONSTANTINOPLE;
  }

  public static boolean allowMultiSign() {
    return ALLOW_MULTI_SIGN;
  }

  public static boolean allowHvmSolidity059() {
    return ALLOW_HVM_SOLIDITY_059;
  }

  public static boolean allowShieldedTRC20Transaction() {
    return ALLOW_SHIELDED_TRC20_TRANSACTION;
  }

  public static boolean allowHvmIstanbul() {
    return ALLOW_HVM_ISTANBUL;
  }

  public static boolean allowHvmFreeze() {
    return ALLOW_HVM_FREEZE;
  }

  public static boolean allowHvmVote() {
    return ALLOW_HVM_VOTE;
  }

  public static boolean allowHvmLondon() {
    return ALLOW_HVM_LONDON;
  }

  public static boolean allowHvmCompatibleEvm() {
    return ALLOW_HVM_COMPATIBLE_EVM;
  }
}
