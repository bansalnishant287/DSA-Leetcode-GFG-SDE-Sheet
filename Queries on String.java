/*
Link: "https://practice.geeksforgeeks.org/problems/queries-on-strings5636/1"
Queries on String
Medium
Given a string str you have to answer several queries on that string. In each query you will be provided two values L and R and you have to find the number of distinct characters in the sub string from index L to index R (inclusive) of the original string.
 
Example 1:

Input: str = "abcbaed",
Query = {{1,4},{2,4},{1,7}}
Output: {3,2,5}
Explanation: For the first query distinct characters from [1, 4] are a, b and c.
For the second query distinct characters from [2, 4] are b and c.For the third query distinct characters from [1, 7] are a, b, c, d and e.
*/

class Solution
{
    public int[] SolveQueris(String str, int[][] Query){
        int n = Query.length;
        int[] output = new int[n];
        for(int i=0; i<n; i++){
            output[i] = count(str, Query[i][0], Query[i][1]);
        }
        return output;
    }
    
    static int count(String str, int i, int j){
        HashSet<Character> hs = new HashSet<Character>();
        for(int k=i-1; k<j; k++){
            hs.add(str.charAt(k));
        }
        return hs.size();
    }
}
