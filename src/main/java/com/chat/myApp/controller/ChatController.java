package com.chat.myApp.controller;

import com.chat.myApp.dto.ChatMessage;
import com.chat.myApp.entity.Message;
import com.chat.myApp.repository.MessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import java.time.LocalDateTime;

@Controller
@RequiredArgsConstructor
public class ChatController {

    private final SimpMessagingTemplate messagingTemplate;
    private final MessageRepository messageRepository;

    @MessageMapping("/chat")
    public void sendMessage(
            @Payload ChatMessage chatMessage
    ) {
        chatMessage.setTimestamp(LocalDateTime.now());
        Message message = Message.builder()
                .senderEmail(chatMessage.getSender())
                .receiverEmail(chatMessage.getReceiver())
                .content(chatMessage.getContent())
                .timestamp(chatMessage.getTimestamp())
                .build();
        messageRepository.save(message);
        messagingTemplate.convertAndSendToUser(
                chatMessage.getReceiver(),
                "/queue/messages",
                chatMessage
        );
        messagingTemplate.convertAndSendToUser(
                chatMessage.getSender(),
                "/queue/messages",
                chatMessage
        );
    }
}