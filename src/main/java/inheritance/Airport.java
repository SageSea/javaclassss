package inheritance;

import protectedtest.JetPlane;

public class Airport {
    public static void main(String[] args) {
        PassengerPlane passengerPlane= new PassengerPlane();
        passengerPlane.carryPassenger();
        passengerPlane.takeOff();
        passengerPlane.fly();
        passengerPlane.land();
        System.out.println("\n");

        CargoPlane cargoPlane= new CargoPlane();
        cargoPlane.carryGoods();
        cargoPlane.takeOff();
        cargoPlane.fly();
        cargoPlane.land();
        System.out.println("\n");

        FighterPlane fighterPlane= new FighterPlane();
        fighterPlane.carryArms();
        fighterPlane.takeOff();
        fighterPlane.fly();
        fighterPlane.land();

    }
}
