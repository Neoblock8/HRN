package org.tron.core.vm.config;

import static org.tron.core.capsule.ReceiptCapsule.checkForEnergyLimit;

import lombok.extern.slf4j.Slf4j;
import org.tron.common.parameter.CommonParameter;
import org.tron.core.store.DynamicPropertiesStore;
import org.tron.core.store.StoreFactory;
import org.tron.core.vm.OperationRegistry;

@Slf4j(topic = "VMConfigLoader")
public class ConfigLoader {

  //only for unit test
  public static boolean disable = false;

  public static void load(StoreFactory storeFactory) {
    if (disable) {
      OperationRegistry.clearOperations();
    } else {
      DynamicPropertiesStore ds = storeFactory.getChainBaseManager().getDynamicPropertiesStore();
      VMConfig.setVmTrace(CommonParameter.getInstance().isVmTrace());
      if (ds != null) {
        VMConfig.initVmHardFork(checkForEnergyLimit(ds));
        VMConfig.initAllowMultiSign(ds.getAllowMultiSign());
        VMConfig.initAllowHvmTransferTrc10(ds.getAllowHvmTransferTrc10());
        VMConfig.initAllowHvmConstantinople(ds.getAllowHvmConstantinople());
        VMConfig.initAllowHvmSolidity059(ds.getAllowHvmSolidity059());
        VMConfig.initAllowShieldedTRC20Transaction(ds.getAllowShieldedTRC20Transaction());
        VMConfig.initAllowHvmIstanbul(ds.getAllowHvmIstanbul());
        VMConfig.initAllowHvmFreeze(ds.getAllowHvmFreeze());
        VMConfig.initAllowHvmVote(ds.getAllowHvmVote());
        VMConfig.initAllowHvmLondon(ds.getAllowHvmLondon());
        VMConfig.initAllowHvmCompatibleEvm(ds.getAllowHvmCompatibleEvm());
      }
    }
    OperationRegistry.newBaseOperation();

    if (VMConfig.allowHvmTransferTrc10()) {
      OperationRegistry.newAllowHvmTransferTrc10Operation();
    }

    if (VMConfig.allowHvmConstantinople()) {
      OperationRegistry.newAllowHvmConstantinopleOperation();
    }

    if (VMConfig.allowHvmSolidity059()) {
      OperationRegistry.newAllowHvmSolidity059Operation();
    }

    if (VMConfig.allowHvmIstanbul()) {
      OperationRegistry.newAllowHvmIstanbulOperation();
    }

    if (VMConfig.allowHvmFreeze()) {
      OperationRegistry.newAllowHvmFreezeOperation();
    }

    if (VMConfig.allowHvmVote()) {
      OperationRegistry.newAllowHvmVoteOperation();
    }

    if (VMConfig.allowHvmLondon()) {
      OperationRegistry.newAllowHvmLondonOperation();
    }
  }
}
