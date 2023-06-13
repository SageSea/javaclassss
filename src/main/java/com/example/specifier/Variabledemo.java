package com.example.specifier;

public class Variabledemo {
        public static void main(String[] args) {
                System.out.println("Main method....");
                System.out.println("total dog"+Dog.totalDog);
                Dog d= new Dog();
                Dog d1= new Dog();
                Dog.totalDog += 1;
                d.name= "Heaven";
                d.cost= 1200;
                d.breed= "Pug";
                System.out.println("total dog"+Dog.totalDog);
                d1.eat();
                System.out.println(d1.name);

        }
}
class Dog{
    String name;
    String breed;
    int cost;
    static int totalDog;
    public void eat(){
        System.out.println("Dog is eating.");
    }

}

