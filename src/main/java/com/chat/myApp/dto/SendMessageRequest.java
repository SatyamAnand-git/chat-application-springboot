package com.chat.myApp.dto;

import lombok.Data;

@Data
public class SendMessageRequest {
    private String receiverEmail;
    private String content;
}