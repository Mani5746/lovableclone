package com.codingshuttleproject.lovableclone.repository;

import com.codingshuttleproject.lovableclone.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User,Long>{
}
