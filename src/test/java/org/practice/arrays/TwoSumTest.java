package org.practice.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    private final TwoSum twoSum = new TwoSum();

    @Test
    void validSortedTwoSum_ShouldSucceed() {
        int[] nums = {3, 4, 5, 6};
        int target = 7;
        assertArrayEquals(new int[] {0,1}, twoSum.solution(nums, target));
    }

    @Test
    void validUnsortedTwoSum_ShouldSucceed() {
        int[] nums = {10, 8, 4, 6, 5, 3};
        int target = 7;
        assertArrayEquals(new int[] {2,5}, twoSum.solution(nums, target));
    }

    @Test
    void validNegativeUnsortedTwoSum_ShouldSucceed() {
        int[] nums = {-10, -8, -4, -6, -5, -3};
        int target = -7;
        assertArrayEquals(new int[] {2,5}, twoSum.solution(nums, target));
    }

    @Test
    void validMixedUnsortedTwoSum_ShouldSucceed() {
        int[] nums = {-10, -8, 4, -6, -5, -3};
        int target = 1;
        assertArrayEquals(new int[] {2,5}, twoSum.solution(nums, target));
    }

    @Test
    void inValidTwoSum_ShouldReturnEmptyArray() {
        int[] nums = {10, 4, 5, 2};
        int target = 3;
        assertArrayEquals(new int[0], twoSum.solution(nums, target));
    }

}