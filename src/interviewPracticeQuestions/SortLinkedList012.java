package interviewPracticeQuestions;

public class SortLinkedList012 {

	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(0);
		head.next.next.next = new Node(1);
		System.out.println("Linked List Before Sorting");
		printList(head);
		head = sortList(head);
		System.out.println("Linked List After Sorting");
		printList(head);
	}

	public static void printList(Node node) {
		while (node != null) {
			System.out.print(node.val + " ");
			node = node.next;
		}
	}
/**
 * 1. Take 3 nodes
 * 2. assign head to current and iterate for till null
 * 3. if (Current.data ==0) then zero.next =curr, curr=curr.next, zero=zero.next, 1, 2
 * 4. Link the List
 * 5. Return the head
 * 
 * 
 * */
	static Node sortList(Node head) {
		if (head == null || head.next == null) {

			return head;
		}
		Node zeroNode = new Node(0);
		Node oneNode = new Node(0);
		Node twoNode = new Node(0);

		Node zero = zeroNode, one = oneNode, two = twoNode;

//Traverse 
		Node current = head;

		while (current != null) {

			if (current.val == 0) {
				zero.next = current;
				zero = zero.next;
				current = current.next;

			} else if (current.val == 1) {
				one.next = current;
				one = one.next;
				current = current.next;
			} else {
				two.next = current;
				two = two.next;
				current = current.next;

			}

		}
		zero.next = (oneNode.next != null) ? (oneNode.next) : (twoNode.next);
		one.next = twoNode.next;
		two.next = null;
		head = zeroNode.next;
		return head;

	}

}
