package org.practice.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class RemoveElementTest {
    private final RemoveElement removeElement = new RemoveElement();

    @Test
    void solution() {
        int[] nums = new int[]{1,1,2,3,4};
        int val = 1;

        assertThat(removeElement.solution(nums, val)).isEqualTo(3);

    }
}