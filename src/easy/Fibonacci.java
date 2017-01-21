/**  
 * @Title: Fibonacci.java
 * @Prject: Algorithms
 * @Package: easy
 * @Description: TODO
 * @author: ruins7  
 * @date: Jan 20, 2017 2:00:44 PM
 * @version: V1.0  
 */
package easy;

/**
 * @ClassName: Fibonacci
 * @Description: TODO
 * @author: ruins7
 * @date: Jan 20, 2017 2:00:44 PM
 */
public class Fibonacci {

	/**
	 * @Title: main
	 * @Description: LintCode 366
	 * 				可以用递归，本题方法：设置两个int来存储每一次的计算(k,m),循环使k,m相加
	 * 				遇到奇数位就返回k,遇到偶数位就返回m。
	 * 				难点在于寻找循环的次数，首先n-4：因为前四个数都以求出。
	 * 				然后：奇数时：(n-4+1)/2
	 * 					偶数时：(n-4)/2
	 * @param args
	 * @return: void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		final int n1 = 0;
		final int n2 = 1;
		if(n == 1){
			System.out.println(n1);
		}else if(n == 2){
			System.out.println(n2);
		}else if(n == 3){
			System.out.println(n1+n2);
		}else if(n == 4){
			System.out.println(n1+n2+n2);
		}else if(n > 4 && n % 2 == 1){//odd--k
			int k = n1+n2;
			int m = k + n2;
			 for(int i = 1; i <= (n-4+1)/2; i++){
				 k = k + m; 
				 m = k + m;
			 }
			 System.out.println(k);
		}else if(n > 4 && n % 2 == 0){//even--m
			int k = n1 + n2;
			int m = k + n2;
			 for(int i = 1; i <= (n-4)/2; i++){
				 k = k + m; 
				 m = k + m;
			 }
			 System.out.println(m);
		}
	}
}
