package com.example.specifier;

public class Constructorexample {
    public static void main(String[] args){
        Dog dog= new Dog("Tommy","Bulldog",1000);
        System.out.println("Name of dog:"+dog.getName());
        System.out.println("Breed of dog:"+dog.getBreed());
        System.out.println("Cost:"+dog.getCost());
    }

    public static class Dog {
        private String name;
        private String breed;
        int cost;

        public Dog(String dogName, String dogBreed, int dogCost) {
            name = dogName;
            breed = dogBreed;
            cost = dogCost;
        }

        public Dog(String name, String breed) {
            this(name, breed, 1000);
            this.name = name;
            this.breed = breed;
        }

        public Dog(int cost) {
            this("Tommy", "Pug");
            this.cost = cost;
        }
//encapsulation
        public String getName() {
            return name;
        }

        public void setName(String dogName) {
            if (iShouldLike(dogName)) {
                //I must like the name
                name = dogName;
            }
        }

        private boolean iShouldLike(String dogName) {
            return true;
        }

        void eat() {

        }

        void sleep() {
        }

        void bark() {

        }

        public String getBreed() {
            return breed;
        }


        public int getCost() {
            return cost;
        }

        public void setBreed(String breed) {
            this.breed = breed;
        }

        public void setCost(int cost) {
            this.cost = cost;
        }
    }
}
