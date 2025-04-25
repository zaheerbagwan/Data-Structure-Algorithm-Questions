class DetectLoop
{
    private ListNode head;

    public class ListNode
    {
        private int data;
        private ListNode next;

        ListNode (int data)
        {
            this.data=data;
            this.next=null;
        }

    }

        public void CreateLoopNode()
        {
            ListNode newNode= new ListNode(10);
            ListNode second= new ListNode(20);
            ListNode third= new ListNode(30);
            ListNode fourth= new ListNode(40);
            ListNode fifth= new ListNode(50);
            ListNode sixth= new ListNode(60);
            
            head=newNode;
            newNode.next=second;
            second.next=third;
            third.next=fourth;
            fourth.next=fifth;
            fifth.next=sixth;
            sixth.next=third;

        }

        public boolean CheckLoop()
        {
            ListNode Fastptr=head;
            ListNode slowptr=head;


            while(Fastptr!=null && Fastptr.next!=null)
            {
                Fastptr=Fastptr.next.next;
                slowptr=slowptr.next;

                if(Fastptr.data==slowptr.data)
                {
                    return true;
                }
            }
            return false;
        }


        public static void main(String []args)      {

            DetectLoop dl = new DetectLoop();
            dl.CreateLoopNode();
            System.out.println(dl.CheckLoop());
        }
    }