package inheritanceHw;

public class Birds extends Animal {
    @Override
    public void Reproduce() {
        System.out.println("Birds lay eggs");
    }
    public void Fly(){
        System.out.println("Birds can fly");
    }
}
