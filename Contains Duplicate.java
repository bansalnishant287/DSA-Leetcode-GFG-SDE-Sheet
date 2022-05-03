/*
Link: "https://leetcode.com/problems/contains-duplicate/"
217. Contains Duplicate
     Easy
     Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
*/
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<E> set = new HashSet<E>(Arrays.asList(nums));
        return set.size() != nums.length;
    }
}
