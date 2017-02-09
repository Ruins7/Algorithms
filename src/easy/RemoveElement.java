/**  
 * @Title: RemoveElement.java
 * @Prject: Algorithms
 * @Package: easy
 * @Description: TODO
 * @author: ruins7  
 * @date: Feb 7, 2017 7:49:19 PM
 * @version: V1.0  
 */
package easy;

import java.util.ArrayList;

/**
 * @ClassName: RemoveElement
 * @Description: TODO
 * @author: ruins7
 * @date: Feb 7, 2017 7:49:19 PM
 */
public class RemoveElement {

	/**
	 * @Title: main
	 * @Description: LintCode 172.
	 * @param args
	 * @return: void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = new int[] {0, 4, 4, 0, 0, 2, 4, 4};
		int elem = 4;
		if (A != null) {
			ArrayList list = new ArrayList();
			for (int i : A) {
				if (i != elem) {
					list.add(i);
				}
			}
			Object[] B = list.toArray(new Object[list.size()]);
			for (Object object : B) {
				System.out.println(object);
			}
		} else {
			System.out.println(0);
		}
	}

}
