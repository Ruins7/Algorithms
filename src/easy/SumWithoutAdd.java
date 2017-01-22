/**  
 * @Title: SumWithoutAdd.java
 * @Prject: Algorithms
 * @Package: easy
 * @Description: TODO
 * @author: ruins7  
 * @date: Jan 21, 2017 7:33:32 PM
 * @version: V1.0  
 */
package easy;

/**
 * @ClassName: SumWithoutAdd
 * @Description: TODO
 * @author: ruins7
 * @date: Jan 21, 2017 7:33:32 PM
 */
public class SumWithoutAdd {

	/**
	 * @Title: main
	 * @Description: LintCode 1 
	 * 				不用数学操作实现加法（位操作）
	 * 				首先计算出两个加数二进制状态下哪个长度最长，最长的长度即是循环的次数
	 * 				循环体：
	 * 				x = x^y //执行加法，不考虑进位。
					y = (x&y)<<1 //进位操作
					循环结束后，sum = x^y;
	 * @param args
	 * @return: void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		int x = 5;
		int y = 3;
		
		//为了获取两个加数的二进制的长度
		String xs = Integer.toBinaryString(x);
		String ys = Integer.toBinaryString(y);
		 
		//存放x,y中间值
		int mx = 0;
		int my = 0;
		
		for(int i = 0;i < Math.max(xs.length(), ys.length()); i++){
			mx = x^y;
			my = (x & y)<<1;
			x = mx; 
			y = my;
		}
		
		int sum = x ^ y;
		
		System.out.println("result: "+ sum);
		
	}

}
