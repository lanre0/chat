package com.example.chatdemo.route;

import com.example.chatdemo.model.Messages;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;


@Controller
public class ChatRoutes {

    @MessageMapping("/chat.sendMessage")
    @SendTo("/topic/public")
    public Messages sendMessage(@Payload Messages message) {
        System.out.println("reaching...here");
        return message;
    }

    @MessageMapping("/chat.addUser")
    @SendTo("/topic/public")
    public Messages addUser(@Payload Messages message,  SimpMessageHeaderAccessor headerAccessor) {
        // Add username in web socket session
        headerAccessor.getSessionAttributes().put("username", message.getSender());
        System.out.println("-----------"+message.getSender());
        return message;
    }




}
