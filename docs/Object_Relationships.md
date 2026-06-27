Object Relationships

Overview

The Smart Parking Lot System is built using several classes that work together to manage the parking process. Each class has a specific responsibility, making the system modular and easy to maintain.

Relationships

ParkingLot → ParkingFloor

- One ParkingLot contains multiple ParkingFloor objects.
- Each floor manages its own parking spots.

ParkingFloor → ParkingSpot

- A ParkingFloor contains multiple ParkingSpot objects.
- Each parking spot can hold only one vehicle at a time.

ParkingSpot → Vehicle

- A ParkingSpot is assigned to a Vehicle when it is available.
- When the vehicle exits, the spot becomes free again.

Vehicle → ParkingTicket

- Each parked vehicle receives one ParkingTicket.
- The ticket stores the entry time, exit time, and parking details.

ParkingService

- Coordinates the parking process.
- Finds available parking spots.
- Parks and removes vehicles.
- Generates parking tickets.

FeeCalculator → FeeStrategy

- FeeCalculator delegates fee calculation to a FeeStrategy.
- This allows different pricing strategies to be added without changing existing code.

Design Summary

The project follows composition between the parking lot, floors, and parking spots, while the Strategy Pattern is used for fee calculation. This design keeps the system flexible and easy to extend.