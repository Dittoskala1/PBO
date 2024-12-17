package prak11.Vehichle;

class Vehicle {
    String brand;


    public Vehicle(String brand){
    this.brand = brand;
    }

    public void displayinfo(){
        System.out.println("Brand " + brand);
    }
}

class Car extends Vehicle {
    int doors;

    public Car(String brand, int doors){
        super(brand);
        this.doors = doors;
    }

    public void displayInfo(String type){
        super.displayinfo();
        System.out.println("Type: " + type + "Doors" + doors);
    }
}

public class VehicleTester {
    public static void main(String[] args) {
        Car Car = new Car("Toyota", 4);
        Car.displayInfo("Sedan");
    }
}