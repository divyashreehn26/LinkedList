package doublyLinkedList;

public class AddingArrayElements {

	public static void main(String[] args) {
		int arr[]= {3,6,9,12};
		Node head=null;
		head=addElements(arr);
		printElements(head);
		
	}
	
	public static Node addElements(int arr[])
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
	
	public static void printElements(Node head)
	{
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head=head.next;
		}
		System.out.println();
	}
	
	

}

class Node{
	int data;
	Node next;
	Node back;
	
	Node(int data, Node next, Node back)
	{
		this.data=data;
		this.next=next;
		this.back=back;
	}
	
	Node(int data)
	{
		this.data=data;
		this.next=null;
		this.back=null;
	}
}



