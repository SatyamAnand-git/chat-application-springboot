package com.chat.myApp.dto;

import lombok.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChatMessage {
    private String sender;
    private String receiver;
    private String content;
    private LocalDateTime timestamp;
}