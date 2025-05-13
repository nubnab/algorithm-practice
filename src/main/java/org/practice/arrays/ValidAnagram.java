package org.practice.arrays;

import java.util.HashMap;

public class ValidAnagram {

    public boolean solution(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> mapS = new HashMap<>(), mapT = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            mapS.put(s.charAt(i), mapS.getOrDefault(s.charAt(i), 0) + 1);
            mapT.put(t.charAt(i), mapT.getOrDefault(t.charAt(i), 0) + 1);
        }

        return mapS.equals(mapT);
    }
}
