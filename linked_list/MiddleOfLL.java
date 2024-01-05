package linked_list;

public class MiddleOfLL {

	public static void main(String[] args) {
		int arr[]= {2,5,1,4,9,0};
		Node head=null;
		for(int i=0;i<arr.length;i++)
		{
			head=addElements(head,arr[i]);
		}
		
		System.out.println("Elements : ");
		printElements(head);
		
		System.out.println("Middle element is : "+middleElement(head));
		
		//Using Tortoise-Hare algorithm
		System.out.println("Using Tortoise-Hare algorithm : "+thAlgorithm(head));

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
	
	public static int middleElement(Node head)
	{
		int count=0;
		Node temp=head;
		while(temp!=null)
		{
			count++;
			temp=temp.next;
		}
		int n=(count/2)+1;
		
		temp=head;
		while(temp!=null)
		{
			n=n-1;
			if(n==0)
				break;
			temp=temp.next;
		}
		return temp.data;
	}
	
	//Using Tortoise-Hare algorithm
	public static int thAlgorithm(Node head)
	{
		Node slow=head;
		Node fast=head;
		
		while(fast!=null &&  fast.next!=null)
		{
			fast=fast.next.next;
			slow=slow.next;
		}
		return slow.data;
	}

}
