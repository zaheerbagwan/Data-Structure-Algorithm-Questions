public class FindingNthNodeFromLast 
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

    public int PointFinder(int n)
    {
        ListNode current=head;

        ListNode refPointer=current;
        ListNode mainPointer=current;

        int count=0;
        while(count<n)
        {
            refPointer=refPointer.next;
            count++;
        }

        while(refPointer!=null)
        {
            refPointer=refPointer.next;
            mainPointer=mainPointer.next;
        }

        return mainPointer.data;

    }
    
    public static void main(String[] args) {
        
        FindingNthNodeFromLast ff = new FindingNthNodeFromLast();
        
    
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

            int n=2;
            int result=ff.PointFinder(n);

            System.out.println(result);

            }

}
