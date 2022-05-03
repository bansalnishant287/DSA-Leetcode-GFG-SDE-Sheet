/*
Link: "https://leetcode.com/problems/product-of-array-except-self/"
238. Product of Array Except Self
     Medium
     Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
     The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
     You must write an algorithm that runs in O(n) time and without using the division operation.
*/
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] l = new int[n];
        int[] r = new int[n];
        l[0] = 1;
        r[n-1] = 1;
        for(int i=1; i<n; i++) l[i] = l[i-1]*nums[i-1];
        for(int j=n-2; j>=0; j--) r[j] = r[j+1]*nums[j+1];
        int[] ans = new int[n];
        for(int i=0; i<n; i++){
            ans[i] = l[i]*r[i];
        }
        return ans;
    }
}
