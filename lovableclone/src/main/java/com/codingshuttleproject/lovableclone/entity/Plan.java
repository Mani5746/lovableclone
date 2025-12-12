package com.codingshuttleproject.lovableclone.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@FieldDefaults (level = AccessLevel.PRIVATE)
@Getter
@Setter
public class Plan {
    Long id;

    String name;

    String stripePriceId;
    Integer maxProjects;
    Integer maxTokensPerDay;
    Integer maxPreviews; // maximum Previous
    Boolean unlimitedAi; // Unlimited access tokens to LLM

    Boolean active;
}
