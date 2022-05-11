/*
Nth item through sum 
Easy
Given two sorted arrays A and B of length L1 and L2, we can get a set of sums(add one element from the first and one from second). Find the Nth element in the set considered in sorted order.
Note: Set of sums should have unique elements.

Example 1:

Input: L1 = 2, L2 = 2
A = {1, 2}
B = {3, 4}
N = 3
Output: 6
Explaination: The set of sums are in the order 4, 5, 6.
*/

class Solution{
    static int nthItem(int L1, int L2, int A[], int B[], int N)
    {
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<L1; i++)
            for(int j=0; j<L2; j++)
                set.add(A[i]+B[j]);
        
        if (set.size() < N)
            return -1;
   
        ArrayList<Integer> arr = new ArrayList<>();
    
        for(int i: set){
           arr.add(i);
        }
        Collections.sort(arr);
        return arr.get(N-1);
        
    }
}
