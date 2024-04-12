package doublyLinkedList;

import java.util.ArrayList;
public class FindPairsOfGivenSum {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,9};
		
		Node head=null;
		
		head=addition(arr);
		System.out.println("Original array elements : ");
		print(head);
		
		ArrayList<ArrayList<Integer>> al=findPairs(head,5);
		for (ArrayList<Integer> arrayList : al) {
			System.out.print("[");
			for (int arrayList2 : arrayList) {
				System.out.print(" "+arrayList2);
			}
			System.out.println("]");
		}
		
	}
	
	public static Node findTail(Node head)
	{
		Node tail=head;
		while(tail.next!=null)
		{
			tail=tail.next;
		}
		System.out.println(tail.data);
		return tail;
	}
	
	
	public static ArrayList<ArrayList<Integer>> findPairs(Node head, int k)
	{
		ArrayList<ArrayList<Integer>> al=new ArrayList<>();
		Node left=head;
		Node right=findTail(head);
		
		while(left.data<right.data)
		{
			
			if(left.data+right.data==k)
			{
				ArrayList<Integer> pair=new ArrayList<>();
				pair.add(left.data);
				pair.add(right.data);
				al.add(pair);
				left=left.next;
				right=right.back;
			}
			else if(left.data+right.data<k) {
				left=left.next;
			}
			else {
				right=right.back;
			}
		}
		
		return al;
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
