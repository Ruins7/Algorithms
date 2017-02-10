/**  
 * @Title: ReverseInteger.java
 * @Prject: Algorithms
 * @Package: easy
 * @Description: TODO
 * @author: ruins7  
 * @date: Feb 10, 2017 1:16:38 PM
 * @version: V1.0  
 */
package easy;

/**
 * @ClassName: ReverseInteger
 * @Description: TODO
 * @author: ruins7
 * @date: Feb 10, 2017 1:16:38 PM
 */
public class ReverseInteger {

	/**
	 * @Title: main
	 * @Description: LintCode 413
	 * @param args
	 * @return: void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1534236469;
		// int n = 123;
		System.out.println(reverseInteger(n));
		// ArrayList newint = new ArrayList();
		// char[] s = (n + "").toCharArray();;
		// if(n == 0){
		// System.out.println(0);
		// } else if (n > 0) {
		// for (int i = s.length - 1; i >= 0; i--) {
		// newint.add(s[i]);
		// }
		// }else {
		// newint.add('-');
		// for (int i = s.length - 1; i > 0; i--) {
		// newint.add(s[i]);
		// }
		//
		// }
		//
		// Object[] ii = newint.toArray();
		// String ss = "";
		// for (Object object : ii) {
		// ss += object + "";
		// }
		//
		// if(Long.valueOf(ss) >= -2147483648 && Long.valueOf(ss) <=
		// 2147483647){
		// System.out.println(Integer.parseInt(ss));
		// }else{
		// System.out.println(0);
		// }

	}

	public static int reverseInteger(int n) {
		int reversed_n = 0;

		while (n != 0) {// 不超过范围时，正常结束
			int temp = reversed_n * 10 + n % 10;
			n = n / 10;
			if (temp / 10 != reversed_n) {// 当超过int范围时（-2147483648==2147483647）
				reversed_n = 0;
				break;
			}
			reversed_n = temp;
		}
		return reversed_n;
	}

}
