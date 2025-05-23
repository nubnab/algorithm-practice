package org.practice.twopointers;

public class ValidPalindrome {

    public boolean solution(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            while (left < right && !alphaNum(s.charAt(left))) {
                left++;
            }

            while (left < right && !alphaNum(s.charAt(right))) {
                right--;
            }

            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public boolean alphaNum(char c) {
        return c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9';
    }

}
