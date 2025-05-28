package org.practice.arrays;

public class RemoveElement {

    public int solution(int[] nums, int val) {

        int remainingElems = nums.length;

        for (int num : nums) {
            if (num == val) {
                remainingElems--;
            }
        }



        return remainingElems;
    }

}
