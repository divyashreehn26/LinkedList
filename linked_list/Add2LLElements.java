//Eg : 521+29=712

package linked_list;

public class Add2LLElements {

	public static void main(String[] args) {
		int l1[]= {5,2,1};
		int l2[]= {2,9};
		Node head1=null;
		Node head2=null;
		for(int i=0;i<l1.length;i++)
		{
			head1=addElements(head1, l1[i]);
		}
		
		for(int i=0;i<l2.length;i++)
		{
			head2=addElements(head2, l2[i]);
		}
		
		Node head=addition(head1,head2);
		print(head);
		
	}
	
	public static Node addElements(Node head,int data)
	{
		if(head==null)
			return new Node(data);
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=new Node(data);
			return head;
		}
	}
	
	public static void print(Node head)
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
		
	}
	
	public static Node addition(Node t1,Node t2)
	{
		Node dummy=new Node(-1);
		Node current=dummy;
		int carry=0;
		
		while(t1!=null || t2!=null)
		{
			int sum=carry;
			if(t1 != null)
				sum+=t1.data;
			if(t2!=null)
				sum+=t2.data;
			
			Node newNode=new Node(sum%10);
			carry=sum/10;
			
			current.next=newNode;
			current=current.next;
			if(t1 != null) t1=t1.next;
			if(t2 != null) t2=t2.next;
		}
		return dummy.next;
	}
	
	

}
