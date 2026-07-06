package com.chat.myApp.controller;

import com.chat.myApp.dto.SendMessageRequest;
import com.chat.myApp.entity.Message;
import com.chat.myApp.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/messages")
@RequiredArgsConstructor
public class MessageController {
    private final MessageService messageService;

    @PostMapping("/send")
    public String sendMessage(
            Authentication authentication,
            @RequestBody SendMessageRequest request
    ) {
        String senderEmail = authentication.getName();
        return messageService.sendMessage(
                senderEmail,
                request
        );
    }

    @GetMapping("/history/{receiverEmail}")
    public List<Message> getChatHistory(
            Authentication authentication,
            @PathVariable String receiverEmail
    ) {
        return messageService.getChatHistory(
                authentication.getName(),
                receiverEmail
        );
    }
}