Smart Parking Lot System

Overview

This project is a Java-based Smart Parking Lot System built as part of my Low-Level Design (LLD) practice. The goal was to design a parking management system that can assign parking spots automatically, keep track of vehicles entering and leaving the parking lot, and calculate parking charges based on how long a vehicle stays.

While building this project, I focused on writing clean, modular code using Object-Oriented Programming concepts and applying SOLID principles wherever appropriate.



Features

- Register vehicles entering the parking lot
- Automatically allocate parking spots based on vehicle type
- Support different vehicle types such as Bike, Car, and Bus
- Track vehicle entry and exit
- Generate parking tickets
- Calculate parking fees using the Strategy Design Pattern
- Free parking spots after a vehicle exits
- Display all available parking spots
- Handle multiple parking floors
- Use custom exceptions for invalid parking operations



Technologies Used

- Java
- Object-Oriented Programming (OOP)
- SOLID Principles
- Strategy Design Pattern
- Git & GitHub



Project Structure

The project is organized into separate packages to keep the code clean and easy to understand.

- model – Contains the main classes such as "Vehicle", "ParkingSpot", "ParkingFloor", and "ParkingTicket".
- service – Handles the parking operations and business logic.
- strategy – Contains the fee calculation strategy implementation.
- exception – Stores custom exceptions used in the project.
- util – Reserved for utility classes if needed in future.
- docs – Contains project documentation including requirements, class model, object relationships, and SOLID reflection.
- Main.java – Entry point used to test the application.



Design Approach

While developing this project, I followed:

- Object-Oriented Programming principles
- SOLID Principles
- Separation of Concerns
- Strategy Design Pattern for fee calculation
- A modular package structure for better readability and maintainability



Supported Vehicle Types

- Bike
- Car
- Bus



Main Components

The system consists of the following main classes:

- Vehicle
- ParkingSpot
- ParkingFloor
- ParkingLot
- ParkingTicket
- ParkingService
- FeeCalculator
- FeeStrategy
- HourlyFeeStrategy
- ParkingException



How to Compile

From the "src/main/java" directory, run:

javac com/airtribe/parkinglot/Main.java



How to Run

java com.airtribe.parkinglot.Main



Sample Output

Vehicle parked successfully.
Parking Spot ID: 1

Available Parking Spots:
Spot 2 (CAR)
Spot 3 (BIKE)
Spot 4 (BUS)

Vehicle exited successfully.

Available Parking Spots:
Spot 1 (CAR)
Spot 2 (CAR)
Spot 3 (BIKE)
Spot 4 (BUS)



What I Learned

Working on this project helped me understand how to design software using Low-Level Design concepts instead of simply writing code. I also gained hands-on experience with OOP, SOLID principles, the Strategy Design Pattern, and organizing Java projects using a clean package structure. In addition, I became more comfortable using Git and GitHub to manage project versions.



Future Improvements

Some features that can be added in future versions are:

- Online parking spot reservation
- Different pricing strategies
- Payment gateway integration
- Database support
- REST APIs using Spring Boot
- Unit testing with JUnit



Author

Diksha Lang

Computer Science Student

This project was developed as part of my Backend Java and Low-Level Design learning journey to strengthen my understanding of software design, clean coding practices, and Java application development.