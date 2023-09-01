package com.bptn.course.week2.solidDesignPrinciples.lsp;

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
    
}

class Bird extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bird sings");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("Fish swims");
    }
}
public class Main1 {
    public static void main(String[] args) {
        Animal bird = new Bird();
        Animal fish = new Fish();

        bird.makeSound(); // Bird sings
        fish.makeSound(); // Animal makes a sound (unexpected behavior)
        // fish.swim(); // Swim method is only available for Fish, not all animals.
    }
}
