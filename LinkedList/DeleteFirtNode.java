public class DeleteFirtNode 
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

        public void DeletePower()
        {
            ListNode current=head;
            head=current.next;
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
            
            DeleteFirtNode df = new DeleteFirtNode();

            df.InsertingLast(10);
            df.InsertingLast(20);
            df.InsertingLast(30);
            df.InsertingLast(40);
            df.InsertingLast(50);

            df.DeletePower();
            df.display();

            
        }


}