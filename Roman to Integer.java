/*
Link: "https://leetcode.com/problems/roman-to-integer/"
13. Roman to Integer
    Easy
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.
*/
class Solution {
    public int romanToInt(String s) {
        int n = s.length();
        int no = 0;
        for(int i=0; i<n; i++){
            switch (s.charAt(i)){
                case 'I':
                    if(i < n-1 && (s.charAt(i+1) == 'V' || s.charAt(i+1) == 'X'))
                        no --;
                    else no++;
                    continue;
                    
                case 'V':
                    no += 5;
                    continue;
                    
                case 'X':
                    if(i < n-1 && (s.charAt(i+1) == 'L' || s.charAt(i+1) == 'C'))
                        no -= 10;
                    else no += 10;
                    continue;
                
                case 'L':
                    no += 50;
                    continue;
                    
                case 'C':
                    if(i < n-1 && (s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M'))
                        no -= 100;
                    else no += 100;
                    continue;
                    
                case 'D':
                    no += 500;
                    continue;
                    
                default:
                    no += 1000;
            }
        }
        return no;
    }
}
