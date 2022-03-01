package com.kdu.bookingengine.controller;

import com.kdu.bookingengine.respository.TravellerInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.kdu.bookingengine.entity.*;

@RestController
public class TravellerInfoController {

    @Autowired
    private TravellerInfoRepository travellerInfoRepository;

    @RequestMapping("/")
    public String print() {
        return "Hello";
    }


    @PostMapping("/travellerInfo")
    public TravellerInfo saveTravellerInfo(@RequestBody TravellerInfo travellerInfo) {
        return travellerInfoRepository.save(travellerInfo);
    }

    @GetMapping("/travellerInfo/{id}")
    public TravellerInfo getTravellerInfo(@PathVariable("id") String travellerInfoId) {
        return travellerInfoRepository.getTravellerInfoById(travellerInfoId);
    }

    @DeleteMapping("/travellerInfo/{id}")
    public String deleteTravellerInfo(@PathVariable("id") String travellerInfoId) {
        return  travellerInfoRepository.delete(travellerInfoId);
    }

    @PutMapping("/travellerInfo/{id}")
    public String updateTravellerInfo(@PathVariable("id") String travellerInfoId, @RequestBody TravellerInfo travellerInfo) {
        return travellerInfoRepository.update(travellerInfoId,travellerInfo);
    }
}