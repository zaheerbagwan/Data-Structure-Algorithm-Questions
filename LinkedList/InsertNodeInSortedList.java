public class InsertNodeInSortedList {

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


    public void InsertNode(int Value)
    {
        ListNode current=head;
        ListNode newNode = new ListNode(Value);

        if(newNode.data>head.data)
        {
            newNode.next=head;
            head=newNode;
            return;
        }

        while(newNode.data>current.next.data && current.next!=null) 
        {
            current=current.next;
        }
            newNode.next=current.next;
            current.next=newNode;
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

    public static void main(String[] args) {
    
    InsertNodeInSortedList in = new InsertNodeInSortedList();

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

    in.display(head);
    in.InsertNode(25);
    in.display(head);
    }

}