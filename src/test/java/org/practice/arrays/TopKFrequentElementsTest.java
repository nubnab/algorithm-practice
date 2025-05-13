package org.practice.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TopKFrequentElementsTest {

    private final TopKFrequentElements frequentElements = new TopKFrequentElements();

    @Test
    void differentFrequencies_ShouldSucceed() {
        int[] nums = {1,1,1,1,2,2,3,3,3};
        int k = 2;

        assertArrayEquals(new int[]{1,3}, frequentElements.solution(nums, k));
    }

    @Test
    void sameFrequencies_ShouldSucceed() {
        int[] nums = {2,1,1,3,1,1,2,2,3,3,3};
        int k = 2;

        assertArrayEquals(new int[]{1,3}, frequentElements.solution(nums, k));
    }

    @Test
    void zeroCheck_ShouldSucceed() {
        int[] nums = {3,1,1,0,0,2,2,3,3,3,0,0,0,0};
        int k = 2;

        assertArrayEquals(new int[]{0,3}, frequentElements.solution(nums, k));
    }



}