/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
       HashMap<Node,Node> map=new HashMap<>();


       Node temp=head;
       Node copy=new Node(0);
       Node dummy=copy;

       while(temp!=null){
        Node newnode= new Node(temp.val) ;
        map.put(temp,newnode);
        copy.next=newnode;
        copy = newnode;
        temp=temp.next;
       }
       temp=head;
       Node start = dummy.next;
       while(temp!=null){
            if(temp.random!=null){
            start.random=map.get(temp.random);
            }
            else{
                start.random=null;
            }
            temp=temp.next;
            start=start.next;
       }
       return dummy.next;


    }
}