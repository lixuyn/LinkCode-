package scu.wsn.lx;

import org.junit.Test;

public class Partion {
	public ListNode partition(ListNode head, int x) {
			if (head == null)
			return null;
		ListNode lt = new ListNode(-1);
		ListNode gt = new ListNode(-1);
		ListNode l = lt, g = gt;
		while (head != null) {
			if (head.val < x) {
				l.next = head;
				head = head.next;
				l = l.next;
				l.next = null;
			} else {
				g.next = head;
				head = head.next;
				g = g.next;
				g.next = null;
			}
			
		}
		if (gt.next != null)
			l.next = gt.next;
		return lt.next;
	}

	@Test
	public void test() {
		/**
		 * 1->4->3->2->5->2->null£¬²¢ÇÒ x=3 1->2->2->4->3->5->null
		 */
	
		ListNode head = new ListNode(1);
		head.next = new ListNode(4);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(2);
		head.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next  = new ListNode(2);
		partition(head, 3);
	}
}
