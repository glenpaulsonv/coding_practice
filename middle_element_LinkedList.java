//middle element of a linked list

class Solution
{
    int getMiddle(Node head)
    {
         // Your code here.
         Node slow_ptr = head;
         Node fast_ptr = head;
         
         while(fast_ptr!=null && fast_ptr.next!=null)
         {
             fast_ptr=fast_ptr.next.next;
             slow_ptr=slow_ptr.next;
         }
         return slow_ptr.data;
    }
}