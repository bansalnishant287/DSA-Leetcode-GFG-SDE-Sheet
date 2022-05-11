/*
Killing Spree
Medium
There are Infinite People Standing in a row, indexed from 1.
A person having index 'i' has strength of (i*i).
You have Strength 'P'. You need to tell what is the maximum number of People You can Kill With your Strength P.
You can only Kill a person with strength 'X' if P >= 'X'  and after killing him, Your Strength decreases by 'X'. 
 

Example 1:

Input:
N = 14
Output: 3
Explanation:
The strengths of people is 1, 4, 9, 16, .... 
and so on. WE can kill the first 3 person , 
after which our Power becomes 0 and we cant 
kill anyone else. So answer is 3
*/

class Solution{
    
    long killinSpree(long n)
    {
        if(n==1) return 1;
        long i=1;
        while(i<=n/i){
            n -= (i*i); 
            i++;
        }
        return i-1;
    }
}
