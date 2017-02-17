/**  
 * @Title: LinkedList.java
 * @Prject: Algorithms
 * @Package: easy
 * @Description: TODO
 * @author: ruins7  
 * @date: Jan 21, 2017 2:14:15 PM
 * @version: V1.0  
 */
package easy;

/**
 * @ClassName: LinkedList
 * @Description: TODO
 * @author: ruins7
 * @date: Jan 21, 2017 2:14:15 PM
 */
public class LinkedLista {

	/**
	 * @Title: main
	 * @Description: LintCode 452
	 * @param args
	 * @return: void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = null;
		int val = 3;
		
		ListNode list = new ListNode(0);
		list.next = head;
		ListNode curr = list;
		while(curr.next != null){
			if(curr.next.val == val){
				curr.next = curr.next.next;
			} else {
				curr = curr.next;
			}
		}
		System.out.println(list.next);
	}

	
}
class ListNode {
	
	 int val;
	 ListNode next;
	 ListNode(int x) { val = x; }
}
