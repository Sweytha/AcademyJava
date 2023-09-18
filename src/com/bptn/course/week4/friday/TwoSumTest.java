package com.bptn.course.week4.friday;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TwoSumTest {

    private TwoSum twoSum;

    @BeforeEach
    public void setUp() {
        twoSum = new TwoSum();
    }

    @Test
    public void testTwoSum() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expectedIndices = {0, 1}; // Expected indices of elements 2 and 7

        int[] result = twoSum.twoSum(nums, target);

        assertArrayEquals(expectedIndices, result);
    }

    @Test
    public void testNoSolution() {
        int[] nums = {2, 7, 11, 15};
        int target = 3; // No two elements add up to 3

        assertThrows(IllegalArgumentException.class, () -> {
            twoSum.twoSum(nums, target);
        });
    }
}

