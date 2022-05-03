/*
Link: "https://leetcode.com/problems/rotate-array/"
189. Rotate Array
     Medium
     Given an array, rotate the array to the right by k steps, where k is non-negative.
*/
class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    public void reverse(int[] arr, int i, int j){
        while(i < j){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++; j--;
        }
    }
}
