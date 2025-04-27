

public class MergeTwoSortedListMethod2 
{
        private static ListNode head;

        private static class ListNode
        {
            private int data;
            private ListNode next;

            public ListNode(int data)
            {
                this.data=data;
                this.next=null;
            }
        }

        public ListNode Merger(ListNode a, ListNode b)
        {
            ListNode dummy = new ListNode(0);
            ListNode tail=dummy;

            while (a!=null && b!=null) 
            {
                if(a.data<=b.data)
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

        public void display(ListNode head)
        {
            ListNode current=head;

            while (current!=null) 
            {
                System.out.print(current.data+" ---> ");
                current=current.next;    
            }
            System.out.println("null");
        }
       
        public static void main(String[] args) {
            
            MergeTwoSortedListMethod2 m2 = new MergeTwoSortedListMethod2();

            ListNode a1 = new ListNode(10);
            ListNode a2 = new ListNode(30);
            ListNode a3 = new ListNode(60);

            ListNode head=a1;
            a1.next=a2;
            a2.next=a3;

            ListNode b1 = new ListNode(20);
            ListNode b2 = new ListNode(40);
            ListNode b3 = new ListNode(50);

            b1.next=b2;
            b2.next=b3;

            m2.display(head);

            ListNode result=m2.Merger(head, b1);
            m2.display(result);
        }
        
}
