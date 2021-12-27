package org.tron.core.net.messagehandler;

import org.tron.core.exception.P2pException;
import org.tron.core.net.message.HrnetworkMessage;
import org.tron.core.net.peer.PeerConnection;

public interface HrnetworkMsgHandler {

  void processMessage(PeerConnection peer, HrnetworkMessage msg) throws P2pException;

}
