package org.framework.business.app.service.impl;

import org.apache.activemq.util.ByteSequence;
import org.framework.business.app.controller.mqtt.MQTTWSConnection;
import org.framework.business.app.controller.mqtt.codec.MQTTWireFormat;
import org.framework.business.app.entity.WSDesc;
import org.framework.business.app.service.MqttService;
import org.framework.business.app.util.Ws2MqUtils;
import org.fusesource.mqtt.codec.MQTTFrame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.socket.BinaryMessage;
import org.springframework.web.socket.WebSocketSession;

/**
 * Created by jimyt on 2016-10-18.
 */
public class MqttServiceImpl implements MqttService {
    /**
     * @Descreption TODO 增加描述
     */
    @Autowired
    private MQTTWireFormat wireFormat;

    public boolean sendMsgFromWsToMq(String message) {
        WSDesc msgObject = Ws2MqUtils.decodeFromWsToJson(message);

        return false;
    }

    public boolean sendMsgFromWsToMq(WebSocketSession session, BinaryMessage message) {
        ByteSequence byteSequence = new ByteSequence(message.getPayload().array());
//        MQTTWSConnection wsMQTTConnection = new MQTTWSConnection();
//        wsMQTTConnection.connect();
        try {

            MQTTFrame frame = (MQTTFrame) wireFormat.unmarshal(byteSequence);
            wsMQTTConnection.sendFrame(frame);
        } catch (Exception e) {
            e.printStackTrace();
        }
        byteSequence.getData();

        return false;
    }


    public boolean sendMsgFromMqToWs(String message) {
        return false;
    }

    public boolean sendMsgFromMqToWs(BinaryMessage message) {
        return false;
    }

    public MQTTWireFormat getWireFormat() {
        return wireFormat;
    }

    public void setWireFormat(MQTTWireFormat wireFormat) {
        this.wireFormat = wireFormat;
    }
}
