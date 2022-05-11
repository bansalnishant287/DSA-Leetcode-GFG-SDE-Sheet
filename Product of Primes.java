/*
Link: "https://practice.geeksforgeeks.org/problems/product-of-primes5328/1"
Product of Primes
Medium
Given two numbers L and R (inclusive) find the product of primes within this range. Print the product modulo 109+7. If there are no primes in that range you must print 1.

Example 1:

Input: L = 1, R = 10
Output: 210
Explaination: The prime numbers are 2, 3, 5 and 7
*/
class Solution{
    static long primeProduct(long L, long R){
        if(R == 1) return 0;
        else if(R == 2) return 2;
        long ans = 1, mod = 1000000007;
        if(L < 3) ans = 2;
        if(L%2 == 0) L++;
        while(L <= R){
            if(isPrime(L)) ans = (ans * L) % mod;
            L += 2;
        }
        return ans;
    }
    static boolean isPrime(long n){
        for(long i=3; i <= (n/i); i += 2){
            if(n%i == 0) return false;
        }
        return true; 
    }
}
