package com.airtribe.parkinglot.strategy;

import com.airtribe.parkinglot.model.ParkingSpot;
import com.airtribe.parkinglot.model.VehicleType;
import java.util.List;

public interface ParkingStrategy {

    ParkingSpot findParkingSpot(List<ParkingSpot> spots, VehicleType vehicleType);

}