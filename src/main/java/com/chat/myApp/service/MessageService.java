package com.chat.myApp.service;

import com.chat.myApp.dto.SendMessageRequest;
import com.chat.myApp.entity.Message;
import com.chat.myApp.repository.MessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MessageService {

    private final MessageRepository messageRepository;

    // Send a message
    public String sendMessage(
            String senderEmail,
            SendMessageRequest request
    ) {

        Message message = Message.builder()
                .senderEmail(senderEmail)
                .receiverEmail(request.getReceiverEmail())
                .content(request.getContent())
                .timestamp(LocalDateTime.now())
                .build();

        messageRepository.save(message);

        return "Message Sent Successfully";
    }

    // Get chat history between two users
    public List<Message> getChatHistory(
            String user1,
            String user2
    ) {

        List<Message> sent =
                messageRepository.findBySenderEmailAndReceiverEmail(
                        user1,
                        user2
                );

        List<Message> received =
                messageRepository.findByReceiverEmailAndSenderEmail(
                        user1,
                        user2
                );

        List<Message> chat = new ArrayList<>();

        chat.addAll(sent);
        chat.addAll(received);

        chat.sort(
                Comparator.comparing(Message::getTimestamp)
        );

        return chat;
    }
}