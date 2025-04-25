public class RemoveLoop
{

    public ListNode head;

    public class ListNode
    {
        private int data;
        private ListNode next;

        public ListNode(int data)
        {
            this.next=null;
            this.data=data;
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

    public void display()
    {
        ListNode current=head;

        while(current!=null)
        {
            System.out.print(current.data+" ---> ");
            current=current.next;
        }

        System.out.print("null");
    }

    public ListNode LoopFinder()
    {
        ListNode Fastptr=head;
        ListNode Slowptr=head;

        while(Fastptr!=null && Fastptr.next!=null)
        {
            Fastptr=Fastptr.next.next;
            Slowptr=Slowptr.next;

            if(Fastptr==Slowptr)
            {
                return LoopRemover(Slowptr);
            }
        }
        return null;
    }

    public ListNode LoopRemover(ListNode Slowptr)
    {
        ListNode temp=head;

        while(temp.next!=Slowptr.next)
        {
            temp=temp.next;
            Slowptr=Slowptr.next;
        }

        return Slowptr.next=null;
    }

    public static void main(String []args)  {

    RemoveLoop rl = new RemoveLoop();
    rl.CreateLoop();
    rl.LoopFinder();
    rl.display();
    }
}
