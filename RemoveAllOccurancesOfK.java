package doublyLinkedList;

public class RemoveAllOccurancesOfK {

	public static void main(String[] args) {
		int arr[]= {10,4,10,8,9,-1,10};
		
		Node head=null;
		
		head=addition(arr);
		System.out.println("Original array elements : ");
		print(head);
		
		head=removeOccurances(head,10);
		System.out.println("Modified array elements : ");
		print(head);
	}
	
	public static Node removeOccurances(Node head, int k)
	{
		Node temp=head;
		while(temp!=null)
		{
			if(temp.data==k)
			{
				if(temp==head)
				{
					head=head.next;
				}
				Node nextNode=temp.next;
				Node preNode=temp.back;
				
				if(nextNode!=null)nextNode.back=preNode;
				if(preNode!=null) preNode.next=nextNode;
				temp=temp.next;
			}
			else {
				temp=temp.next;
			}
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
	
	public static Node addition(int arr[])
	{
		Node head=new Node(arr[0]);
		head.back=null;
		Node pre=head;
		for(int i=1;i<arr.length;i++)
		{
			Node temp=new Node(arr[i],null, pre);
			pre.next=temp;
			pre=pre.next;
		}
		return head;
	}

}
