/*
509. Fibonacci Number
     Easy
     The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
     Given n, calculate F(n).
    F(0) = 0, F(1) = 1
    F(n) = F(n - 1) + F(n - 2), for n > 1.
*/
class Solution {
    public int fib(int n) {
        if(n==0) return 0;
        else if(n==1) return 1;
        else{
            int[] f = new int[n+1];
            f[0] = 0; f[1] = 1;
            for(int i=2; i<=n; i++)
                f[i] = f[i-1] + f[i-2];
            return f[n];
        }
    }
}
