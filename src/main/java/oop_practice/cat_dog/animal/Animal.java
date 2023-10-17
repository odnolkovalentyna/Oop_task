package oop_practice.cat_dog.animal;

public class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void sound() {
        System.out.println("I'm an animal. My name is " + name);
    }

    public String getName() {
        return this.name;
    }

}


