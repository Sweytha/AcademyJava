package com.bptn.course.week4.methodReference;

//Functional interface with a single abstract method
@FunctionalInterface
interface Interface3 {
 void showInterfaceInfo();
}

//Main class
public class MethodReferenceExample3 {
 // Instance method to be called
 void show() {
     System.out.println("This is called using instance method reference");
 }

 public static void main(String[] args) {
     // Create an instance of MethodReferenceExample3
     MethodReferenceExample3 demo = new MethodReferenceExample3();
     
     // Referring Method using lambda expression
     Interface3 obj = () -> demo.show(); // Lambda expression to call the 'show' instance method
     obj.showInterfaceInfo();

     // Referring Method using method reference
     Interface3 ji = demo::show; // Method reference to the 'show' instance method
     ji.showInterfaceInfo();
 }
}
