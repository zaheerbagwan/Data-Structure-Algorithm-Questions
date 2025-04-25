import java.util.NoSuchElementException;

public class FindMiddleElement 
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

    public int MiddleElement()
    {
        
        if(head==null)
        {
            throw new NoSuchElementException();
        }

        ListNode Fastptr=head;
        ListNode Slowptr=head;

        while(Fastptr!=null && Fastptr.next!=null) 
        {
            Fastptr=Fastptr.next.next;
            Slowptr=Slowptr.next;
        }

        return Slowptr.data;
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


    public static void main(String []args)      {

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

         FindMiddleElement fm = new FindMiddleElement();
         fm.display();
         int result=fm.MiddleElement();


            System.out.println("Middle Element : "+result);

        }   
}