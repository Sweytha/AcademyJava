package com.bptn.course.week2.solidDesignPrinciples.srp;

/*class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class PersonPrinter {
    public void printPersonDetails(Person person) {
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);
        PersonPrinter printer = new PersonPrinter();
        printer.printPersonDetails(person);
    }
}*/
/*
 * In this example:

The Person class has the responsibility of representing a person's information (name and age).
The PersonPrinter class has the responsibility of printing a person's details to the console.
This adheres to SRP because each class has a single reason to change.
If you need to change how a person's information is printed, 
you only need to modify the PersonPrinter class, and changes to the Person class will not affect it.
 */

