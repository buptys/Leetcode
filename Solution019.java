package LeetCode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution019 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int N=0;
        ListNode start =new ListNode(0);
    	ListNode find =start;
    	ListNode root =head;
    	start.next=head;
    	while(root!=null){
    		root=root.next;
    		N++;
    	}
    	for(int i=0;i<N-n;i++){
    		find=find.next;
    	}
        find.next=find.next.next;
    	
        return start.next;
    }
}

