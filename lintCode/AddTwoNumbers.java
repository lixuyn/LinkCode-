package lintCode;

public class AddTwoNumbers {

	public static void main(String[] args) {
		
		ListNode l1 = ListNode.list(new int[]{9,9});
		ListNode l2 = ListNode.list(new int[]{1});
		System.out.println(addTwoNumbers(l1, l2));
	}
	 public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
			ListNode head = new ListNode(0);
			ListNode end = null;
			int temp = 0;
			end = head;
			while (l1 != null || l2 != null) {
				int value1 = 0; 
				if(l1 != null){
					value1 = l1.val;
					l1 = l1.next;
				}
				int value2 = 0;
				if(l2 != null){
					value2 = l2.val;
					l2 = l2.next;
				}
				int va = (temp +value1+ value2)%10;
				ListNode t = new ListNode(va);
				temp = 0;
				end.next = t;
				end = t;
				temp = (value2+value1+ va)/10;
				
			}
			if(temp > 0 ){
			   	ListNode t = new ListNode(temp);
				end.next = t;
				end = t;
			}
			
			return head.next;
	    }

}

class ListNode {
	int val;
	ListNode next;
	
	ListNode(int x) {
		val = x;
	}
	
	public static ListNode list(int arr[]){
		ListNode head = null ,temp = null , tail =null;
		int index = 0;
		while(index < arr.length){
			temp = new ListNode(arr[index]);
			if(head == null){
				head = temp;
				tail = temp;
			}
			else {
				tail.next = temp;
				tail = temp;
			}
			index++;
		}
		return head;
	} 
}