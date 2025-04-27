public class MergeTwoSortedList 
{
    private static ListNode head;
    
    private static class  ListNode 
    {
            private int data;
            ListNode next=null;
            public ListNode(int data)
            {
                this.data=data;
                this.next=null;
            }
        
    }

    public ListNode SortedMixer(ListNode a, ListNode b)
    {
        ListNode dummy = new ListNode(0);
        ListNode tail=dummy;
        
        while (a!=null && b!=null) 
        {
            if (a.data<=b.data) 
            {
                tail.next=a;
                a=a.next;    
            }
            else
            {
                tail.next=b;
                b=b.next;
            }
            tail=tail.next;
        }

        if(a==null)
        {
            tail.next=b;
        }
        else
        {
            tail.next=a;
        }
        return dummy.next;

    }

    public void display()
    {
        ListNode current =head;
        
        while (current!=null) 
        {
            System.out.print(current.data+" ---> "); 
            current=current.next;   
        }
        System.out.print("null");

    }




    public static void main(String[] args) {
        
    MergeTwoSortedList mts = new MergeTwoSortedList();

    ListNode a =new ListNode(10);
    ListNode a2 =new ListNode(40);
    ListNode a3 =new ListNode(60);
   
        head=a;
        a.next=a2;
        a2.next=a3;

       mts.display(); 
       System.out.println();
        ListNode b =new ListNode(20);
        ListNode b2 =new ListNode(30);
        ListNode b3 =new ListNode(50); 
        
        b.next=b2;
        b2.next=b3;
 
        ListNode result=mts.SortedMixer(a, b);

        mts.display();


    }
}
