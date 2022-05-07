/*
Link: "https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/"
448. Find All Numbers Disappeared in an Array
Easy

Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
*/

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<nums.length; i++) {
            int pos = Math.abs(nums[i]);
            if(nums[pos-1] > 0) {
                nums[pos-1] *= -1;
            }
        }
        for(int i=1; i<=nums.length; i++) {
            if(nums[i-1] > 0) result.add(i);
        }
        return result;
    }
}
