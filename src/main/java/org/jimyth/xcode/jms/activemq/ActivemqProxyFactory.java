package org.jimyth.xcode.jms.activemq;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;



/**
 * 
 * @author songjian @Mar 3, 2013
 */
public class ActivemqProxyFactory {

	@Autowired
	@Qualifier("queueDestination")
	protected ActiveMQQueue DEFAULT_ActiveMQQueue;
	
}
