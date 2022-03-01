package com.kdu.bookingengine.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBDocument
public class BillingInfo {

    @DynamoDBAttribute
    private String firstName;

    @DynamoDBAttribute
    private String lastName;

    @DynamoDBAttribute
    private String phone;

    @DynamoDBAttribute
    private String email;

    @DynamoDBAttribute
    private String zip;

    @DynamoDBAttribute
    private String country;

    @DynamoDBAttribute
    private String city;

    @DynamoDBAttribute
    private String state;

    @DynamoDBAttribute
    private String firstMailingAddress;

    @DynamoDBAttribute
    private String secondMailingAddress;

}
