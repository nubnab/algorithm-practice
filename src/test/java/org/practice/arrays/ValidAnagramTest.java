package org.practice.arrays;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ValidAnagramTest {
    private final ValidAnagram validAnagram = new ValidAnagram();

    @Test
    void isValidAnagram_ShouldReturnTrue() {
        String s = "racecar", t = "carrace";
        assertThat(validAnagram.solution(s, t)).isEqualTo(true);
    }

    @Test
    void isNotValidAnagram_ShouldReturnFalse() {
        String s = "racecar", t = "caraces";
        assertThat(validAnagram.solution(s, t)).isEqualTo(false);
    }

    @Test
    void lengthMismatch_ShouldReturnFalse() {
        String s = "racecar", t = "cars";
        assertThat(validAnagram.solution(s, t)).isEqualTo(false);
    }

}