/**  
 * @Title: MergeTwoSortedLists.java
 * @Prject: Algorithms
 * @Package: easy
 * @Description: TODO
 * @author: ruins7  
 * @date: Feb 20, 2017 1:45:20 PM
 * @version: V1.0  
 */
package easy;

import Tools.ListNode;

/**
 * @ClassName: MergeTwoSortedLists
 * @Description: TODO
 * @author: ruins7
 * @date: Feb 20, 2017 1:45:20 PM
 */
public class MergeTwoSortedLists {

	/**
	 * @Title: main
	 * @Description: LintCode 165
	 * @param args
	 * @return: void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(1);
		ListNode n2 = new ListNode(3);
		ListNode n3 = new ListNode(8);
		ListNode n4 = new ListNode(11);
		ListNode n5 = new ListNode(15);
		l1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		
		ListNode l2 = new ListNode(2);
		ListNode m2 = new ListNode(6);
		l2.next = m2;
		
		ListNode node1 = l1;
		ListNode node2 = l2;
		
		while(node1.next != null){
			while(node2.next != null){
				
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
