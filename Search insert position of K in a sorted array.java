/*
Link: "https://practice.geeksforgeeks.org/problems/search-insert-position-of-k-in-a-sorted-array/1"
Search insert position of K in a sorted array
Easy
Given a sorted array Arr[](0-index based) consisting of N distinct integers and an integer k, the task is to find the index of k, if its present in the array Arr[]. Otherwise, find the index where k must be inserted to keep the array sorted.

Example 1:

Input:
N = 4
Arr = {1, 3, 5, 6}
k = 5
Output: 2
Explaination: Since 5 is found at index 2 as Arr[2] = 5, the output is 2.
*/

class Solution
{
    static int searchInsertK(int Arr[], int N, int k)
    {
        if(k <= Arr[0]) return 0;
        if(k > Arr[N-1]) return N;
        return binSearch(Arr,k,N);
    }
    
    static int binSearch(int arr[], int x, int r)
    {
        int l = 0;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == x) return m;
            if (arr[m] < x) l = m + 1;
            else r = m - 1;
        }
        return r+1;
    }
}
