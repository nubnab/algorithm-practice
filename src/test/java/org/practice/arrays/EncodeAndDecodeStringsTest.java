package org.practice.arrays;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class EncodeAndDecodeStringsTest {

    private final EncodeAndDecodeStrings encodeAndDecodeStrings = new EncodeAndDecodeStrings();

    @ParameterizedTest
    @MethodSource("testCases")
    void solutionTest(List<String> input) {
        assertEquals(input, encodeAndDecodeStrings.solution(input));
    }

    private static Stream<Arguments> testCases() {
        List<String> normalCase = Arrays.asList("neet","code","love","you");
        List<String> emptyString = List.of("");
        List<String> singleString = List.of("neet");
        List<String> stringsWithSpaces = Arrays.asList("ne  et","c ode","lo  ve","yo u");
        List<String> specialCharacters = Arrays.asList("ne(*$&Q(*et","cod!@#)(*!@#e","lov12(*#@&^e","yo$#()*u");

        return Stream.of(
                Arguments.of(normalCase),
                Arguments.of(emptyString),
                Arguments.of(singleString),
                Arguments.of(stringsWithSpaces),
                Arguments.of(specialCharacters));
    }
}