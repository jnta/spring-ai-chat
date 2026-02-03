package com.jonataalbuquerque.spring_ai_chat.dto;

public record MovieRecommendation(
                String title,
                int releaseYear,
                String director,
                String briefSummary) {
}
