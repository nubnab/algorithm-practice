package org.practice.arrays;

public class MajorityElement {

    public int solution(int[] nums) {
        int n = nums.length;
        for (int num : nums) {
            int count = 0;
            for (int i : nums) {
                if (i == num) {
                    count++;
                }
            }
            if (count > n / 2) {
                return num;
            }
        }
        return -1;
    }

}
