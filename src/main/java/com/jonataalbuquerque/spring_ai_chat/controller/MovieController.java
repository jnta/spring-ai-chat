package com.jonataalbuquerque.spring_ai_chat.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.SimpleLoggerAdvisor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jonataalbuquerque.spring_ai_chat.dto.MovieRecommendation;

@RestController
public class MovieController {

    private final ChatClient chatClient;

    public MovieController(ChatClient.Builder builder) {
        this.chatClient = builder
                .defaultAdvisors(new SimpleLoggerAdvisor())
                .build();
    }

    @GetMapping("/movie/recommendation")
    public MovieRecommendation getMovie(@RequestParam String genre) {
        return chatClient.prompt()
                .user(u -> u.text("Recommend a movie in the {genre} genre")
                        .param("genre", genre))
                .call()
                .entity(MovieRecommendation.class);
    }
}
