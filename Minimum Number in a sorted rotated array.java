/*
Link: "https://practice.geeksforgeeks.org/problems/minimum-number-in-a-sorted-rotated-array-1587115620/1#"
Minimum Number in a sorted rotated array 
Easy
Given an array of distinct elements which was initially sorted. This array is rotated at some unknown point. 
The task is to find the minimum element in the given sorted and rotated array. 

Example 1:

Input:
N = 10
arr[] = {2,3,4,5,6,7,8,9,10,1}
Output: 1
Explanation: The array is rotated once anti-clockwise. So minimum element is at last index (n-1) 
which is 1.
*/
class Solution
{
    //Function to find the minimum element in sorted and rotated array.
    static int minNumber(int arr[], int low, int high)
    {
        while(low < high)
       {
           int mid = low + (high-low)/2;
           if(arr[mid] > arr[high])
               low = mid + 1;
           else
               high = mid;
       }
       return arr[low];
    }
}
