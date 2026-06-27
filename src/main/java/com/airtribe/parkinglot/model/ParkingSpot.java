package com.airtribe.parkinglot.model;

public class ParkingSpot {

    private int spotId;
    private VehicleType vehicleType;
    private boolean occupied;

    public ParkingSpot(int spotId, VehicleType vehicleType) {
        this.spotId = spotId;
        this.vehicleType = vehicleType;
        this.occupied = false;
    }

    public int getSpotId() {
        return spotId;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }
}