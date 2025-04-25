public class InsertAtBeginning 
{
    private static ListNode head;

    private static class ListNode
    {
        private int data;
        private ListNode next;

        public ListNode(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    public void display()
    {
        ListNode current=head;

        while (current!=null) 
        {
            System.out.print(current.data+" ");    
            current=current.next;
        }

        System.out.println();
    }

    public void InsertFirst(int Value)
    {
        ListNode newNode = new ListNode(Value);
        
        newNode.next=head;
        head=newNode;
        
    }

    public static void main(String[] args)
    {
        InsertAtBeginning ib = new InsertAtBeginning();
        ib.InsertFirst(10);
        ib.InsertFirst(20);
        ib.InsertFirst(30);
        ib.InsertFirst(40);
        ib.InsertFirst(50);

        ib.display();

    }
}
