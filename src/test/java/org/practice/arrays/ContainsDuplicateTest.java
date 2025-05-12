package org.practice.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ContainsDuplicateTest {

    private final ContainsDuplicate containsDuplicate = new ContainsDuplicate();

    @Test
    void duplicate_ShouldReturnTrue() {
        int[] nums = {-1, -2, 3, 3};
        assertThat(containsDuplicate.solution(nums)).isEqualTo(true);
    }

    @Test
    void notDuplicate_ShouldReturnFalse() {
        int[] nums = {1, 2, 3, 4};
        assertThat(containsDuplicate.solution(nums)).isEqualTo(false);
    }

}