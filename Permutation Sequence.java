/*
Link: "https://leetcode.com/problems/permutation-sequence/"
60. Permutation Sequence
    Hard
The set [1, 2, 3, ..., n] contains a total of n! unique permutations.

By listing and labeling all of the permutations in order, we get the following sequence for n = 3:

"123"
"132"
"213"
"231"
"312"
"321"
Given n and k, return the kth permutation sequence.

Example 1:

Input: n = 3, k = 3
Output: "213"
*/

class Solution {
    public String getPermutation(int n, int k) {
        if(n == 1) return "1";
        
        int fact = 1;
        List<Integer> l = new ArrayList<>();
        
        for(int i=1; i<n; i++){
            fact *= i;
            l.add(i);
        } l.add(n);
        
        String ans = "";
        k -= 1;
        
        while(true){
            ans += l.get(k/fact);
            l.remove(k/fact);
            
            if(l.size() == 0) break;
            
            k %= fact;
            fact /= l.size();
        }
        
        return ans;
    }
}
