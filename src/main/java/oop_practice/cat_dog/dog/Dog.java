package oop_practice.cat_dog.dog;

import oop_practice.cat_dog.animal.Animal;

public class Dog extends Animal {

    public Dog(String name){
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("I'm a Dog. My name is " + super.getName() + ". Gav");
    }
}
