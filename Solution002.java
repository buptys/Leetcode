package LeetCode;

/*
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class Solution002 {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head =new ListNode(0);
        ListNode pre =head;
        int carry =0;
        while(l1!=null || l2!=null||carry!=0){
            ListNode res =new ListNode(0);
            
           int sum=0;
           
           sum=((l1==null)?0:l1.val)+((l2==null)?0:l2.val)+carry;
           carry=sum/10;
           res.val=sum%10;
           pre.next=res;
           pre=pre.next;
           
           l1=l1==null?null:l1.next;
           l2=l2==null?null:l2.next;
        }

        
        return head.next;
    }

}
