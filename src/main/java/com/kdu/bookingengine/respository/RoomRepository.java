package com.kdu.bookingengine.respository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBSaveExpression;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;
import com.kdu.bookingengine.entity.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RoomRepository {

    @Autowired
    private DynamoDBMapper dynamoDBMapper;

    public Room save(Room room) {
        dynamoDBMapper.save(room);
        return room;
    }

    public Room getRoomById(String roomTypeId) {
        return dynamoDBMapper.load(Room.class, roomTypeId);
    }

    public String delete(String roomTypeId) {
        Room room = dynamoDBMapper.load(Room.class, roomTypeId);
        dynamoDBMapper.delete(room);
        return "Room Deleted!";
    }

    public String update(String roomTypeId, Room room) {
        dynamoDBMapper.save(room,
                new DynamoDBSaveExpression()
                        .withExpectedEntry("RoomTypeId",
                                new ExpectedAttributeValue(
                                        new AttributeValue().withS(roomTypeId)
                                )));
        return roomTypeId;
    }
}