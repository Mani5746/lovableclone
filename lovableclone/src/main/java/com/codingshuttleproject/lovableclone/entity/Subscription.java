package com.codingshuttleproject.lovableclone.entity;

import com.codingshuttleproject.lovableclone.enums.SubscriptionStatus;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@FieldDefaults (level = AccessLevel.PRIVATE)
@Getter
@Setter

public class Subscription {
Long id;

User user;
Plan plan;

String stripeCustomerId;
String stripeSubscriptionId;

SubscriptionStatus status;

Instant currentPeriodStart;
Instant currentPeriodEnd;
Boolean cancelAtPeriodEnd=false;

Instant createdAt;
Instant updatedAt;

}
