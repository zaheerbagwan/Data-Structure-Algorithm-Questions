public class InsertingAtGivenPosition 
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

        public void process(int node, int position)
        {
            ListNode newNode = new ListNode(node);

            if(position==1)
            {
                newNode.next=head;
                head=newNode;
                return;
            }
            ListNode current=head;
            int count=1;
            while(count<position-1) 
            {
                current=current.next;
                count++;    
            }

            ListNode temp=current.next;
            current.next=newNode;
            newNode.next=temp;

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

        public static void main(String[] args) {
            
            InsertingAtGivenPosition il = new InsertingAtGivenPosition();

            il.InsertingLast(10);
            il.InsertingLast(20);
            il.InsertingLast(30);
            il.InsertingLast(40);
            il.InsertingLast(50);

            System.out.print("Original Node: ");
            il.display();
            il.process(5, 1);
            il.display();
            il.process(25, 3);
            il.display();
        }


}
