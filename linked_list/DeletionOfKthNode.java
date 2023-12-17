package linked_list;

import java.util.LinkedList;
import java.util.Scanner;

public class DeletionOfKthNode {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<>();
		System.out.println("Enter the no ofelemets : ");
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println("Enter elements : ");
		Node head=null;
		for(int i=0;i<n;i++)
		{
			head=addElements(head, scan.nextInt());
		}
		
		System.out.println("Linked List : ");
		printList(head);
		
		System.out.println("After removing Kth node : ");
		head=deleteK(head,0);
		printList(head);
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
	
	public static void printList(Node head)
	{
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head=head.next;
		}
		System.out.println();
		
	}
	
	public static Node deleteK(Node head,int k)
	{
		if(k==0)
		{
			head=head.next;
			return head;
		}
		if(head==null)
			return head;
		else
		{
			int count=0;
			Node temp=head;
			Node previous=null;
			while(temp!=null)
			{
				if(count==k)
				{
					previous.next=previous.next.next;
					break;
				}
				count++;
				previous=temp;
				temp=temp.next;
			}
			return head;
		}
	}

}
