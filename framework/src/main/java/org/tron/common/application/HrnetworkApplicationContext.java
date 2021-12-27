package org.tron.common.application;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.tron.common.overlay.discover.DiscoverServer;
import org.tron.common.overlay.discover.node.NodeManager;
import org.tron.common.overlay.server.ChannelManager;
import org.tron.core.db.Manager;

public class HrnetworkApplicationContext extends AnnotationConfigApplicationContext {

  public HrnetworkApplicationContext() {
  }

  public HrnetworkApplicationContext(DefaultListableBeanFactory beanFactory) {
    super(beanFactory);
  }

  public HrnetworkApplicationContext(Class<?>... annotatedClasses) {
    super(annotatedClasses);
  }

  public HrnetworkApplicationContext(String... basePackages) {
    super(basePackages);
  }

  @Override
  public void destroy() {

    Application appT = ApplicationFactory.create(this);
    appT.shutdownServices();
    appT.shutdown();

    DiscoverServer discoverServer = getBean(DiscoverServer.class);
    discoverServer.close();
    ChannelManager channelManager = getBean(ChannelManager.class);
    channelManager.close();
    NodeManager nodeManager = getBean(NodeManager.class);
    nodeManager.close();

    Manager dbManager = getBean(Manager.class);
    dbManager.stopRePushThread();
    dbManager.stopRePushTriggerThread();
    dbManager.stopFilterProcessThread();
    super.destroy();
  }
}
