package com.cerner.cts.oss.rabbit.receiver;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/**
 * @author ds3161
 *
 */
@Slf4j
@Component
@EnableBinding(InputSink.class)
public class Consumer {
	/**
	 * @param message
	 */
	@StreamListener(InputSink.myInput)
	public void receive(IngestionEvent event) {
		log.info("Consuming event {}", event);
	}
}
