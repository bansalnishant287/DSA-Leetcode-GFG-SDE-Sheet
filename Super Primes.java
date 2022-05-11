/*
Link: "https://practice.geeksforgeeks.org/problems/super-primes2443/1"
Super Primes
Medium

A prime number is Super Prime if it is a sum of two primes. Find all the Super Primes upto N

Example 1:

Input:
N = 5
Output: 1
Explanation: 5 = 2 + 3, 5 is the only super prime
*/

class Solution {
    int superPrimes(int n) {
        if(n < 5) return 0;
        int count = 0;
        Set<Integer> set = new HashSet<>();
        set.add(3);
        for(int i = 5; i <= n; i += 2){
            if(isPrime(i)){
              set.add(i);
              if(set.contains(i-2)) count++;
            } 
        }
        return count;
    }
    static boolean isPrime(int n){
        for(int i=3; i <= (n/i); i += 2){
            if(n%i == 0) return false;
        }
        return true; 
    }
}
