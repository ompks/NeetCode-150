package com.neetcode.arrays.and.hashing;

import java.util.*;

public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0 || k > nums.length) {
            return new int[0];
        } else if (nums.length==k) {
            return nums;
        }
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        Queue<Integer> heap = new PriorityQueue<>(
                (a,b) -> count.get(a) - count.get(b));

        for(int n:count.keySet()) {
            heap.add(n);
            if (heap.size() > k) {
                heap.poll();
            }
        }

        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = heap.poll();
        }
            return ans;
    }


    public static void main(String[] args) {

        int[] nums = new int[]{1,2,2,3,3,3};
        int k = 2;

        TopKFrequentElements topKFrequentElements = new TopKFrequentElements();
        int[] result=topKFrequentElements.topKFrequent(nums, k);
        System.out.println(Arrays.toString(result));


    }
}
