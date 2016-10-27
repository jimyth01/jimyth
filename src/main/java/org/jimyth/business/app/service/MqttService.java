package org.jimyth.business.app.service;


import org.apache.activemq.util.ByteSequence;
import org.springframework.stereotype.Service;
import org.springframework.web.socket.BinaryMessage;
import org.springframework.web.socket.WebSocketSession;

/**
 * Created by jimyt on 2016-10-18.
 */
@Service
public  interface MqttService {

    boolean sendMsgFromWsToMq(String message);
    ByteSequence sendMsgFromWsToMq(WebSocketSession session, BinaryMessage message);

    boolean sendMsgFromMqToWs(String message);
    boolean  sendMsgFromMqToWs(BinaryMessage message);
}
