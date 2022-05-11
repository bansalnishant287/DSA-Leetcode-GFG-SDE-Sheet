/*
Partition a number into two divisible parts
Medium

Given a number (as string) and two integers a and b, divide the string in two non-empty parts such that the first part is divisible by a and the second part is divisible by b. In case multiple answers exist, return the string such that the first non-empty part has minimum length.

Example 1:

Input:
1200 4 3
Output:
12 00
Explanation:
12 is divisible by 4, and
00 is divisible by 3.
*/

class Solution{
    static String stringPartition(String S, int a, int b){
        // code here
        int n = S.length();
        for(int i=1; i<n; i++){
            int a1 = Integer.valueOf(S.substring(0,i)); 
            int b1 = Integer.valueOf(S.substring(i,n));
            if(a1%a == 0 && b1%b == 0)
                return S.substring(0,i)+" "+S.substring(i,n);
        }      
        return "-1";
    }
}
