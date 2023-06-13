package inheritance;

public class PassengerPlane extends Plane{
    public PassengerPlane(){
        super(4);
    }
    @Override
    public void fly() {
        System.out.println("A passenger plane is flying");
    }

    public void carryPassenger(){
        System.out.println("Carrying Passenger");
    }
}
