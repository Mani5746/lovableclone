package com.codingshuttleproject.lovableclone.entity;

import com.codingshuttleproject.lovableclone.enums.MessageRole;

import java.time.Instant;

public class ChatMessages {

    Long id;
    ChatSession chatSession;

    String content;
    MessageRole role;

    String toolCalls;// JSON Array of Tools caleed

    Integer tokenUsed;

    Instant createdAt;

}
