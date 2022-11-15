package Журавлёв.Дмитрий.Java;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {

    }

}

class AutoPark {
    ArrayList<Car> cars = new ArrayList<>();

}

abstract class Car {
    private final int year;
    private final Model model;
    private final Brand brand;
    private Fuel fuel;
    private final int fuelFlow;




    public Car(int year, Fuel fuel, Model model, Brand brand, int fuelFlow) {
        this.year = year;
        this.fuel = fuel;
        this.model = model;
        this.brand = brand;
        this.fuelFlow = fuelFlow;
    }

    public void refuel(int addedFuel) {

    }
    public void repair() {

    }
}

class Cargo extends Car implements TransportCargo {
    private final int cargoVolume;
    private final int tonnage;

    private final Body body;
    private final CargoOfTruck cargoOfTruck;

    public Cargo(int year, Fuel fuel, Model model, Brand brand, int fuelFlow, int cargoVolume, int tonnage, Body body, CargoOfTruck cargoOfTruck) {
        super(year, fuel, model, brand, fuelFlow);
        this.cargoVolume = cargoVolume;
        this.tonnage = tonnage;
        this.body = body;
        this.cargoOfTruck = cargoOfTruck;
    }

    @Override
    public void sealCargo() {

    }
}


class Passenger extends Car implements TransportPassenger {
    private final int passengerCapacity;

    public Passenger(int year, Fuel fuel, Model model, Brand brand, int fuelFlow, int passengerCapacity) {
        super(year, fuel, model, brand, fuelFlow);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public void disinfectSalon() {

    }
}

class CargoAndPassenger extends Car implements TransportCargo, TransportPassenger {
    private final int cargoVolume;
    private final int tonnage;
    private final int passengerCapacity;

    public CargoAndPassenger(int year, Fuel fuel, Model model, Brand brand, int fuelFlow, int cargoVolume, int tonnage, int passengerCapacity) {
        super(year, fuel, model, brand, fuelFlow);
        this.cargoVolume = cargoVolume;
        this.tonnage = tonnage;
        this.passengerCapacity = passengerCapacity;
    }

     @Override
     public void sealCargo() {

     }

     @Override
     public void disinfectSalon() {

     }
 }

interface Body {

}
interface TransportCargo {
    public void sealCargo();
}
interface TransportPassenger {
    public void disinfectSalon();
}

enum CargoOfTruck {
    manufacturedGoods;
}

enum Fuel {
    diesel,
    gaz,
    petrol;
}

interface Model {

}

enum AudiModel implements Model {

}

interface Brand {

}


