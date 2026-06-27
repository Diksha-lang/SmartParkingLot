SOLID Reflection

This project was designed with the SOLID principles in mind to keep the code clean and maintainable.

Single Responsibility Principle (SRP)

Each class has one clear responsibility. For example, ParkingService manages parking operations, while FeeCalculator only calculates parking fees.

Open/Closed Principle (OCP)

The fee calculation logic uses the Strategy Pattern. New pricing strategies can be added by implementing the FeeStrategy interface without modifying existing classes.

Liskov Substitution Principle (LSP)

Bike, Car, and Bus extend the Vehicle class and can be used wherever a Vehicle object is expected.

Interface Segregation Principle (ISP)

The FeeStrategy interface contains only one method, allowing implementations to focus on fee calculation without unnecessary methods.

Dependency Inversion Principle (DIP)

FeeCalculator depends on the FeeStrategy abstraction rather than a specific implementation. This makes the fee calculation logic flexible and easy to replace.

Reflection

Applying the SOLID principles made the project more organized and easier to understand. It also improved code reusability and makes future enhancements, such as adding new vehicle types or pricing strategies, much simpler.