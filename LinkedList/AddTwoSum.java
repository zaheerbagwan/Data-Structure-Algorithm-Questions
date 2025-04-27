class AddTwoSum
{
	private ListNode head;

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

	public void display(ListNode result)
	{
		ListNode current=result;
		
		while(current!=null)
		{
			System.out.print(current.data+" ---> ");
			current=current.next;
		}
		System.out.print("null");
	}

	public ListNode ReturnSum(ListNode a1,ListNode b1)
	{
		ListNode dummy = new ListNode(0);
		ListNode tail=dummy;

		int carry=0;
		
		while(a1!=null || b1!=null)
		{
			int x=(a1!=null)? a1.data:0;
			int y=(b1!=null)? b1.data:0;

			int sum=carry+x+y; 

			carry=sum/10;
			tail.next=new ListNode(sum%10);

			if(a1!=null) a1=a1.next;
			if(b1!=null) b1=b1.next;
			tail=tail.next;
		}
        if(carry>0) tail.next=new ListNode(carry);  

        return dummy.next;
	}

	public static void main(String []args)	{

	AddTwoSum ad = new AddTwoSum();
	ListNode a1 = new ListNode(1);
	ListNode a2 = new ListNode(3);
	ListNode a3 = new ListNode(5); 
    
    ListNode head=a1;
	a1.next=a2;
	a2.next=a3;
	
	ad.display(head);
    System.out.println();

	ListNode b1 = new ListNode(2);
	ListNode b2 = new ListNode(4);
	
	b1.next=b2;
	ListNode result=ad.ReturnSum(a1,b1);
	
	ad.display(result);
	
    }
}