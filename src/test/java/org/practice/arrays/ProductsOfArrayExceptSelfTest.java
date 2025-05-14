package org.practice.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductsOfArrayExceptSelfTest {

    private final ProductsOfArrayExceptSelf productsOfArrayExceptSelf = new ProductsOfArrayExceptSelf();


    @Test
    void normalInput_ShouldPass() {
        int[] nums = {1, 2, 4, 6};

        assertArrayEquals(new int[] {48, 24, 12, 8}, productsOfArrayExceptSelf.solution(nums));
    }

    @Test
    void mixedNumbers_ShouldPass() {
        int[] nums = {-1, 0, 1, 2, 3};

        assertArrayEquals(new int[] {0, -6, 0, 0, 0}, productsOfArrayExceptSelf.solution(nums));
    }
}