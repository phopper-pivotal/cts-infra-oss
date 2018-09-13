package com.cerner.cts.oss.rabbit.processor;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author ds3161
 *
 */
public interface InputSink {

	/** */
	String myInput = "myInput";

	/**
	 * @return SubscribableChannel
	 */
	@Input(InputSink.myInput)
	SubscribableChannel input();
}
