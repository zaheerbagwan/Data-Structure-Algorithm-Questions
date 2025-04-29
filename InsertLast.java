public class InsertLast  
{
        private ListNode head;
        private ListNode tail;
        private int length;
        
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

                public InsertLast()
                {
                    this.head=null;
                    this.tail=null;
                    this.length=0;
                }

        public int length()
        {
            return length;
        }        
        
        public void InsertAtLast(int value)
        {
            ListNode newNode = new ListNode(value);

            if(head==null)
            {
                tail=newNode;
                head=newNode;
                return;
            }
            else
            {
                tail.next= newNode;
                newNode.previous=tail;
            }
            tail=newNode;
            length++;
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

        
        InsertLast il = new InsertLast();
        il.InsertAtLast(10);
        il.InsertAtLast(20);
        il.InsertAtLast(30);
        il.InsertAtLast(40);
        il.InsertAtLast(50);

        il.displayForward();
        System.out.println();
        il.displayBackward();

        }
}
