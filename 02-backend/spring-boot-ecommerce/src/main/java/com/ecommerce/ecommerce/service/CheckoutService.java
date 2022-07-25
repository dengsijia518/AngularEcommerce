package com.ecommerce.ecommerce.service;

import com.ecommerce.ecommerce.dto.PaymentInfo;
import com.ecommerce.ecommerce.dto.Purchase;
import com.ecommerce.ecommerce.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);

    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;
}
