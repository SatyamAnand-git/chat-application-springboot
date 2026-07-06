package com.chat.myApp.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "messages")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Message {
    @Id
    private String id;
    private String senderEmail;
    private String receiverEmail;
    private String content;
    private LocalDateTime timestamp;
}