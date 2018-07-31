package com.asc8.consumer;

import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {
	
    public void receiveMessage(String message) {
        System.out.println("Received <" + message + ">");
    }

}
