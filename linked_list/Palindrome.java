package linked_list;

import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the no. of elements : ");
		int n=scan.nextInt();
		
		Node head=null;
		System.out.println("Enter the elements : ");
		for(int i=0;i<n;i++)
		{
			head=addElements(head,scan.nextInt());
		}
		
		System.out.println("Elements inside LinkedList : ");
		printElements(head);
		
		
		
		System.out.println("The palindrome check result is : "+palindrome(head));
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
	
	//reverse the LL
	public static Node reverseLL(Node head)
	{
		Node pre=null;
		Node temp=head;
		while(temp!=null)
		{
			Node front=temp.next;
			temp.next=pre;
			pre=temp;
			temp=front;
		}
		return pre;
	}
	
	public static boolean palindrome(Node head)
	{
		if(head==null||head.next==null) return true;
		
		//finding the middle of LL
		Node slow=head;
		Node fast=head;
		
		while(fast.next!=null && fast.next.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		
		slow.next=reverseLL(slow.next);
		slow=slow.next;
		Node dummy=head;
		
		while(slow!=null)
		{
			if(slow.data!=dummy.data)
				return false;
			dummy=dummy.next;
			slow=slow.next;
		}
		return true;
	}

}
