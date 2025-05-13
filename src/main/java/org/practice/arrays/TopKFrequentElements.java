package org.practice.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {

    public int[] solution(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<List<Integer>> list = new ArrayList<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int i = 0; i < nums.length + 1; i++) {
            list.add(new ArrayList<>());
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            list.get(entry.getValue()).add(entry.getKey());
        }

        int index = 0;
        int[] result = new int[k];

        for(int i = list.size() - 1; i > 0 && index < k; i--){
            for(int j = 0; j < list.get(i).size(); j++){
                result[index++] = list.get(i).get(j);
                if(index == k){
                    return result;
                }
            }
        }
        return result;
    }
}

