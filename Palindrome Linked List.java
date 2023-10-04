// Problem link - https://leetcode.com/problems/palindrome-linked-list/

class Solution {
    public boolean isPalindrome(ListNode head){

      // find the middle of linked list
      
        ListNode fast = head,slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

      // reverse second half of linked list. fast and slow ptrs are the head of the two list
        slow = reverseList(slow);
        fast = head;
     // Compare the two list 
      
        while(slow != null){
            if(fast.val != slow.val){
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }

    public ListNode reverseList(ListNode head){
        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
