package doublyLinkedList;

public class Deletion {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		Node head=null;
		head=addElements(arr);
		System.out.println("Original elements : ");
		printElements(head);
		
//		head=deleteHead(head);
//		System.out.println("Deletion of head :");
//		printElements(head);
//		
//		head=deleteTail(head);
//		System.out.println("Deletion of tail :");
//		printElements(head);
		
		//in my case k can be 0. so undex based
//		head=deleteKthElement(head, 2);
//		printElements(head);
		
		//k starts from 1 not index based
//		head=dltKthElement(head, 1);
//		printElements(head);
		
		deleteGivenNode(head.next.next);
		printElements(head);
	}
	
	//we cannot consider head to be the deleted element
	public static void deleteGivenNode(Node temp)
	{
		Node pre=temp.back;
		Node front=temp.next;
		
		if(front==null)
		{
			pre.next=null;
			temp.next=null;
		}
		else {
			pre.next=front;
			front.back=pre;
			temp.next=temp.back=null;
		}
	}
	
	//striver approach
	public static Node dltKthElement(Node head, int k)
	{
		int count=0;
		Node temp=head;
		while(temp!=null)
		{
			count++;
			if(count==k)
				break;
			temp=temp.next;
		}
		
		Node pre=temp.back;
		Node front=temp.next;
		
		//edge case -->1. if it is a single element DLL
		if(pre==null && front==null)
			return null;
		else if(pre==null)
		{
			head=deleteHead(head);
			return head;
		}
		else if(front==null)
		{
			head=deleteTail(head);
			return head;
		}
		else {
			pre.next=front;
			front.back=pre;
			temp.next=temp.back=null;
			return head;
		}
		
	}
	
	//my approach
	public static Node deleteKthElement(Node head, int pos)
	{
		if(head==null)
			return null;
		if(pos==0)
		{
			Node temp=head.next;
			head.next=null;
			return temp;
		}
			
		int count=0;
		Node temp=head;
		while(count!=pos)
		{
			count++;
			temp=temp.next;
		}
		
		Node dum=temp.back;
		dum.next=temp.next;
		temp.next=null;
		return head;
			
	}
	
	public static Node deleteTail(Node head)
	{
		if(head==null || head.next==null)
			return null;
		
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		Node pre=temp.back;
		pre.next=null;
		temp.next=null;
		
		return head;
	}
	
	public static Node deleteHead(Node head)
	{
		//edge case
		if(head==null || head.next==null)
			return null;
		
		Node pre=head;
		head=head.next;
		head.back=null;
		pre.next=null;
		
		return head;
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
