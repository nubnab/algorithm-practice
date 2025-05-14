package org.practice.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestConsecutiveSequenceTest {
    private final LongestConsecutiveSequence lcs = new LongestConsecutiveSequence();


    @Test
    void solution() {
        assertEquals(4, lcs.solution(new int[] {2, 20, 4, 10, 3, 4, 5}));
    }
}