package com.kdu.bookingengine.controller;

import com.kdu.bookingengine.respository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.kdu.bookingengine.entity.*;

@RestController
public class RoomController {

    @Autowired
    private RoomRepository roomRepository;


    @PostMapping("/room")
    public Room saveRoom(@RequestBody Room room) {
        return roomRepository.save(room);
    }

    @GetMapping("/room/{id}")
    public Room getRoom(@PathVariable("id") String roomId) {
        return roomRepository.getRoomById(roomId);
    }

    @DeleteMapping("/room/{id}")
    public String deleteRoom(@PathVariable("id") String roomId) {
        return  roomRepository.delete(roomId);
    }

    @PutMapping("/room/{id}")
    public String updateRoom(@PathVariable("id") String roomId, @RequestBody Room room) {
        return roomRepository.update(roomId,room);
    }
}