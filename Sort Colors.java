/*
Link: "https://leetcode.com/problems/sort-colors/"
75. Sort Colors (Sort Array of 0's, 1's and 2's)
    Easy
    Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
    We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
    You must solve this problem without using the library's sort function.
*/
class Solution {
    public void sortColors(int[] arr) {
        int i=0, mid=0, j=arr.length-1;
        while(mid <= j){
            if(arr[mid] == 1) mid++;
            else if(arr[mid] == 2){
                int temp = arr[mid];
                arr[mid] = arr[j];
                arr[j] = temp; 
                j--;
            }
            else{
                int temp = arr[mid];
                arr[mid] = arr[i];
                arr[i] = temp;
                i++; mid++;
            }
        }
    }
}
// This is also called Dutch National Flag Algorithm
