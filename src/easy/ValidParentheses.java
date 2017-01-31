/**  
 * @Title: ValidParentheses.java
 * @Prject: Algorithms
 * @Package: easy
 * @Description: TODO
 * @author: ruins7  
 * @date: Jan 30, 2017 8:49:39 PM
 * @version: V1.0  
 */
package easy;

import java.util.Stack;

/**
 * @ClassName: ValidParentheses
 * @Description: TODO
 * @author: ruins7
 * @date: Jan 30, 2017 8:49:39 PM
 */
public class ValidParentheses {

	/**
	 * @Title: main
	 * @Description: LintCode 423
	 * @param args
	 * @return:s void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "([{(())[{}]}])";
		Stack st = new Stack();// 用于存放所有的括号
		Stack st2 = new Stack();// 用于从st中pop出反括号") ] }"
		String c = null;// 暂存st中pop出的值
		String ts = null;// 暂存st2中pop出的值
		boolean flag = false;// 最终返回的值
		int flagi = 0;// while循环的标志符，如果为-1，则表示发现括号不匹配，立即终止判断，返回false
		for (int i = 0; i < s.length(); i++) {
			st.push(s.charAt(i) + "");
		}
		while (!st.isEmpty() && flagi != -1) {
			c = (String) st.pop();
			if (c.equals(")") || c.equals("]") || c.equals("}")) {// 诶个pop的过程中，把反括号push到st2中
				st2.push(c);
			}
			switch (c) {// 如果是正括号,
						// 则从反括号中pop值来判断是不是一对，如果不是，则立即判断不匹配，返回flagi=-1;如果匹配，则不执行操作，因为stack已经把值pop出去了，相当于删除
			case "(":
				if (!st2.isEmpty()) {// 如果st2已经是空，有两种可能，一种：已经把所有反括号都pop出去了，当前的正括号没有要匹配的反括号，所以flagi=-1,另一种：s的最后一位是正括号，肯定不匹配，所以flagi=-1
					ts = (String) st2.pop();
					if (!ts.equals(")")) {
						flagi = -1;
						break;
					}
				} else {
					flagi = -1;
					break;
				}
				break;
			case "[":
				if (!st2.isEmpty()) {
					ts = (String) st2.pop();
					if (!ts.equals("]")) {
						flagi = -1;
						break;
					}
				} else {
					flagi = -1;
					break;
				}
				break;
			case "{":
				if (!st2.isEmpty()) {
					ts = (String) st2.pop();
					if (!ts.equals("}")) {
						flagi = -1;
						break;
					}
				} else {
					flagi = -1;
					break;
				}
				break;
			}
		}
		if (st.isEmpty() && st2.isEmpty() && flagi != -1) {//如果最后两个stack中都没有值，并且flagi!=-1，则说明全部匹配
			flag = true;
		}
		System.out.println(flag);

	}

}
