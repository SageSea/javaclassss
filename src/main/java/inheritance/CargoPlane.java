package inheritance;

public class CargoPlane extends Plane{
    int noOfWheels;
    public CargoPlane(){
        super(5);
    }
    @Override
    public void fly() {
        super.noOfWheels = 0;
        noOfWheels = 3;
        System.out.println("Cargo Plane is Flying");
    }
    public void carryGoods(){
        System.out.println("Carrying Goods");
    }
    public void crash(){

    }
}
