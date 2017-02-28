package scu.wsn.lx;

public class AddList {
	/**
	 * @param l1:
	 *            the first list
	 * @param l2:
	 *            the second list
	 * @return: the sum list of l1 and l2
	 */
	public static void main(String args[]) {
		ListNode l1 = new ListNode(3);
		l1.next = new ListNode(1);
		l1.next.next = new ListNode(2);
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(9);
		l2.next.next = new ListNode(5);
		l2.next.next.next = new ListNode(1);
		addLists(l1, l2);
	}

	public static ListNode addLists(ListNode l1, ListNode l2) {
		// write your code here
		ListNode head = l1;
		int temp = 0;
		ListNode next1 = null;
		while (l1 != null && l2 != null) {
			temp = l1.val + l2.val + temp;
			l1.val = temp % 10;
			temp /= 10;
			next1 = l1;
			l1 = l1.next;

		}
		if (l2 != null) {
			l2.val += temp;
			next1.next = l2;
		}
		return head;
	}
}