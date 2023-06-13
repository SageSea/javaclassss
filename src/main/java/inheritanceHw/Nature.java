package inheritanceHw;

public class Nature {
    public static void main(String[] args) {
        Mammals mammals= new Mammals();
        mammals.Reproduce();
        mammals.Being();
        mammals.Walk();
        mammals.Die();
        System.out.println("\n");

        Aquatic aquatic= new Aquatic();
        aquatic.Reproduce();
        aquatic.Being();
        aquatic.Swim();
        aquatic.Die();
        System.out.println("\n");

        Birds birds= new Birds();
        birds. Reproduce();
        aquatic.Being();
        birds.Fly();
        aquatic.Die();
    }
}
