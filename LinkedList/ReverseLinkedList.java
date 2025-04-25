public class ReverseLinkedList 
{
    private static ListNode head;
        
    private static class ListNode 
    {
        private int data;
        public ListNode next;

        public ListNode(int data)
        {
            this.data=data;
            this.next=null;
        }
        
    }

    public ListNode ReverseList()
    {
        ListNode current = head;

        ListNode next=null;
        ListNode previous=null;
        while (current!=null) 
        {
            next = current.next;
            current.next=previous;
            previous=current;
            current=next;

        }

        return previous;
    }

        public void display(ListNode head)
        {
            ListNode current=head;

             while (current!=null) 
            {
                System.out.print(current.data+" ---> ");    
                current=current.next;
            }
            
            System.out.println("null");
            System.out.println();
        }


        public static void main(String []args)  {

            ListNode newNode = new ListNode(10);
            ListNode second = new ListNode(20);
            ListNode third = new ListNode(30);
            ListNode fourth = new ListNode(40);
            ListNode fifth = new ListNode(50);
    
            head=newNode;
            head.next=second;
            second.next=third;
            third.next=fourth;
            fourth.next=fifth;

            ReverseLinkedList rl = new ReverseLinkedList();
            rl.display(head);
            ListNode result=rl.ReverseList();
            rl.display(result);
        }
}
