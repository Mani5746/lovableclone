package com.codingshuttleproject.lovableclone.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;
@FieldDefaults(level=AccessLevel.PRIVATE)  // This is used to make the all the Entities as Private at once
@Getter
@Setter  // This will take place of all the getters and setters
public class User {
     Long id;
     String email;
     String passwordHash;
     String name;
     String avatarURL;

    Instant createdAt;
    Instant deletedAt;  // softdelete
    Instant updatedAt;





}
