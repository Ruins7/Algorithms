/**  
 * @Title: MaximumSubarray.java
 * @Prject: Algorithms
 * @Package: easy
 * @Description: TODO
 * @author: ruins7  
 * @date: Jan 31, 2017 8:35:09 PM
 * @version: V1.0  
 */
package easy;

/**
 * @ClassName: MaximumSubarray
 * @Description: TODO
 * @author: ruins7
 * @date: Jan 31, 2017 8:35:09 PM
 */
public class MaximumSubarray {

	/**
	 * @Title: main
	 * @Description: LintCode 41
	 * @param args
	 * @return: void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = {-2,-5};
		int max_sum = a[0];//将数组的第一个值先赋给max_sum，以防止全部都是负数的情况
		int sum = 0;
		int i = 0;
		int j = 0;
		while(j < a.length){
			for (i = j; i < a.length; i++) {
				sum += a[i];
				if(sum > max_sum){
					max_sum = sum;
				}
			}
			sum = 0;
			j++;
		}
		System.out.println(max_sum);
		
	}

}
