package com.codingshuttleproject.lovableclone.service;

import com.codingshuttleproject.lovableclone.dto.Subscription.CheckoutRequest;
import com.codingshuttleproject.lovableclone.dto.Subscription.CheckoutResponse;
import com.codingshuttleproject.lovableclone.dto.Subscription.PortalResponse;
import com.codingshuttleproject.lovableclone.dto.Subscription.SubscriptionResponse;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {

    @Override
    public SubscriptionResponse getCurrentSubscription(Long userId) {
        // TODO: implement get current subscription logic
        return null;
    }

    @Override
    public CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId) {
        // TODO: implement create checkout session logic
        return null;
    }

    @Override
    public PortalResponse openCustomerPortal(Long userId) {
        // TODO: implement open customer portal logic
        return null;
    }
}
