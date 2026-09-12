package com.neetcode.arrays.and.hashing;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {

        if (nums == null || nums.length == 0) {
            return new int[0];
        }
        int [] result= new int[nums.length];
        Arrays.fill(result,1);
        int pre=1, post=1;

        for(int i=0;i<nums.length;i++){
            result[i]=pre;
            pre= nums[i]*pre;
        }

        for(int i= nums.length-1;i>=0;i--){
            result[i]=result[i]*post;
            post= nums[i]*post;
        }
                return result;
    }


    public static void main(String[] args) {

        int[] nums=new int[]{1,2,3,4};
        ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();

        System.out.println(Arrays.toString(productOfArrayExceptSelf.productExceptSelf(nums)));

    }
}
