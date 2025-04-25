public class FindStartOfLoop 
{
    private ListNode head;

    public class ListNode
    {
        private int data;
        private ListNode next;

        public ListNode(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    public void CreateLoop()
    {
        ListNode newNode = new ListNode(10);
        ListNode second = new ListNode(20);

        ListNode third = new ListNode(30);

        ListNode fourth = new ListNode(40);

        ListNode fifth = new ListNode(50);

        ListNode sixth = new ListNode(60);


        head=newNode;
        newNode.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=sixth;
        sixth.next=third;

    }

    public ListNode LoopStartPointFinder()
    {
        ListNode Fastptr=head;
        ListNode Slowptr=head;

        while(Fastptr!=null && Fastptr.next!=null)
        {
            Fastptr=Fastptr.next.next;
            Slowptr=Slowptr.next;

            if(Fastptr==Slowptr)
            {
                return getCheckThis(Slowptr);
            }
        }
        return null;
    } 

    public ListNode getCheckThis(ListNode Slowptr)
    {
        ListNode temp=head;

        while(temp!=Slowptr)
        {
            Slowptr=Slowptr.next;
            temp=temp.next;
        }

        return temp;
    }
    
    public static void main(String[] args)  {
        
    FindStartOfLoop fs = new FindStartOfLoop();
    fs.CreateLoop();
    System.out.println(fs.LoopStartPointFinder().data);

    }
}
