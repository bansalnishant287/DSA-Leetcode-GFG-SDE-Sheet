/*
Find Length of Loop
Easy
Given a linked list of size N. The task is to complete the function countNodesinLoop() that checks whether a given Linked List contains a loop or not and if the loop is present then return the count of nodes in a loop or else return 0. C is the position of the node to which the last node is connected. If it is 0 then no loop.

Example 1:

Input:
N = 10
value[]={25,14,19,33,10,21,39,90,58,45}
C = 4
Output: 7
Explanation: The loop is 45->33. Solength of loop is 33->10->21->39->90->58->45 = 7. 
The number 33 is connected to the last node to form theloop because according to the input the 4th node from the beginning (1 based index) will be connected to the last node for the loop.
*/

class Solution
{
    //Function to find the length of a loop in the linked list.
    static int countNodesinLoop(Node head)
    {
        Node slow = head, fast = head;
        while (slow != null && fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
 
            if (slow == fast)
                return countNodes(slow);
        }
        return 0;
    }
    
    static int countNodes( Node n){      
        int res = 1;
        Node temp = n;
        while (temp.next != n){ //counting length of loop
            res++;
            temp = temp.next;
        }
        return res;
    }
}
