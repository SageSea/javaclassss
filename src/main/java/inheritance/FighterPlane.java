package inheritance;

public class FighterPlane extends Plane{
    public FighterPlane(){
        super(7);
    }
    @Override
    public void fly()  //overridden method
    {
        System.out.println("Fighter plane is flying");
    }
    public void carryArms() //specialized method
    {
        System.out.println("Carrying arms and flying");
    }
    // inherited method: takeoff & land
}
