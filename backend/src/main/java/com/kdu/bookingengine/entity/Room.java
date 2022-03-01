package com.kdu.bookingengine.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBTable(tableName = "hotel")
public class Room {

    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    private String roomTypeId;

    @DynamoDBAttribute
    private String lanentId;

    @DynamoDBAttribute
    private String propertyId;

    @DynamoDBAttribute
    private String roomType;

    @DynamoDBAttribute
    private String name;

    @DynamoDBAttribute
    private String imageURL;

    @DynamoDBAttribute
    private String description;

}