/*
Link: "https://practice.geeksforgeeks.org/problems/find-missing-and-repeating2512/1/#"
Find Missing And Repeating 
Medium

Given an unsorted array Arr of size N of positive integers. One number 'A' from set {1, 2, …N} is missing and one number 'B' occurs twice in array. Find these two numbers.

Example 1:

Input:
N = 2
Arr[] = {2, 2}
Output: 2 1
Explanation: Repeating number is 2 and smallest positive missing number is 1.
*/

class Solve {
    int[] findTwoElement(int nums[], int n) {
        // code here
        int[] dc = new int[2];
        for(int i = 0; i < n; i++){
            int j = Math.abs(nums[i]);
            if(nums[j-1] > 0) nums[j-1] *= -1;
            else{
                dc[0] = j;
            }
        }
        for(int i = 0; i < n; i++)
           if(nums[i] > 0) dc[1] = i+1;
       
        return dc;
    }
}
