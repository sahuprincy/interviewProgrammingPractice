package interviewPracticeQuestions;
/**
 * Merge two sorted linked lists and return it as a sorted list. The list 
 * should be made by splicing together the nodes of the first two lists.
 * */
public class MergeList {

	public static void main(String a[]) {
		MergeList mergeTwoSortedLists = new MergeList();

		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(4);

		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);
		System.out.print("Input:: ");
		System.out.print("[" + l1.val + "," + l1.next.val + "," + l1.next.next.val + "]");
		System.out.println("[" + l2.val + "," + l2.next.val + "," + l2.next.next.val + "]");
		ListNode listNode = mergeTwoSortedLists.mergeTwoLists(l1, l2);
		System.out.print("output:: ");

		System.out.print(listNode.val);
		System.out.print(",");
		System.out.print(listNode.next.val);
		System.out.print(",");
		System.out.print(listNode.next.next.val);
		System.out.print(",");
		System.out.print(listNode.next.next.next.val);
		System.out.print(",");
		System.out.print(listNode.next.next.next.next.val);
		System.out.print(",");
		System.out.print(listNode.next.next.next.next.next.val);

	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode headNode = new ListNode(0);
		
		ListNode resultantList =headNode;
		ListNode p1=l1;
		ListNode p2=l2;

		while (p1 != null && p2 != null) {
			if (p1.val < p2.val) {
				resultantList.next = p1;
				p1 = p1.next;
			} else {
				resultantList.next = p2;
				p2 = p2.next;
			}

			resultantList = resultantList.next;
		}
		if (p1 != null) {
			resultantList.next=p1;
		}
		if (p2 != null) {
			resultantList.next=p2;
		}
		return headNode.next;
		
	}
		 
}

/**public class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
	
	@Override
	public String toString() {
		return "ListNode [val=" + val + ", next=" + next + "]";
	}

}*/
