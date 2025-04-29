public class InsertAtBegining 
{
    private static ListNode head;
    private static ListNode tail;
    private static int length;
        
        private class ListNode
        {
            private int data;
            private ListNode next;
            private ListNode previous;

            public ListNode(int data)
            {
                this.data=data;
        
            }

        }

        InsertAtBegining()
        {
            this.head=null;
            this.tail=null;
            this.length=0;
        }

        public void insertAtBeginner(int value)
        {
            ListNode newNode = new ListNode(value);
            if(head==null)
            {
                tail=newNode;
            }
            else
            {
                head.previous=newNode;
            }

            newNode.next=head;
            head=newNode;
            length++;
        }

        public int length()
        {
            return length;
        }

        public void displayForward()
        {
            ListNode current=head;


            System.out.println("Next Wale Node:- ");
            while (current!=null) 
            {
                System.out.print(current.data+" ---> ");
                current=current.next;    
            }

            System.out.print("null");
        }

        public void displayBackward()
        {
            ListNode current=tail;
            System.out.println("Pevious Wale Node:- ");
            while (current!=null) 
            {
                System.out.print(current.data+" ---> ");
                current=current.previous;    
            }

            System.out.print("null");
        }

        public static void main(String[] args) {
            
            InsertAtBegining ig = new InsertAtBegining();
            ig.insertAtBeginner(10);
            ig.insertAtBeginner(20);
            ig.insertAtBeginner(30);
            ig.insertAtBeginner(40);

            ig.displayForward();
            System.out.println();
            ig.displayBackward();

        }


}
