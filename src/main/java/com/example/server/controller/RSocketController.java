package com.example.server.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Mono;


@Controller
public class RSocketController {

    @MessageMapping("request-response-hello")
    public Mono<String> getAllView() {
        return Mono.just("Hello from backend");
    }

}
