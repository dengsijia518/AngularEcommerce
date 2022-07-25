package com.ecommerce.ecommerce.dto;

import lombok.Data;

@Data
public class PaymentInfo {
    private int amount;//strip using cents as smallest denomination
    private String currency;
    private String receiptEmail;
}
