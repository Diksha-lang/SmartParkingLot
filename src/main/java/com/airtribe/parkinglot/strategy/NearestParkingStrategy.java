package com.airtribe.parkinglot.strategy;

import com.airtribe.parkinglot.model.ParkingSpot;
import com.airtribe.parkinglot.model.VehicleType;

import java.util.List;

public class NearestParkingStrategy implements ParkingStrategy {

    @Override
    public ParkingSpot findParkingSpot(List<ParkingSpot> spots, VehicleType vehicleType) {

        for (ParkingSpot spot : spots) {

            if (!spot.isOccupied() && spot.getVehicleType() == vehicleType) {
                return spot;
            }

        }

        return null;
    }
}