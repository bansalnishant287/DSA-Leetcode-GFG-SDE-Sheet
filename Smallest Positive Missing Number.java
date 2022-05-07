/*
Link: "https://practice.geeksforgeeks.org/problems/smallest-positive-missing-number-1587115621/1/"
Smallest Positive missing number 
Medium 

You are given an array arr[] of N integers including 0. The task is to find the smallest positive number missing from the array.

Example 1:

Input:
	N = 5
	arr[] = {1,2,3,4,5}
Output: 6
Explanation: Smallest positive missing number is 6.
*/

class Solution
{
    static int missingNumber(int a[], int n)
    {
       boolean isOnePresent = false;
       for(int i = 0; i < n; i++){
           if(a[i] == 1)
               isOnePresent = true;
           else if(a[i] <=0 || a[i] > n)
               a[i] = 1;
       }
       
       if(!isOnePresent)
           return 1;
       
       for(int i = 0; i < n; i++){
           int index = Math.abs(a[i]) - 1;
           if(a[index] > 0)
               a[index] *= -1;
       }
       
       for(int i = 0; i < n; i++){
           if(a[i] > 0)
               return i + 1;
       }
       return n + 1;
    }
}
