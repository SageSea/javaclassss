package inheritance;

public class Plane {
    int noOfWheels;

    public Plane(int noOfWheels) {

    }

    public void takeOff() {
        System.out.println("A plane is taking out");
    }

    public void fly() {
        System.out.println("A plane is flying");
    }

    public void land() {
        System.out.println("Plane is landing");
    }

    /*
     * private members are not inherited
     * crash works as specialized method
     * */
    private void crash() {
        System.out.println("A plane has crashed");
    }

    protected boolean hasPilot() {
        return true;
    }
}

