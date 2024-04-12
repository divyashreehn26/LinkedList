package doublyLinkedList;

public class ReverseDLL {

	public static void main(String[] args) {
		int arr[]= {3,0,-1,6};
		Node head=null;
		
		head=addition(arr);
		System.out.println("Original elements :");
		printElements(head);
		
		head=reverse(head);
		System.out.println("Reversed elements :");
		printElements(head);
	}
	
	public static Node reverse(Node head)
	{
		Node current=head;
		Node last=null;
		while(current!=null)
		{
			last=current.back;
			current.back=current.next;
			current.next=last;
			current=current.back;
		}
		return last.back;
	}
	
	public static void printElements(Node head)
	{
		while(head!=null)
		{
			System.out.print(head.data+" -> ");
			head=head.next;
		}
		System.out.print("X");
		System.out.println();
	}
	
	public static Node addition(int arr[])
	{
		Node head=new Node(arr[0]);
		Node pre=head;
		for(int i=1;i<arr.length;i++)
		{
			Node temp=new Node(arr[i],null,pre);
			pre.next=temp;
			pre=pre.next;
		}
		return head;
				
	}

}
