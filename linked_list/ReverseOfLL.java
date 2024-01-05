package linked_list;

public class ReverseOfLL {

	public static void main(String[] args) {
		int arr[]= {2,4,6,7,9};
		Node head=null;
		for(int i=0;i<arr.length;i++)
		{
			head=addElements(head,arr[i]);		
		}
		printElements(head);
		System.out.println("After reverse :");
		head=reverseLL(head);
		printElements(head);

	}

	public static Node addElements(Node head, int i) 
	{
		if(head==null)
			head=new Node(i);
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=new Node(i);
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
	
	public static Node reverseLL(Node head)
	{
		Node previous=null;
		Node temp=head;
		while(temp!=null)
		{
			Node front=temp.next;
			temp.next=previous;
			previous=temp;
			temp=front;
		}
		return previous;
	}

}
