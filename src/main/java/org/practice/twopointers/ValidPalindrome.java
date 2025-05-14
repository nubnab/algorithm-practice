package org.practice.twopointers;

public class ValidPalindrome {

    public boolean solution(String s) {

        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int len = s.length();
        int prefix = s.length() / 2;
        int suffix = s.length() % 2;


        System.out.println();



        return true;
    }



}
