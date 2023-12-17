//NO NEED TO CREATE NODE CLASS AGAIN
package linked_list;

public class CopyingArrayElementsIntoLL {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		Node head = copying(arr);
		System.out.println(head.data);

		traversing(head);
		searching(head,1);
		//deleting the head
		head=deleteHead(head);
		traversing(head);
	}

	public static Node copying(int arr[]) {

		Node head = new Node(arr[0]);
		Node current = head;

		// copying array elements into LinkedList
		for (int i = 1; i < arr.length; i++) {
			current.next = new Node(arr[i]);
			current = current.next;
		}

		return head;
	}

	public static void traversing(Node head) {

		// printing elements from LL or traversing through LL
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();

	}

	public static void searching(Node head, int search) {
		// searching an element
		boolean flag = false;
		while (head != null) {
			if (head.data == search) {
				System.out.println("Element found!!");
				flag = true;
			}
			head = head.next;
		}
		if (!flag)
			System.out.println("Element not found!!");

	}
	
	public static Node deleteHead(Node head)
	{
		if(head!=null)
			head=head.next;
		return head;
	}

}
