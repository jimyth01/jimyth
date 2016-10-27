package org.jimyth.business.app.service.impl;

import com.qzdatasoft.framework.messageService.mqtt.codec.MQTTWireFormat;
import org.apache.activemq.util.ByteSequence;
import org.fusesource.mqtt.codec.CONNACK;
import org.fusesource.mqtt.codec.CONNECT;
import org.jimyth.business.app.service.MqttService;
import org.fusesource.mqtt.codec.MQTTFrame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.socket.BinaryMessage;
import org.springframework.web.socket.WebSocketSession;

import java.io.IOException;

/**
 * Created by jimyt on 2016-10-18.
 */
@Service("mqttService")
public class MqttServiceImpl implements MqttService {
    /**
     * @Descreption TODO 增加描述
     */
    @Autowired
    @Qualifier("mqttFormat")
    private MQTTWireFormat mqttFormat;

    public boolean sendMsgFromWsToMq(String message) {
//        WSDesc msgObject = Ws2MqUtils.decodeFromWsToJson(message);

        return false;
    }

    public ByteSequence sendMsgFromWsToMq(WebSocketSession session, BinaryMessage message) {
        ByteSequence bytes =null;
        try {
            CONNACK ack = new CONNACK();
            ack.code(CONNACK.Code.CONNECTION_ACCEPTED);

             bytes = mqttFormat.marshal(ack.encode());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bytes;
    }


    public boolean sendMsgFromMqToWs(String message) {
        return false;
    }

    public boolean sendMsgFromMqToWs(BinaryMessage message) {
        return false;
    }

//    public MQTTWireFormat getWireFormat() {
//        return wireFormat;
//    }
//
//    public void setWireFormat(MQTTWireFormat wireFormat) {
//        this.wireFormat = wireFormat;
//    }
}
