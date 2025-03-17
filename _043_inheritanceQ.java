/*Vechicel Hierarchy system(Hiearchical inheritan)
 * 1)Create a base class Vehicle with
 * instance variables: brand,model,year
 * a Constructor to intialize these values
 * a method displayDEtails() to print vehicle details 
 * 
 * 2)Create two subclasses Car and Bike that inherit from vehicle 
 * Car should have an additional variable seatingCapacity and a method displayDetails() to display car -specific details 
 * Bike should have an additional variable type(e.g, "Sports","Cruiser") and a method displayDetails() to display bike-specific details.
 * 
 * demonstrate the working of the system in the main method 
 */



class Vehicle {
    String brand;
    String model;
    int year;
    
     Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    
     void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

class Car extends Vehicle {
    int seatingCapacity;
    
     Car(String brand, String model, int year, int seatingCapacity) {
        super(brand, model, year);
        this.seatingCapacity = seatingCapacity;
    }
    
     void displayCarDetails() {
        displayDetails();
        System.out.println("Seating Capacity: " + seatingCapacity);
    }
}

class Bike extends Vehicle {
    String type;
    
     Bike(String brand, String model, int year, String type) {
        super(brand, model, year);
        this.type = type;
    }
    
     void displayBikeDetails() {
        displayDetails();
        System.out.println("Type: " + type);
    }
}

 class _043_inheritanceQ {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2022, 5);
        Bike bike = new Bike("Yamaha", "YZF-R1", 2021, "Sports");
        
        System.out.println("Car Details:");
        car.displayCarDetails();
        
        System.out.println("\nBike Details:");
        bike.displayBikeDetails();
    }
}