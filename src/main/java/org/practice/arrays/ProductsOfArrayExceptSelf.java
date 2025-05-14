package org.practice.arrays;

public class ProductsOfArrayExceptSelf {

    //TODO: can be improved
    public int[] solution(int[] nums) {
        int[] prefixSum = new int[nums.length - 1];
        int[] suffixSum = new int[nums.length - 1];

        for(int i = 0; i < nums.length - 1; i++) {
            if(i == 0) {
                prefixSum[i] = nums[i];
            } else {
                prefixSum[i] = prefixSum[i - 1] * nums[i];
            }
        }

        for(int j = 0; j < nums.length - 1; j++) {
            if(j == 0) {
                suffixSum[j] = nums[nums.length - 1];
            }   else {
                suffixSum[j] = suffixSum[j - 1] * nums[nums.length - 1 - j];
            }
        }

        int[] result = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            if(i == 0) {
                result[i] = suffixSum[suffixSum.length - 1];
            } else if (i == nums.length - 1) {
                result[i] = prefixSum[prefixSum.length - 1];
            } else {
                result[i] = prefixSum[i - 1] * suffixSum[suffixSum.length - 1 - i];
            }
        }

        return result;
    }

}