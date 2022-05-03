/*
Link: "https://leetcode.com/problems/climbing-stairs/"
70. Climbing Stairs
    Easy
    You are climbing a staircase. It takes n steps to reach the top.
    Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
*/
class Solution {
    public int climbStairs(int n) {
        if(n<4) return n;
        int[] cs = new int[n];
        cs[0] = 1; cs[1] = 2; cs[2] = 3;
        for(int i=3; i<n; i++){
            cs[i] = cs[i-1] + cs[i-2];
        }
        return cs[n-1];
    }
}
// Based on fibonacci, tribonacci numbers approach
