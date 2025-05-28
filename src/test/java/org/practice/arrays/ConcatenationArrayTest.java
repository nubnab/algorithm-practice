package org.practice.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ConcatenationArrayTest {

    private final ConcatenationArray array = new ConcatenationArray();

    @Test
    void validSolution_ShouldReturnTrue() {
        int[] nums = {1, 4, 1, 2};

        assertArrayEquals(new int[]{1, 4, 1, 2, 1, 4, 1, 2}, array.solution(nums));
    }


}