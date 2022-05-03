/*
Link: "https://leetcode.com/problems/container-with-most-water/"
11. Container with Most Water
    Medium
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
Find two lines that together with the x-axis form a container, such that the container contains the most water.
Return the maximum amount of water a container can store.
Notice that you may not slant the container.
*/
class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i = 0;
        int j = n-1;
        int max = 0;
        while(i < j){
            max = Math.max(max, Math.min(height[i],height[j]) * (j-i));
            if(height[i] < height[j]) i++;
            else j--;
        }
        return max;
    }
}
