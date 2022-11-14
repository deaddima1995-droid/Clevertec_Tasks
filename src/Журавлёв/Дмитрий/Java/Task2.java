package Журавлёв.Дмитрий.Java;

public class Task2 {
    public static void main(String[] args) {

    }

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

class Truck extends Car {
    private final int cargoVolume;
    private final int tonnage;

    private final Body body;
    private final Cargo cargo;

    public Truck(int year, Fuel fuel, Model model, Brand brand, int fuelFlow, int cargoVolume, int tonnage, Body body, Cargo cargo) {
        super(year, fuel, model, brand, fuelFlow);
        this.cargoVolume = cargoVolume;
        this.tonnage = tonnage;
        this.body = body;
        this.cargo = cargo;
    }

    public void sealCargo() {

    }
}

class Passenger extends Car {
    private final int passengerCapacity;

    public Passenger(int year, Fuel fuel, Model model, Brand brand, int fuelFlow, int passengerCapacity) {
        super(year, fuel, model, brand, fuelFlow);
        this.passengerCapacity = passengerCapacity;
    }

    public void disinfectSalon() {

    }
}

interface Body {

}

enum Cargo {
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


