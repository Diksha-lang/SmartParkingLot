package com.airtribe.parkinglot.service;

import com.airtribe.parkinglot.model.ParkingFloor;
import java.util.List;

public class ParkingLot {

    private List<ParkingFloor> floors;

    public ParkingLot(List<ParkingFloor> floors) {
        this.floors = floors;
    }

    public List<ParkingFloor> getFloors() {
        return floors;
    }
}