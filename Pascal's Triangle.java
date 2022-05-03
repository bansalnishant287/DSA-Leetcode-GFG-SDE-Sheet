/*
Link: "https://leetcode.com/problems/pascals-triangle/"
118. Pascal's Triangle
     Easy
     Given an integer numRows, return the first numRows of Pascal's triangle.

     In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
     1
    1 1
   1 2 1        For N = 3
  1 3 3 1 
*/
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> cur, pre = null;
        
        for(int i=0; i<numRows; i++){
            cur = new ArrayList<Integer>();
            for(int j=0; j<=i; j++)
                if(j==0 || j==i) cur.add(1);
                else cur.add(pre.get(j-1) + pre.get(j));
            pre = cur;
            ans.add(cur);
        }
        return ans;
    }
}
