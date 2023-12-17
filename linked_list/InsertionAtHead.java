package linked_list;

public class InsertionAtHead {

	public static void main(String[] args) {
		int arr[]= {2,4,0,6,8,9};
		Node head=null;
		int n=6;
		for(int i=0;i<n;i++)
		{
			head=addElements(head,arr[i]);
		}
		System.out.println("Before insertion : ");
		printElements(head);
		System.out.println("After insertion : ");
		head=insertAtHead(head,-1);
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
	
	public static Node insertAtHead(Node head,int data)
	{
		Node temp=new Node(data,head);
		return temp;
	}

}
