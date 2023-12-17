package linked_list;
import java.util.LinkedList;
import java.util.Scanner;
public class Deletion_Of_nodes {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<>();
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter no. of elements : ");
		int n=scan.nextInt();
		
		Node head=null;
		for(int i=0;i<n;i++)
		{
			int data=scan.nextInt();
			ll.add(data);
			head=addElements(head,data);
		}
		System.out.println("Before head deletion : ");
		printList(head);
		
		head=headdelete(head);
		System.out.println("After head deletion : ");
		printList(head);
		
		head=deleteTail(head);
		System.out.println("After tail deletion : ");
		printList(head);
		
	}
	
	public static Node addElements(Node head,int data)
	{
		if(head==null)
			head=new Node(data);
		else
		{
			Node current=head;
			while(current.next!=null)
			{
				current = current.next;
			}
			current.next=new Node(data);
			
		}
		return head;
			
	}
	
	public static void printList(Node head)
	{
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head=head.next;
		}
		System.out.println();
	}
	
	public static Node headdelete(Node head)
	{
		if(head==null)
			return head;
		return head.next;
	}
	
	public static Node deleteTail(Node head)
	{
		if(head==null ||head.next==null)
			return null;
		else
		{
			Node temp=head;
			while(temp.next.next!=null)
			{
				temp=temp.next;
			}
			temp.next=null;
			return head;
		}
	}

}
