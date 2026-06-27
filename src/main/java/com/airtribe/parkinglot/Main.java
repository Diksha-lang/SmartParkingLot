package com.airtribe.parkinglot;

import com.airtribe.parkinglot.model.*;
import com.airtribe.parkinglot.service.ParkingService;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<ParkingSpot> parkingSpots = new ArrayList<>();

        parkingSpots.add(new ParkingSpot(1, VehicleType.CAR));
        parkingSpots.add(new ParkingSpot(2, VehicleType.CAR));
        parkingSpots.add(new ParkingSpot(3, VehicleType.BIKE));
        parkingSpots.add(new ParkingSpot(4, VehicleType.BUS));

        ParkingService parkingService = new ParkingService();

        Vehicle vehicle = new Vehicle("KA01AB1234", VehicleType.CAR);

        ParkingSpot spot = parkingService.findAvailableSpot(
                parkingSpots,
                vehicle.getVehicleType());

        parkingService.parkVehicle(spot);

        parkingService.displayAvailableSpots(parkingSpots);

        parkingService.removeVehicle(spot);

        parkingService.displayAvailableSpots(parkingSpots);
    }
}