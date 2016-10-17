package org.framework.business.app.controller.mqtt;

import org.apache.activemq.util.ByteSequence;
import org.framework.business.app.controller.mqtt.codec.MQTTWireFormat;
import org.framework.business.app.service.EchoService;
import org.fusesource.mqtt.codec.MQTTFrame;
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

	private final EchoService echoService;
	private MQTTWireFormat wireFormat = new MQTTWireFormat();


	@Autowired
	public EchoWebSocketHandler(EchoService echoService) {
		this.echoService = echoService;
	}

	@Override
	public void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
		String echoMessage = this.echoService.getMessage(message.getPayload());
		session.sendMessage(new TextMessage(echoMessage));
	}

	@Override
	protected void handleBinaryMessage(WebSocketSession session, BinaryMessage message) throws Exception {
		MQTTFrame frame = (MQTTFrame)wireFormat.unmarshal(new ByteSequence(message.getPayload().array(), 0, message.getPayload().array().length));
		session.sendMessage(message);
	}
}
