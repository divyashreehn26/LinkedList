//ALL THE "AFTER" PROGRAMS ARE DONE BY ME. HE HAS DONE ONLY BEFORE

package doublyLinkedList;

public class Insertion {

	public static void main(String[] args) {
		int arr[]= {2,5,9,0,-1,89};
		Node head=null;
		
		head=addElements(arr);
		System.out.println("Original elements :");
		printElements(head);
		
//		head=insertBeforeHead(head, -45);
//		System.out.println("Insertion before head elements :");
//		printElements(head);
		
//		head=insertAfterHead(head, -45);
//		System.out.println("Insertion after head elements :");
//		printElements(head);
		
//		head=insertBeforeTail(head, -45);
//		System.out.println("Insertion before tail elements :");
//		printElements(head);
		
//		head=insertAfterTail(head, -45);
//		System.out.println("Insertion after tail elements :");
//		printElements(head);
		
//		head=insertAtKthPlace(head, -45, 4);
//		System.out.println("Insertion at Kth element :");
//		printElements(head);
		
//		insertBeforeNode(head.next.next, -34);
//		System.out.println("Insertion before Kth node :");
//		printElements(head);
		
		insertAfterNode(head.next.next, -34);
		System.out.println("Insertion after Kth node :");
		printElements(head);
	}
	
	public static void insertAfterNode(Node node, int val)
	{
		Node front=node.next;
		Node newNode=new Node(val, front, node);
		node.next=newNode;
		front.back=newNode;
	}
	
	public static void insertBeforeNode(Node node, int val)
	{
		Node pre=node.back;
		Node newNode=new Node(val, node, pre);
		pre.next=newNode;
		node.back=newNode;
		
	}
	
	public static Node insertAtKthPlace(Node head, int val, int k)
	{
		if(k==1)
			return insertBeforeHead(head, val);
		Node temp=head;
		int count=0;
		while(temp!=null)
		{
			count++;
			if(count==k)
				break;
			temp=temp.next;
		}
		Node pre=temp.back;
		Node newNode=new Node(val, temp, pre);
		pre.next=newNode;
		temp.back=newNode;
		return head;
	}
	
	public static Node insertAfterTail(Node head, int val)
	{
		if(head==null)
			return new Node(val);
		
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		Node newTail=new Node(val,null,temp);
		temp.next=newTail;
		return head;
	}
	
	public static Node insertBeforeTail(Node head, int val)
	{
		if(head.next==null)
		{
			head=insertBeforeHead(head, val);
			return head;
		}
		
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		Node pre=temp.back;
		Node newTail=new Node(val,temp,pre);
		
		pre.next=newTail;
		temp.back=newTail;
		return head;
	}
	
	public static Node insertAfterHead(Node head, int val)
	{
		Node newHead=new Node(val,head,head.next);
		Node temp=head.next;
		head.next=newHead;
		newHead.back=head;
		newHead.next=temp;
		temp.back=newHead;
		return head;
	}
	
	public static Node insertBeforeHead(Node head, int val)
	{
		Node newHead=new Node(val,null,head);
		newHead.next=head;
		newHead.back=null;
		return newHead;
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
