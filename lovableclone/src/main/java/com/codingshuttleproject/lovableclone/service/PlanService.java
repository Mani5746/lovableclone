package com.codingshuttleproject.lovableclone.service;

import com.codingshuttleproject.lovableclone.dto.Subscription.PlanResponse;

import java.util.List;

public interface PlanService {
     List<PlanResponse> getAllActivePlans();
}
