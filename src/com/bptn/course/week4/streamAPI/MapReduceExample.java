package com.bptn.course.week4.streamAPI;

import java.util.Arrays;
import java.util.List;

public class MapReduceExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Using map to square each number
        List<Integer> squares = numbers.stream()
                .map(x -> x * x)
                .toList();

        System.out.println("Squares of numbers: " + squares);

        // Using reduce to calculate the sum of squares
        int sumOfSquares = numbers.stream()
                .map(x -> x * x)
                .reduce(0, (a, b) -> a + b);

        System.out.println("Sum of squares: " + sumOfSquares);
    }
}