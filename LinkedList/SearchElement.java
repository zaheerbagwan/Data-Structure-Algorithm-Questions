public class SearchElement 
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
    
    
    public boolean FindElement(int value)
    {
        ListNode current=head;

        while(current!=null)
        {
            if(current.data==value)
            {
                return true;
            }
            current=current.next;
        }
        return false;
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



    public static void main(String []args)  {

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

        SearchElement se = new SearchElement();
        se.display();
        int value=100;
        boolean result=se.FindElement(value);

        System.out.println(value+" is Exist in Node : "+result);
        
        
    }
}
