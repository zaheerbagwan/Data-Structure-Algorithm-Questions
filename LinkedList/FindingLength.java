class FindingLength
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


    public static int ReturnLength(ListNode node)
    {
        ListNode current =head;
        int count=0;
        while (current!=null) 
        {
            current=current.next;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        
        FindingLength fl = new FindingLength();

        ListNode node = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);
        ListNode fifth = new ListNode(50);
        head=node;
        node.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        
        fl.display();
        int result =FindingLength.ReturnLength(node);

        System.out.println("The Length is : "+result);

    }

}