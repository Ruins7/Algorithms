/**  
 * @Title: HappyNumber.java
 * @Prject: Algorithms
 * @Package: easy
 * @Description: TODO
 * @author: ruins7  
 * @date: Jan 26, 2017 12:37:20 PM
 * @version: V1.0  
 */
package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: HappyNumber
 * @Description: TODO
 * @author: ruins7
 * @date: Jan 26, 2017 12:37:20 PM
 */
public class HappyNumber {

	/**
	 * @Title: main
	 * @Description: LintCode 488 
	 * 				char[]中存的是char， 直接计算相当于实用ASCII码
	 * @param args
	 * @return: void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 19;
		boolean isHappyNum = false;
		List<Integer> list = new ArrayList<Integer>();
		while (true) {
			int sum = calSum(n);
			if (sum == 1) {
				isHappyNum = true;
				break;
			} else {
				if (list != null) {
					if (list.contains(sum)) {
						break;
					} else {
						list.add(sum);
						n = sum;
					}
				} else {
					list.add(sum);
					n = sum;
				}
			}
		}
		System.out.println("happy number: " + isHappyNum);
	}

	public static int calSum(int n) {
		char[] cn = (n + "").toCharArray();
		int sum = 0;
		for (int i = 0; i < cn.length; i++) {
			// Math.pow() 求平方
			sum += (int) Math.pow(Integer.valueOf(cn[i] + ""), 2);
		}
		return sum;
	}

}
