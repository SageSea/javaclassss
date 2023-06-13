package inheritanceHw;

public class Mammals extends Animal {
    @Override
    public void Reproduce() {
        System.out.println("Mammals give direct birth");
    }
    public void Walk(){
        System.out.println("Mammals mostly walk");
    }

}
