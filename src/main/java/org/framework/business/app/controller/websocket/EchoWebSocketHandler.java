package org.framework.business.app.controller.websocket;

import org.framework.business.app.controller.mqtt.codec.MQTTWireFormat;
import org.framework.business.app.service.EchoService;
import org.framework.business.app.service.impl.MqttServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.socket.BinaryMessage;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.AbstractWebSocketHandler;

/**
 * Echo messages by implementing a Spring {@link WebSocketHandler} abstraction.
 */
public class EchoWebSocketHandler extends AbstractWebSocketHandler {


    /** @Descreption  TODO 增加描述 */
    private final EchoService echoService;

    /** @Descreption  TODO 增加描述 */
    @Autowired
    MqttServiceImpl mqttService;

    /**
     * @Descreption  TODO 增加描述
     *
     *
     * @param echoService
     */
    @Autowired
    public EchoWebSocketHandler(EchoService echoService) {
        this.echoService = echoService;
    }

    @Override
    protected void handleBinaryMessage(WebSocketSession session, BinaryMessage message) throws Exception {
        mqttService.sendMsgFromWsToMq(session,message);
//        session.sendMessage(message);
    }

    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        String echoMessage = this.echoService.getMessage(message.getPayload());

        session.sendMessage(new TextMessage(echoMessage));
        mqttService.sendMsgFromWsToMq(echoMessage);
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
