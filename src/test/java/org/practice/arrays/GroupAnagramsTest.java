package org.practice.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramsTest {
    private final GroupAnagrams groupAnagrams = new GroupAnagrams();

    @Test
    void solution_ShouldGroupAnagrams() {
        List<List<String>> result = groupAnagrams
                .solution(new String[] {"act","pots","tops","cat","stop","hat"});

        Set<Set<String>> expectedGroups = new HashSet<>();

        expectedGroups.add(new HashSet<>(Arrays.asList("act", "cat")));
        expectedGroups.add(new HashSet<>(Arrays.asList("pots", "tops", "stop")));
        expectedGroups.add(new HashSet<>(List.of("hat")));

        Set<Set<String>> resultGroups = new HashSet<>();
        for (List<String> group : result) {
            resultGroups.add(new HashSet<>(group));
        }

        assertEquals(expectedGroups, resultGroups);
    }

    @Test
    void singleString_ShouldReturnUnmodifiedArrayList() {
        List<List<String>> result = groupAnagrams
                .solution(new String[] {"x"});

        Set<Set<String>> expectedGroups = new HashSet<>();

        expectedGroups.add(new HashSet<>(List.of("x")));

        Set<Set<String>> resultGroups = new HashSet<>();
        resultGroups.add(new HashSet<>(result.getFirst()));

        assertEquals(expectedGroups, resultGroups);
    }

    @Test
    void emptyString_ShouldReturnUnmodifiedArrayList() {
        List<List<String>> result = groupAnagrams
                .solution(new String[] {""});

        Set<Set<String>> expectedGroups = new HashSet<>();

        expectedGroups.add(new HashSet<>(List.of("")));

        Set<Set<String>> resultGroups = new HashSet<>();
        resultGroups.add(new HashSet<>(result.getFirst()));

        assertEquals(expectedGroups, resultGroups);
    }

    @Test
    void emptyList_ShouldReturnEmptyArrayList() {
        List<List<String>> result = groupAnagrams.solution(new String[]{});
        assertTrue(result.isEmpty());
    }

    @Test
    void solution_ShouldReturnNoAnagrams() {
        String[] input = {"act", "pots", "hat"};
        List<List<String>> result = groupAnagrams.solution(input);

        assertEquals(3, result.size());

        for (List<String> group : result) {
            assertEquals(1, group.size());
        }
    }

}