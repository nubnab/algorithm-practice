package org.practice.twopointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    private final ValidPalindrome validPalindrome = new ValidPalindrome();

    @Test
    void validPalindrome_ShouldReturnTrue() {
        String input = "Was it a car or a cat I saw?";
        assertTrue(validPalindrome.solution(input));
    }

    @Test
    void validEvenCharPalindrome_ShouldReturnTrue() {
        String input = "Was it a car oor a cat I saw?";
        assertTrue(validPalindrome.solution(input));
    }

    @Test
    void invalidPalindrome_ShouldReturnTrue() {
        String input = "Was it a car o9r a cat I saw?";
        assertFalse(validPalindrome.solution(input));
    }
}