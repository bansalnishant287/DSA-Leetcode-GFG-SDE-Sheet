/*
Link: "https://leetcode.com/problems/valid-parentheses/"
20. Valid Parantheses
    Easy
    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
 

Example 1:

Input: s = "()"
Output: true
*/
class Solution {
    public boolean isValid(String s) {
        char[] a = s.toCharArray();
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(a[i] == '(' || a[i] == '{' || a[i] == '[')
                st.push(a[i]);
            else if(st.empty() || (a[i] == ']' && st.peek() != '[') || (a[i] == '}' && st.peek() != '{') || (a[i] == ')' && st.peek() != '('))
                return false;
            else st.pop();
        }
        if(!st.empty()) return false;
        return true;
    }
}
