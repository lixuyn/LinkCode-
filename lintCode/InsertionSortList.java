package scu.wsn.lx;

public class InsertionSortList {

	public static void main(String[] args) {
		ListNode head = new ListNode(2);
		head.next = new ListNode(1);
		insertionSortList(head);

	}

	public static ListNode insertionSortList(ListNode head) {
		if (head == null)
			return null;
		ListNode first = new ListNode(-1);
		ListNode next = null;
		while (head != null) {
			next = first;
			ListNode t = head.next;
			while (next.next != null && next.next.val < head.val)
				next = next.next;
			head.next = next.next;
			next.next = head;
			head = head.next;
		}
		return first.next;
	}

}
