package org.framework.business.app.service.impl;

import com.google.gson.JsonObject;
import org.framework.business.app.entity.WSDesc;
import org.framework.business.app.service.MqttService;
import org.framework.business.app.util.Ws2MqUtils;
import org.springframework.web.socket.BinaryMessage;

/**
 * Created by jimyt on 2016-10-18.
 */
public class MqttServiceImpl implements MqttService {

    public boolean sendMsgFromWsToMq(String message) {
        WSDesc msgObject = Ws2MqUtils.decodeFromWsToJson(message);

        return false;
    }

    public boolean sendMsgFromWsToMq(BinaryMessage message) {
        WSDesc msgObject = Ws2MqUtils.decodeFromWsToJson(message);
        return false;
    }


    public boolean sendMsgFromMqToWs(String message) {
        return false;
    }

    public boolean sendMsgFromMqToWs(BinaryMessage message) {
        return false;
    }

}
