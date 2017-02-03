/**  
 * @Title: PlusOne.java
 * @Prject: Algorithms
 * @Package: easy
 * @Description: TODO
 * @author: ruins7  
 * @date: Feb 3, 2017 1:26:35 PM
 * @version: V1.0  
 */
package easy;

/**
 * @ClassName: PlusOne
 * @Description: TODO
 * @author: ruins7
 * @date: Feb 3, 2017 1:26:35 PM
 */
public class PlusOne {

	/**
	 * @Title: main
	 * @Description: LintCode 407
	 * 				注意使用long类型
	 * @param args
	 * @return: void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] digits = new int[]{9,8,7,6,5,4,3,2,1,0};
		Long realNum = 0l;
		for (int i = digits.length-1; i >= 0 ; i--) {
			realNum = (long) (realNum + (int) digits[i] * Math.pow(10, digits.length-1-i));
		}
		realNum += 1;
		int [] new_arr = new int[((realNum)+"").length()];
		for (int i = 0; i < new_arr.length; i++) {
			long curr_tens = (int) Math.pow(10, new_arr.length-1-i);
			new_arr[i] = (int) (realNum / curr_tens);
			realNum = realNum - (new_arr[i] * curr_tens);
		}
		for (int i = 0; i < new_arr.length; i++) {
			System.out.println(new_arr[i]);
		}
	}

}
