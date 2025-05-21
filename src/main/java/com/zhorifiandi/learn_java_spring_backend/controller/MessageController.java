
package com.zhorifiandi.learn_java_spring_backend.controller;

import com.zhorifiandi.learn_java_spring_backend.kafka.KafkaProducerService;
import com.zhorifiandi.learn_java_spring_backend.model.MessagePayload;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/messages")
@RequiredArgsConstructor
public class MessageController {
    private final KafkaProducerService producerService;

    @PostMapping
    public ResponseEntity<String> sendMessage(@RequestBody MessagePayload payload) {
        producerService.sendMessage(payload.getKey(), payload.getMessage());
        return ResponseEntity.ok("Message sent");
    }
}
