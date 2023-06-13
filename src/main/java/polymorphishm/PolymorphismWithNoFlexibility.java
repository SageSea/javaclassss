package polymorphishm;

public class PolymorphismWithNoFlexibility {
    public static void main(String[] args) {
        Parent ref;
        ref = new Child1();
        ref.cry();

        ref = new Child2();
        ref.cry();

        ref = new Child3();
        ref.cry();

        ref = new Parent();
        ref.cry();

        //ref.cry() is ploymorphic statement
        //1 statement with 3 output


    }
}

/*
* No code reduction
*
* */