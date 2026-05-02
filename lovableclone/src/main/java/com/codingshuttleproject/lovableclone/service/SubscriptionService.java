package com.codingshuttleproject.lovableclone.service;

import com.codingshuttleproject.lovableclone.dto.Subscription.CheckoutRequest;
import com.codingshuttleproject.lovableclone.dto.Subscription.CheckoutResponse;
import com.codingshuttleproject.lovableclone.dto.Subscription.PortalResponse;
import com.codingshuttleproject.lovableclone.dto.Subscription.SubscriptionResponse;

public interface SubscriptionService {
    SubscriptionResponse getCurrentSubscription(Long userId);

    CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId);

    PortalResponse openCustomerPortal(Long userId);
}
