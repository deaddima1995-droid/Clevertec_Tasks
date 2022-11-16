package Журавлёв.Дмитрий.Java;

public class Task2 {
    public static void main(String[] args) {

    }

}

abstract class Transport {
    private final int year;
    private final Model model;
    private final Brand brand;
    private Fuel fuel;
    private final int fuelFlow;




    public Transport(int year, Fuel fuel, Model model, Brand brand, int fuelFlow) {
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

abstract class Cargo extends Transport implements TransportCargo {
    private final int cargoVolume;
    private final int tonnage;

    private final Body body;
    public CargoTruck cargoTruck = null;

    public Cargo(int year, Fuel fuel, Model model, Brand brand, int fuelFlow, int cargoVolume, int tonnage, Body body) {
        super(year, fuel, model, brand, fuelFlow);
        this.cargoVolume = cargoVolume;
        this.tonnage = tonnage;
        this.body = body;
    }
}

class Truck extends Cargo{

    public Truck(int year, Fuel fuel, Model model, Brand brand, int fuelFlow, int cargoVolume, int tonnage, BodiesOfTruck body) {
        super(year, fuel, model, brand, fuelFlow, cargoVolume, tonnage, body);
    }

    @Override
    public void sealCargo() {

    }
}


class Passenger extends Transport implements TransportPassenger {
    private final int passengerCapacity;

    public Passenger(int year, Fuel fuel, Model model, Brand brand, int fuelFlow, int passengerCapacity) {
        super(year, fuel, model, brand, fuelFlow);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public void disinfectSalon() {
        System.out.println("Произведена дезинфекция");
    }
}

class CargoAndPassenger extends Transport implements TransportCargo, TransportPassenger {
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

enum BodiesOfTruck implements Body {

}
interface TransportCargo {
    public void sealCargo();
}
interface TransportPassenger {
    public void disinfectSalon();
}

interface CargoTruck {

}


enum Trailer {
    tent,
    refrigerator,
    tanker;
}

interface CargoOfTrailer extends CargoTruck{

}

interface RefrigeratorOfTruck {

}

enum ManufacturedGoods implements CargoOfTrailer{
    manufacturedGoods;
}
enum PerishableGoods implements RefrigeratorOfTruck {
    refrigerator;
}

enum Fuel {
    diesel,
    gaz,
    petrol;
}

interface Model {
}

interface Brand {
}


