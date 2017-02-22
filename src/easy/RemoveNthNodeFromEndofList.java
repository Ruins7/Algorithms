/**  
 * @Title: RemoveNthNodeFromEndofList.java
 * @Prject: Algorithms
 * @Package: easy
 * @Description: TODO
 * @author: ruins7  
 * @date: Feb 19, 2017 1:43:29 PM
 * @version: V1.0  
 */
package easy;

import Tools.ListNode;

/**
 * @ClassName: RemoveNthNodeFromEndofList
 * @Description: TODO
 * @author: ruins7
 * @date: Feb 19, 2017 1:43:29 PM
 */
public class RemoveNthNodeFromEndofList {

	/**
	 * @Title: main
	 * @Description: LintCode 174
	 * @param args
	 * @return: void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		head.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		int n = 5;
		// 以上为ListNode初始化

		// 计算length
		int length = 1;
		ListNode node = head;// 关键！！不能在原数据上操作
		while (node.next != null) {
			node = node.next;
			length++;
		}

		int delindex = length - n;

		ListNode node2 = head;
		if (delindex <= 0) {// 要删除的是第一个元素
			if (node2.next != null) {
				node2 = node2.next;
			} else {
				node2 = null;
			}
			head = node2;
			System.out.println("return here");
			// return head;
		}

		int i = 0;
		while (node2 != null) {
			if (i == delindex - 1) {
				if (node2.next.next != null) {
					node2.next = node2.next.next;// 原数据head在此时修改
				} else {
					node2.next = null;
				}
				break;
			}
			i++;
			node2 = node2.next;
		}
		System.out.println("return here");
		// return head;

	}
}
