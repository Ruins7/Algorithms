/**  
 * @Title: LastWord.java
 * @Prject: Algorithms
 * @Package: easy
 * @Description: TODO
 * @author: ruins7  
 * @date: Jan 30, 2017 1:02:22 PM
 * @version: V1.0  
 */
package easy;

/**
 * @ClassName: LastWord
 * @Description: TODO
 * @author: ruins7
 * @date: Jan 30, 2017 1:02:22 PM
 */
public class LastWord {

	/**
	 * @Title: main
	 * @Description: LintCode 422
	 * @param args
	 * @return: void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = " Wer      ";// A < Z < a < z
		int leng = 0;
		char b = ' ';
		if (s.length() != 0) {
			if (s.lastIndexOf(b + "") == -1) {
				// 检查首字母
				leng = leng(s);
			} else {
				while (s.lastIndexOf(b + "") + 1 == s.length()) {
					s = s.substring(0, s.length() - 1);
				}
				s = s.substring(s.lastIndexOf(b + "") + 1, s.length());
				if (s.length() != 0) {// 有可能在最后有一个空格
					// 检查首字母
					leng = leng(s);
				}
			}
		}

		System.out.println(leng);
	}

	public static int leng(String s) {
		// 检查首字母
		char first = s.substring(0, 1).charAt(0);
		if (first >= 'A' && first <= 'z') {
			return s.length();
		}else{
			return 0;
		}
	}
}
