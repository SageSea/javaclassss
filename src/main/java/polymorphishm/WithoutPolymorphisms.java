package polymorphishm;


public class WithoutPolymorphisms {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child1 child1 = new Child1();
        Child2 child2 = new Child2();
        Child3 child3 = new Child3();
        parent.cry();
        child1.cry();
        child2.cry();
        child3.cry();
    }
}

/*
* The above program is non-polymorphic version that is because
* 3 different statements are producing 3 different outputs
* Hence the equation 3:3 i.e 1:1 and hence above program is not polymorphic
*
*
* a child reference is created to child object that is tight coupling
*
* For polymorphism to be achieve there should be loose coupling
*
*
* */


