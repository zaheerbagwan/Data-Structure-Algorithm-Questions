public class InsertAtLast 
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


        public void InsertingLast(int Value)
        {
            ListNode newNode = new ListNode(Value);

            if (head==null) 
            {
                head=newNode;
                return;    
            }

            ListNode current=head;

            while(current.next!=null) 
            {
                current=current.next;    
            }

            current.next=newNode;

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


        public static void main(String[] args) {
            
            InsertAtLast il = new InsertAtLast();

            il.InsertingLast(10);
            il.InsertingLast(20);
            il.InsertingLast(30);
            il.InsertingLast(40);
            il.InsertingLast(50);

            il.display();
        }

}
