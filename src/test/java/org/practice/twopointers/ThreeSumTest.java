package org.practice.twopointers;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumTest {

    private final ThreeSum threeSum = new ThreeSum();

    @Test
    void solution() {
        List<List<Integer>> list = new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(-1, -1, 2)),
                new ArrayList<>(Arrays.asList(-1, 0, 1))
        ));

        assertEquals(list, threeSum.solution(new int[] {-1, 0, 1, 2, -1, -4}));
    }
}