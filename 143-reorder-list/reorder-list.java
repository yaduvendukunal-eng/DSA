/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;
        Stack<ListNode>stack= new Stack<>();
        ListNode temp=head;
        int count =0;
        while(temp!=null){
            stack.push(temp);
            temp=temp.next;
        }
        int size=0;
        if((stack.size())%2 != 0){
            size=stack.size()/2;
        }
        else{
            size=(stack.size()/2)+1;
        }
        temp=head;
        ListNode temp2;
        while(count<size){
            temp2=stack.pop();
            temp2.next=temp.next;
            temp.next=temp2;
            temp=temp.next.next;
            count++;
        }
        temp.next=null;
    }
}