package polymorphishm;

public class DownCasting {
    public static void main(String[] args) {
        Parent ref;
        ref = new Child1(); //loose coupling
        ref.cry();
        ((Child1)(ref)).eat(); //down casting

        Child1 child1Reference = (Child1) ref;
        child1Reference.eat();

        Parent parentRef = new Child1(); //loose coupling upcasting
    }
}
