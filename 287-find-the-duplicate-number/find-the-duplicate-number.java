public class Node{
    int val;
    Node next;
    Node(int a){
        val=a;
        next=null;  
    }
}
class Solution {
    public int findDuplicate(int[] nums) {
        Node[] node=new Node[nums.length];

        for(int i=0;i<nums.length;i++){
            node[i]=new Node(i);
        }

        for(int i=0;i<nums.length;i++){
            node[i].next=node[nums[i]];
        }

        Node slow=node[0];
        Node fast = node[0];

        do{
            slow=slow.next;
            fast=fast.next.next;
        }while(slow!=fast);

        slow=node[0];
        while(slow != fast){
            slow= slow.next;
            fast=fast.next;

        }
        return slow.val;

    }
}