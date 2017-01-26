/**  
 * @Title: ClimbingStairs.java
 * @Prject: Algorithms
 * @Package: easy
 * @Description: TODO
 * @author: ruins7  
 * @date: Jan 23, 2017 1:14:49 PM
 * @version: V1.0  
 */
package easy;

/**
 * @ClassName: ClimbingStairs
 * @Description: TODO
 * @author: ruins7
 * @date: Jan 23, 2017 1:14:49 PM
 */
public class ClimbingStairs {

	/**
	 * @Title: main
	 * @Description: LintCode 111
	 * 				未完成 dp 问题
	 * @param args
	 * @return: void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int loopNum = (n/2)-1;//除去0个2 和 最多个2 的情况，中间可以用的2的次数
		System.out.println(loopNum);

		while(loopNum > 0){
			int currOneNum = n - (2 * loopNum);//当前循环中1的个数
			//currOneNum 个 1 and loopNum 个 2 的 排列组合
		}
		
		
		
		
		
		
		//最多步骤数: n  0个2
		//先求出最多能用几个2
		//int maxTwo = n / 2; 
		
		
		
		
		
	}

}
