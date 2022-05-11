/*
Link: "https://practice.geeksforgeeks.org/problems/largest-number-with-given-sum-1587115620/1#"
Largest number with given sum 
Easy 
Geek lost the password of his super locker. He remembers the number of digits N as well as the sum S of all the digits of his password.
He know that his password is the largest number of N digits that can be made with given sum S. As he is busy doing his homework, help him retrieving his password.

Example 1:

Input:
  N = 5, S = 12
Output: 
  93000
Explanation:
Sum of elements is 12. Largest possible 5 digit number is 93000 with sum 12.
*/
class Solution
{
    //Function to return the largest possible number of n digits
    //with sum equal to given sum.
    static String largestNumber(int n, int sum)
    {
        if(sum <= (9*n)){
            String ans = "";
            while(sum > 0){
                int i = Math.min(sum,9);
                ans += i;
                sum -= i;
            }
            while(n > ans.length()) ans += 0;
            return ans;
        }
        return "-1";
    }
}
