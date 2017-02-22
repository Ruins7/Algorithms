/**  
 * @Title: NthLastNodeinList.java
 * @Prject: Algorithms
 * @Package: easy
 * @Description: TODO
 * @author: ruins7  
 * @date: Feb 22, 2017 1:03:47 PM
 * @version: V1.0  
 */
package easy;

import Tools.ListNode;

/**
 * @ClassName: NthLastNodeinList
 * @Description: TODO
 * @author: ruins7
 * @date: Feb 22, 2017 1:03:47 PM
 */
public class NthLastNodeinList {

	/**
	 * @Title: main
	 * @Description: LintCode 166
	 * @param args
	 * @return: void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(3);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(1);
		ListNode n4 = new ListNode(5);
		head.next = n2;
		n2.next = n3;
		n3.next = n4;
		int n = 0;

		nLastNode(head, n);
	}

	public static ListNode nLastNode(ListNode head, int n) {
		ListNode node = head;
		int length = 0;
		if (head == null) {
			return null;
		}
		while (node.next != null || node.val != 0) {
			length++;
			if (node.next != null) {
				node = node.next;
			} else {
				break;
			}
		}
		int index = length - n;

		ListNode node2 = head;
		int i = 0;
		while (node2.next != null || node2.val != 0) {
			if (i == index) {
				System.out.println("mmm " + node2.val);
				return node2;
			}
			if (node2.next == null) {
				break;
			} else {
				node2 = node2.next;
			}
			i++;
		}
		return node2;
	}

}
