package org.practice.twopointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    private final ValidPalindrome validPalindrome = new ValidPalindrome();

    @Test
    void solution() {
        String input = "Was it a car or a cat I saw?";

        assertTrue(validPalindrome.solution(input));
    }
}