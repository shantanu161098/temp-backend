package com.kdu.bookingengine.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBDocument
public class PaymentInfo {

    @DynamoDBAttribute
    private String cardNumber;

    @DynamoDBAttribute
    private String expiryMonth;

    @DynamoDBAttribute
    private String expiryYear;

    @DynamoDBAttribute
    private String cvv;




}
