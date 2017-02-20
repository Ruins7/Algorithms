/**  
 * @Title: ReverseLinkedList.java
 * @Prject: Algorithms
 * @Package: easy
 * @Description: TODO
 * @author: ruins7  
 * @date: Feb 19, 2017 8:30:24 PM
 * @version: V1.0  
 */
package easy;

import Tools.ListNode;

/**
 * @ClassName: ReverseLinkedList
 * @Description: TODO
 * @author: ruins7
 * @date: Feb 19, 2017 8:30:24 PM
 */
public class ReverseLinkedList {

	/**
	 * @Title: main
	 * @Description: LintCode 35
	 * @param args
	 * @return: void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		head.next = n2;
		n2.next = n3;
		reverse(head);
	}

	public static ListNode reverse(ListNode head) {
		ListNode n = null;
		ListNode nnext = null;
		ListNode node = head;
		if (head == null) {
			return null;
		}
		while (node.next != null || node.val != 0) {//为了取到list的最后一个元素
			nnext = node.next;//先把当前元素的next 赋给nnext
			node.next = n;//在把上一个元素赋给当前元素的next，如果是第一个元素的话赋为null
			n = node;//把当前元素赋给n
			if (nnext == null) {//如果当前元素没有下一个元素，则跳出循环
				break;
			} else {//如果有，则把当前元素赋给下一次循环的node
				node = nnext;
			}

		}
		head = node;//将reverse好的list头赋给head
		return node;

	}
}
