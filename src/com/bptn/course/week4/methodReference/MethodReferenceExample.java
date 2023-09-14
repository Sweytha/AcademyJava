package com.bptn.course.week4.methodReference;

//Functional interface with a single abstract method taking a String parameter
@FunctionalInterface
interface Interface {
 void showInterfaceInfo(String message);
}

//Main class
public class MethodReferenceExample {
 // Static method to be called
 static void show(String message) {
     System.out.println("This is called using method reference with message: " + message);
 }

 public static void main(String[] args) {
     // Using a lambda expression to pass a message parameter
     Interface obj = (message) -> MethodReferenceExample.show(message);
     obj.showInterfaceInfo("Lambda Expression");

     // Referring Method using method reference with a message parameter
     Interface ji = MethodReferenceExample::show;
     ji.showInterfaceInfo("Method Reference");
 }
}
