package org.caspar.katas.sumOfPositives;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class sumOfPositivesTest {
    @Test
    void return0ifPassedEmptyArray() {
        int[] inputArray = new int[0];
        assertEquals(0, mainSumOfPositives.sumOfPositives(inputArray));
    }

    @Test
    void return0ifPassedArrayOfNegNumbers() {
        int[] inputArray = new int[] { -1, -2, -3, -4, -5 };
        assertEquals(0, mainSumOfPositives.sumOfPositives(inputArray));
    }

    @Test
    void returnExpectedWhenPassedArrayOfPositiveInts() {
        int[] inputArray = new int[] { 1, 2, 3, 4, 5 };
        int expectedSum = 15;
        assertEquals(expectedSum, mainSumOfPositives.sumOfPositives(inputArray));
    }


}