class RemoveDuplicatesFromSorted
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

    public void RemoveDuplicates()
    {
        ListNode current=head;
        if(head==null)
        {
            return;
        }


        while (current!=null && current.next!=null) 
        {
            if(current.data==current.next.data)
             {
                current.next=current.next.next;
            }
            else
            {
                current=current.next;
            }    
        }
        
    }

    public void display()
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
        
        RemoveDuplicatesFromSorted rd = new RemoveDuplicatesFromSorted();
        
    
            ListNode newNode = new ListNode(10);
            ListNode second = new ListNode(20);
            ListNode third = new ListNode(20);
            ListNode fourth = new ListNode(30);
            ListNode fifth = new ListNode(40);
            ListNode sixth = new ListNode(50);
            ListNode seventh = new ListNode(50);
    
            head=newNode;
            head.next=second;
            second.next=third;
            third.next=fourth;
            fourth.next=fifth;
            fifth.next=sixth;
            sixth.next=seventh;

            rd.display();
            rd.RemoveDuplicates();
            rd.display();


        }
}