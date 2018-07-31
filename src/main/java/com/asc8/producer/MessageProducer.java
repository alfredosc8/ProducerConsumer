package com.asc8.producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.asc8.config.QueueConfig;

@Component
public class MessageProducer implements CommandLineRunner {

	private final RabbitTemplate rabbitTemplate;
	private int counter = 0;

	public MessageProducer(RabbitTemplate rabbitTemplate) {
		this.rabbitTemplate = rabbitTemplate;
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Sending message...");
		rabbitTemplate.convertAndSend(QueueConfig.topicExchangeName, "message." + counter,
				"Hello from RabbitMQ!, count:" + counter);
		if (++counter > 1000) {
			rabbitTemplate.convertAndSend(QueueConfig.topicExchangeName, "message.end", "End of Messages");
			return;
		}
	}

}
