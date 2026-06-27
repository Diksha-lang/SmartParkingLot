package com.airtribe.parkinglot.service;

import com.airtribe.parkinglot.model.*;

import java.util.List;

public class ParkingService {

    public ParkingSpot findAvailableSpot(List<ParkingSpot> parkingSpots, VehicleType vehicleType) {

        for (ParkingSpot spot : parkingSpots) {
            if (!spot.isOccupied() && spot.getVehicleType() == vehicleType) {
                return spot;
            }
        }

        return null;
    }

    public void parkVehicle(ParkingSpot spot) {

        if (spot != null) {
            spot.setOccupied(true);
            System.out.println("Vehicle parked successfully.");
            System.out.println("Parking Spot ID: " + spot.getSpotId());
        } else {
            System.out.println("No parking spot available.");
        }
    }

    public void removeVehicle(ParkingSpot spot) {

        if (spot != null) {
            spot.setOccupied(false);
            System.out.println("Vehicle exited successfully.");
        }
    }

    public void displayAvailableSpots(List<ParkingSpot> parkingSpots) {

        System.out.println("\nAvailable Parking Spots:");

        for (ParkingSpot spot : parkingSpots) {
            if (!spot.isOccupied()) {
                System.out.println("Spot " + spot.getSpotId() + " (" + spot.getVehicleType() + ")");
            }
        }
    }
}