package com.codingshuttleproject.lovableclone.service.impl;

import com.codingshuttleproject.lovableclone.dto.Subscription.PlanLimitsResponse;
import com.codingshuttleproject.lovableclone.dto.Subscription.UsageTodayResponse;
import com.codingshuttleproject.lovableclone.service.UsageService;
import org.springframework.stereotype.Service;

@Service
public class UsageServiceImpl implements UsageService {

    @Override
    public UsageTodayResponse getTodayUsageOfUser(Long userId) {
        // TODO: implement get today usage logic
        return null;
    }

    @Override
    public PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId) {
        // TODO: implement get subscription limits logic
        return null;
    }
}
