package org.framework.business.app.service;


import org.springframework.stereotype.Service;
import org.springframework.web.socket.BinaryMessage;

/**
 * Created by jimyt on 2016-10-18.
 */
@Service
public  interface MqttService {

    boolean sendMsgFromWsToMq(String message);
    boolean  sendMsgFromWsToMq(BinaryMessage message);

    boolean sendMsgFromMqToWs(String message);
    boolean  sendMsgFromMqToWs(BinaryMessage message);
}
