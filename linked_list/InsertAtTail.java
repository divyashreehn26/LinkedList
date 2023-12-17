package linked_list;

public class InsertAtTail {

	public static void main(String[] args) {
		int arr[]= {3,6,8,0,2,12};
		int n=6;
		Node head=null;
		for(int i=0;i<n;i++)
		{
			head=addElements(head,arr[i]);
		}
		
		System.out.print("Before insertion : ");
		printElements(head);
		
		System.out.println("After insertion : ");
		head=insertAtTail(head,-1);
		printElements(head);
		

	}
	
	public static Node addElements(Node head,int data)
	{
		if(head==null)
			head=new Node(data);
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
	
	public static Node insertAtTail(Node head,int data)
	{
		if(head==null)
			return new Node(data);
		Node temp=new Node(data,null);
		Node temp2=head;
		while(temp2.next!=null)
		{
			temp2=temp2.next;
		}
		temp2.next=temp;
		return head;
		
	}

}
