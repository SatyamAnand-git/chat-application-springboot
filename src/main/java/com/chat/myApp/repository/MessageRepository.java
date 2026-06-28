package com.chat.myApp.repository;

import com.chat.myApp.entity.Message;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MessageRepository extends MongoRepository<Message, String> {

    List<Message> findBySenderEmailAndReceiverEmail(
            String senderEmail,
            String receiverEmail
    );

    List<Message> findByReceiverEmailAndSenderEmail(
            String receiverEmail,
            String senderEmail
    );
}