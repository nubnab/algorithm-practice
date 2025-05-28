package org.practice.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {
    private final LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

    @Test
    void solution() {
        String[] strs = new String[] {"bat", "bag", "bank", "band"};

        assertThat(longestCommonPrefix.solution(strs)).isEqualTo("ba");

    }

    @Test
    void solution2() {
        String[] strs = new String[] {"bat", "bag", "", "band"};

        assertThat(longestCommonPrefix.solution(strs)).isEqualTo("");

    }
}