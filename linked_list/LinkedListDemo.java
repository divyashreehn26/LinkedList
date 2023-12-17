package linked_list;

public class LinkedListDemo {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		
		//first node
		Node y = new Node(arr[0]);
		System.out.println(y.data);
		System.out.println(y.next);
		
		//second node
		Node z=new Node(arr[1]);
		System.out.println(z.data);
		System.out.println(z.next);
		
		

	}

}

class Node {
	int data;
	Node next;

	Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}
