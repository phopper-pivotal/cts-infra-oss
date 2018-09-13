package com.cerner.cts.oss.rabbit.processor;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/**
 * @author ds3161
 *
 */
@Slf4j
@Component
@EnableBinding({ InputSink.class, OutputSource.class })
public class Processor {
	/**
	 * @param message
	 */
	@StreamListener(InputSink.myInput)
	@SendTo(OutputSource.myOutput)
	public IngestionEvent receive(IngestionEvent event) {
		log.info("Processing event {}", event);
		return event;
	}
}
