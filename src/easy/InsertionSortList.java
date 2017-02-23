/**  
 * @Title: InsertionSortList.java
 * @Prject: Algorithms
 * @Package: easy
 * @Description: TODO
 * @author: ruins7  
 * @date: Feb 23, 2017 2:02:28 PM
 * @version: V1.0  
 */
package easy;

import Tools.ListNode;

/**
 * @ClassName: InsertionSortList
 * @Description: TODO
 * @author: ruins7
 * @date: Feb 23, 2017 2:02:28 PM
 */
public class InsertionSortList {

	/**
	 * @Title: main
	 * @Description: LintCode 173
	 * @param args
	 * @return: void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(4);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(1);
		ListNode n4 = new ListNode(3);
		ListNode n5 = new ListNode(6);
		head.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;

		insertionSort(head);

	}

	public static ListNode insertionSort(ListNode head) {
		ListNode dummy = new ListNode(0);

		while (head != null) {
			ListNode n = dummy;//n改变，dummy也会改变
			while (n.next != null && n.next.val < head.val) {
				n = n.next;
			}
			ListNode next = head.next;//取head除第一个以外的部分
			head.next = n.next;//将head除第一个以外的部分改变
			n.next = head;//将head 当前的第一个值传给dummy
			head = next;//将剩下的head部分保留
		}

		return dummy.next;
	}

}
