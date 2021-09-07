//inserting in a sorted linked list
class Solution {
    Node sortedInsert(Node head1, int key) {
        // Add your code here.
        Node curr = new Node(key);
        if(head1==null)
            return curr;
        else if(head1.data>=curr.data)
        {
            curr.next=head1;
            head1=curr;
        }
        else
        {
            Node present=head1;
            while(present.next!=null && present.next.data<curr.data)
            {
                present=present.next;
                
            
            }
            curr.next = present.next;
            present.next = curr;
        }
        return head1;
        
    }
}