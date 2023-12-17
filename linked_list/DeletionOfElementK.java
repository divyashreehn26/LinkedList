package linked_list;

public class DeletionOfElementK {

	public static void main(String[] args) {
		int arr[]= {2,4,5,6,7,8};
		int n=6;
		Node head=null;
		for(int i=0;i<n;i++)
		{
			int data=arr[i];
			head=addElements(head,data);
		}
		System.out.println("After insertion : ");
		printElements(head);
		
		head=deleteElementK(head,1);
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
	
	public static Node deleteElementK(Node head,int target)
	{
		if(head==null)
			return head;
		else
		{
			Node previous=null;
			Node temp=head;
			while(temp!=null)
			{
				if(temp.data==target)
				{
					previous.next=previous.next.next;
				}
				previous=temp;
				temp=temp.next;
					
			}
		}
		return head;
	}

}
