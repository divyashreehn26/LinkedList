package linked_list;

public class InsertAtPositionK {

	public static void main(String[] args) {
		int arr[]= {2,4,6,7,9};
		int n=5;
		Node head=null;
		for(int i=0;i<n;i++)
		{
			head=addElements(head,arr[i]);
		}
		
		System.out.println("Before insertion :");
		printElements(head);
		
		System.out.println("After insertion :");
		insertAtKthPsition(head,3,-1);
		printElements(head);
	}
	
	public static Node addElements(Node head,int data)
	{
		if(head==null)
			return new Node(data);
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=new Node(data);
		}
		return head;
	}
	
	public static void printElements(Node head)
	{
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head=head.next;
		}
		System.out.println();
	}
	
	public static Node insertAtKthPsition(Node head,int pos,int data)
	{
		if(pos==0)
		{
			Node temp=new Node(data);
			temp.next=head;
			return temp;
		}
		int count=0;
		Node temp=head;
		while(temp.next!=null)
		{
			if(count==(pos-1))
			{
				Node temp2=new Node(data);
				temp2.next=temp.next;
				temp.next=temp2;
				break;
			}
			temp=temp.next;
			count++;
		}
		return head;
	}

}
