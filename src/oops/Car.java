package oops;

public class Car {
    // Properties , Attributes , class variables
    String brand;
    String color;

    // Constructor
    public Car() {
        brand = "Default Brand";
        color = "Default Color";
    }

    void drive() {
        System.out.println("The car is driving.");
    }

    public static void main(String[] args) {
        // Create an object of Car
        Car car = new Car();

        // Access properties and methods
        System.out.println("Brand: " + car.brand);  // Output: Brand: Default Brand
        System.out.println("Color: " + car.color);  // Output: Color: Default Color
        car.drive(); // Output: The car is driving.

        // Other ways of Declaring
        Car car1;
        car1 = new Car();

        car1.brand = "Honda";
        System.out.println(car1.brand);
        System.out.println(car1.color);

        car1.color = "Black"; // Changing the value at compile time
        System.out.println(car1.color);
    }

}
