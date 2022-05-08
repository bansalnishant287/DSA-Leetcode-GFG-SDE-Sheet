/*
136. Single Number
Easy

Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:

Input: nums = [2,2,1]
Output: 1
*/

class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int i:nums)
            ans ^= i;
        return ans;
    }
}

/*
Facts to know:
1. (a xor b) xor b = a;
2. 0 xor b = b
*/
