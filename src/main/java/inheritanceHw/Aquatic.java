package inheritanceHw;

public class Aquatic extends Animal{
    @Override
    public void Reproduce() {
        System.out.println("Aquatic animals lay eggs");
    }
    public void Swim(){
        System.out.println("Aquatic animals can swim");
    }
}
