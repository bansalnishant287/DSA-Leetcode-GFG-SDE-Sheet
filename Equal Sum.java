/*
Link: "https://practice.geeksforgeeks.org/problems/equal-sum0810/1/#"
Equal Sum
Medium 
Given an array Arr of length N. Determine if there exists an element in the array such that the sum of the elements on its left is equal to the sum of the elements on its right. If there are no elements to the left/right, then the sum is considered to be zero. 
Formally, find an i, such that, Arr1 + Arr2 ... Arri-1 = Arri+1 + Arri+2 ... ArrN.

Example 1:

Input:
N = 4
Arr[] = {1, 2, 3, 3}
Output: YES
Explanation: Consider i = 3, for [1, 2] 
sum is 3 and for [3] sum is also 3.
*/

class Solution {
    String equilibrium(int a[], int n) {
        int rsum = 0, lsum = 0;
        for(int i=1; i<n; i++) rsum += a[i];
        for(int i=1; i<n; i++){
            rsum -= a[i];
            lsum += a[i-1];
            if(tsum == lsum) return "YES";
        }
        return "NO";
    }
}
