/**  
 * @Title: SingleNumber.java
 * @Prject: Algorithms
 * @Package: easy
 * @Description: TODO
 * @author: ruins7  
 * @date: Feb 15, 2017 1:04:18 PM
 * @version: V1.0  
 */
package easy;

/**
 * @ClassName: SingleNumber
 * @Description: TODO
 * @author: ruins7
 * @date: Feb 15, 2017 1:04:18 PM
 */
public class SingleNumber {

	/**
	 * @Title: main
	 * @Description: lintCode 82
	 * 				使用^运算符，使得ret中保存之前没有出现过的数字的binary，如果next数字在之前出现过，
	 * 				则减去它，如果没有出现过，则加入ret中，
	 * 		
	 * 				^位运算符的实质：对应位置相同则为0，不同则为1
	 * 				
	 * @param args
	 * @return: void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = new int[]{1,2,3,4,3,2,4};
		int ret = 0;
		for (int i = 0; i < A.length; i++) {
			 ret ^= A[i];
		}
		System.out.println(ret);
	}
	
	 

}
