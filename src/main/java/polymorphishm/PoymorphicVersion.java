package polymorphishm;

import inheritance.CargoPlane;
import inheritance.FighterPlane;
import inheritance.PassengerPlane;
import inheritance.Plane;

public class PoymorphicVersion {
    public static void main(String[] args) {
        PassengerPlane passengerPlane = new PassengerPlane();
        CargoPlane cargoPlane = new CargoPlane();
        FighterPlane fighterPlane = new FighterPlane();

        Airport airport = new Airport();
        airport.permit(passengerPlane);
        airport.permit(cargoPlane);
        airport.permit(fighterPlane);
    }

}
