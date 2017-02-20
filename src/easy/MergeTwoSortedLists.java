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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
		
		
		ListNode pre_node = null;
		ArrayList<Integer> list = new ArrayList<Integer>();

		if(l1 != null){
			while(l1.next != null || l1.val != 0){
				pre_node = l1.next;
				list.add(l1.val);
				if (pre_node == null) {//如果当前元素没有下一个元素，则跳出循环
					break;
				} else {//如果有，则把当前元素赋给下一次循环的node
					l1 = pre_node;
				}
			}
		}
		if(l2 != null){
			while(l2.next != null || l2.val != 0){
				pre_node = l2.next;
				list.add(l2.val);
				if (pre_node == null) {//如果当前元素没有下一个元素，则跳出循环
					break;
				} else {//如果有，则把当前元素赋给下一次循环的node
					l2 = pre_node;
				}
			}
		}
		if(list == null || list.isEmpty()){
			//return null;
		}
		
		Collections.sort(list);
		List<ListNode> nodelist = new ArrayList<ListNode>();
		
		for (int i = 0; i < list.size(); i++) {
			nodelist.add(new ListNode(list.get(i)));
		}
		ListNode head = nodelist.get(0);
		for (int i = 0; i < nodelist.size(); i++) {
			if(i+1 < nodelist.size()){
				nodelist.get(i).next = nodelist.get(i+1);//重点！！
			}
		}
		
		
		
		
		
		
	}

}
