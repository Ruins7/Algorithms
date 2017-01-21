/**  
 * @Title: BinaryAdd.java
 * @Prject: Algorithms
 * @Package: easy
 * @Description: TODO
 * @author: ruins7  
 * @date: Jan 21, 2017 2:59:27 PM
 * @version: V1.0  
 */
package easy;

/**
 * @ClassName: BinaryAdd
 * @Description: TODO
 * @author: ruins7
 * @date: Jan 21, 2017 2:59:27 PM
 */
public class BinaryAdd {

	/**
	 * @Title: main
	 * @Description: LintCode 408
	 * 				java 二进制和十进制之间的转换
	 * @param args
	 * @return: void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//二进制input
		String a = "11";
		String b = "1";
		 
		//二进制 -> 十进制
		String ten_a = Integer.valueOf(a, 2).toString();
		String ten_b = Integer.valueOf(b, 2).toString();
		
		//十进制 -> 二进制
		String binary_sum_ab = Integer.toBinaryString(Integer.valueOf(ten_a)+Integer.valueOf(ten_b));
		System.out.println(binary_sum_ab);
		
	}

}
