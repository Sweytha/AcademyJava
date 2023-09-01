package com.bptn.course.week2.solidDesignPrinciples.srp;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void printPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main1 {
    public static void main(String[] args) {
        Person person = new Person("Bob", 25);
        person.printPersonDetails();
    }
}

/*
 * The Person class now has the responsibility of both representing a person's information and printing their details.
This violates SRP because the class has more than one reason to change. 
If you need to change how the person's information is printed, you have to modify the Person class, 
potentially introducing unintended side effects or complicating the class's code.
*/
