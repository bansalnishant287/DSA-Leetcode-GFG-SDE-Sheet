/*
442. Find All Duplicates in an Array
Medium

Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.

You must write an algorithm that runs in O(n) time and uses only constant extra space.

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]
*/

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> dc = new ArrayList<>();
        for(int i : nums){
            i = Math.abs(i);
            if(nums[i-1] > 0) nums[i-1] *= -1;
            else dc.add(i);
        }
        return dc;
    }
}
