package com.kdu.bookingengine.respository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBSaveExpression;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;
import com.kdu.bookingengine.entity.TravellerInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TravellerInfoRepository {

    @Autowired
    private DynamoDBMapper dynamoDBMapper;

    public TravellerInfo save(TravellerInfo travellerInfo) {
        dynamoDBMapper.save(travellerInfo);
        return travellerInfo;
    }

    public TravellerInfo getTravellerInfoById(String travellerInfoId) {
        return dynamoDBMapper.load(TravellerInfo.class, travellerInfoId);
    }

    public String delete(String travellerInfoId) {
        TravellerInfo travellerInfo = dynamoDBMapper.load(TravellerInfo.class, travellerInfoId);
        dynamoDBMapper.delete(travellerInfo);
        return "TravellerInfo Deleted!";
    }

    public String update(String travellerInfoId, TravellerInfo travellerInfo) {
        dynamoDBMapper.save(travellerInfo,
                new DynamoDBSaveExpression()
                        .withExpectedEntry("TravellerInfoId",
                                new ExpectedAttributeValue(
                                        new AttributeValue().withS(travellerInfoId)
                                )));
        return travellerInfoId;
    }
}