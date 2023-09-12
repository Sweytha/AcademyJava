package com.bptn.course.week4.generics;

public class BoundedGenericsExample<T extends Number> {
    private T value;

    public BoundedGenericsExample(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public static void main(String[] args) {
        BoundedGenericsExample<Integer> intExample = new BoundedGenericsExample<>(42);
        BoundedGenericsExample<Double> doubleExample = new BoundedGenericsExample<>(3.14);

        System.out.println("Integer Value: " + intExample.getValue());
        System.out.println("Double Value: " + doubleExample.getValue());

        // Attempting to create a String-based instance (which will result in a compile-time error)
        // BoundedGenericsExample<String> stringExample = new BoundedGenericsExample<>("Hello");
    }
}
