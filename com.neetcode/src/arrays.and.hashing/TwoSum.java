package com.neetcode.arrays.and.hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        // create a hashmap to store numbers and their indices
        Map<Integer, Integer> map = new HashMap<>();

//        iterate through array
        for (int i = 0; i < nums.length; i++) {

            // calculate the component of the current number
            int complement = target - nums[i];

            // check if component is present in the map
            if (map.containsKey(complement)) {
//                if found , return the indices of the component and the current number
                return new int[]{map.get(complement), i};
            }

            // otherwise add the current number and index to the map
            map.put(nums[i], i);
        }

//        return empty array if no solution is found
        return new int[]{};
    }


    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
