/*
Link: "https://leetcode.com/problems/valid-anagram/"
242. Valid Anagram
     Easy
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.     
*/

class Solution {
    public boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;
        char[] str1 = a.toCharArray();
        char[] str2 = b.toCharArray();
        int[] count = new int[256];
        for(int i = 0; i < str1.length; i++){
            count[str1[i] - 'a']++;
            count[str2[i] - 'a']--;
        }
        for(int i = 0; i < 256; i++)
            if (count[i] != 0) return false;
        return true;
    }
}

/*
    if (a.length() != b.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            if (map.containsKey(a.charAt(i))) { 
                map.put(a.charAt(i), map.get(a.charAt(i)) + 1);
            }
            else {
                map.put(a.charAt(i), 1);
            }
        }
        for (int i = 0; i < b.length(); i++) {
            if (map.containsKey(b.charAt(i))) {
                map.put(b.charAt(i), map.get(b.charAt(i)) - 1);
            }
        }
        Set<Character> keys = map.keySet();
        for (Character key : keys) {
            if (map.get(key) != 0) {
                return false;
            }
        }
        return true;
*/
