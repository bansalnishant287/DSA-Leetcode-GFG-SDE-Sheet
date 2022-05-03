/*
Link: "https://leetcode.com/problems/two-sum/"
1. Two Sum
   Easy
   Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
   You may assume that each input would have exactly one solution, and you may not use the same element twice.
   You can return the answer in any order.
*/
class Solution {
    public int[] twoSum(int[] nums, int target) {          
        int n = nums.length;
        if (n == 0)
        return nums;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[]{i, map.get(diff)};
             }
            map.putIfAbsent(nums[i], i);
        }
        return nums;
    }
}
