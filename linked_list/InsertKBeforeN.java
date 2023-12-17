package linked_list;

public class InsertKBeforeN {

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
		head=insertKBeforeN(head,-1,2);
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
	
	public static Node insertKBeforeN(Node head,int data,int n)
	{
		if(head.data==n)
		{
			Node temp=new Node(data);
			temp.next=head;
			return temp;
		}
		Node previous=null;
		Node temp=head;
		while(temp!=null)
		{
			if(temp.data==n)
			{
				Node temp2=new Node(data,temp);
				previous.next=temp2;
				temp2.next=temp;
				break;
			}
			previous=temp;
			temp=temp.next;
		}
		return head;
	}

}
