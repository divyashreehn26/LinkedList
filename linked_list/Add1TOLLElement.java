package linked_list;
import java.util.Scanner;
public class Add1TOLLElement {

	public static void main(String[] args) {
		System.out.println("Enter no. of elements :");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println("Enter elements :");
		Node head=null;
		for(int i=0;i<n;i++)
		{
			head=addElements(head, scan.nextInt());
		}
		
		print(head);
		System.out.println("After adding 1 :");
		print(addUsingRecursion(head));

	}
	
	public static Node addElements(Node head, int data)
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
	
	public static void print(Node head)
	{
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head=head.next;
		}
		System.out.println();
	}
	
	//This is iterative solution which has time complexity of O(3N) and space complexity of O(1)
	//time complexity is bcoz reverse-->add(while loop)-->reverse
	public static Node add1(Node head)
	{
		int carry=1;
		head=reverse(head);
		Node temp=head;
		while(temp!=null)
		{
			temp.data+=1;
			if(temp.data<10)
			{
				carry=0;
				break;
			}
			else
			{
				temp.data=0;
				carry=1;
			}
			temp=temp.next;
		}
		
		if(carry==1)
		{
			Node newNode=new Node(1);
			head=reverse(head);
			newNode.next=head;
			return newNode;
		}
		else
			return reverse(head);
		
	}
	
	//This is using recursion. This have TC of O(N) and SC of O(N).
	//Hence both has their own pros and cons and used based on users requirement
	public static Node addUsingRecursion(Node head)
	{
		int res=helper(head);
		if(res==1)
		{
			Node newHead=new Node(1);
			newHead.next=head;
			return newHead;
		}
		else
		{
			return head;
		}
	}
	
	public static int helper(Node head)
	{
		Node temp=head;
		if(temp==null)
			return 1;
		int carry=helper(temp.next);
		temp.data+=carry;
		if(temp.data<10)
			return 0;
		temp.data=0;
		return 1;	
	}
	
	public static Node reverse(Node head)
	{
		if(head==null || head.next==null)
			return head;
		Node temp=head;
		Node pre=null;
		while(temp!=null)
		{
			Node front=temp.next;
			temp.next=pre;
			pre=temp;
			temp=front;
		}
		return pre;
	}

}
