Smart Parking Lot System - Class Model

Main Classes

Vehicle

Represents a vehicle entering the parking lot.

Attributes:

- vehicleNumber
- vehicleType

Responsibilities:

- Store vehicle information.
- Identify the type of vehicle.

---

ParkingSpot

Represents a single parking space.

Attributes:

- spotId
- vehicleType
- occupied

Responsibilities:

- Store parking spot details.
- Check whether the spot is available.
- Mark the spot as occupied or free.

---

ParkingFloor

Represents one floor in the parking lot.

Attributes:

- floorNumber
- parkingSpots

Responsibilities:

- Manage all parking spots on a floor.
- Find an available parking spot.

---

ParkingTicket

Represents a parking ticket generated when a vehicle enters.

Attributes:

- ticketId
- vehicle
- parkingSpot
- entryTime
- exitTime

Responsibilities:

- Store parking details.
- Track entry and exit time.

---

ParkingLot

Represents the complete parking lot.

Attributes:

- floors
- activeTickets

Responsibilities:

- Handle vehicle entry.
- Handle vehicle exit.
- Assign parking spots.
- Release parking spots.

---

FeeCalculator

Calculates the parking fee.

Responsibilities:

- Calculate parking charges based on parking duration.
- Return the total parking fee.

---

Relationships

- One ParkingLot contains multiple ParkingFloors.
- One ParkingFloor contains multiple ParkingSpots.
- One ParkingSpot can hold one Vehicle at a time.
- One ParkingTicket is linked to one Vehicle and one ParkingSpot.
- ParkingLot uses FeeCalculator to calculate parking charges.