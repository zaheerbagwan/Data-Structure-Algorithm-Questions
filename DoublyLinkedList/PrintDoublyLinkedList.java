class PrintDoublyLinkedList
{
    private static ListNode head;
    private static ListNode tail;
    //private static int length;

            private static class ListNode
            {
                private int data;
                private ListNode next;
                private ListNode previous;

                public ListNode(int data)
                {
                    this.data=data;
                }
            }
        public PrintDoublyLinkedList()
        {
            this.head=null;
            this.tail=null;
           //this.length=0;
    
        }

        public void displayForward()
        {
            if(head==null) return;
            ListNode current=head;

            while (current!=null) 
            {
                System.out.print(current.data+" ---> ");
                current=current.next;    
            }

            System.out.print("null");
        }
        
        public void displayBackward()
        {
            if(tail==null) return;
            ListNode current=tail;

            while (current!=null) 
            {
                System.out.print(current.data+" ---> ");
                current=current.previous;    
            }

            System.out.print("null");
        }

        public static void main(String[] args) {
            
            PrintDoublyLinkedList pdl = new PrintDoublyLinkedList();
            ListNode newNode = new ListNode(10);
            ListNode second = new ListNode(20);
            ListNode third = new ListNode(30);
            ListNode fourth = new ListNode(40);

             head=newNode;
             newNode.next=second;
             second.next=third;
             third.next=fourth;

             pdl.displayForward();
             System.out.println();
             pdl.displayBackward();

        }
            
}