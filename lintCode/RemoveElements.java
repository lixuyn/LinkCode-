package scu.wsn.lx;

 class ListNode {
	      int val;
	      ListNode next;
	    ListNode(int x) { val = x; }
 }
public class RemoveElements {
	    /**
	     * @param head a ListNode
	     * @param val an integer
	     * @return a ListNode
	     */
	    public  static ListNode removeElements(ListNode head, int val) {
	    if(head == null) return null;
	     ListNode p = new ListNode(-1);
	     p.next = head;
	     ListNode temp = p ;
	     while(temp.next != null){
	               if(temp.next.val == val){
	                    temp.next = temp.next.next;
	                    continue;
	               }
	                temp = temp.next;
	      }
	       return p.next;
	    }
	    
	    public static void main(String argsp[]){
	    	ListNode head = new ListNode(5);
	    	head.next = null;
	    	removeElements(head, 1);
	    	
	    }
	}