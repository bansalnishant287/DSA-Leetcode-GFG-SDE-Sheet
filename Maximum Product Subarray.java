/*
Link: "https://leetcode.com/problems/maximum-product-subarray/"
152. Maximum Product Subarray
     Medium
     Given an integer array nums, find a contiguous non-empty subarray within the array that has the largest product, and return the product.
     The test cases are generated so that the answer will fit in a 32-bit integer.
     A subarray is a contiguous subsequence of the array.
*/
class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int cur = 1;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            cur *= nums[i];
            max = Math.max(max,cur);
            if(nums[i] == 0) cur = 1;
        }
        cur = 1;
        for(int i=n-1; i>=0; i--){
            cur *= nums[i];
            max = Math.max(max,cur);
            if(nums[i] == 0) cur = 1;
        }
        return max;
    }
}
// Solution is based on Kadane's Algorithm Approach
