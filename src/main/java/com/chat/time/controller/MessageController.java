package com.chat.time.controller;

import com.chat.time.message.Message;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @MessageMapping("/status")
    @SendTo("/topic/messages")
    public Message sendMessage(Message message, @Header("simpSessionId") String sessionId) {

        //Do something
        return new Message("Message with text : " + message.getText()
                + " received ", " from " + message.getName());
    }
}
