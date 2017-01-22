/**  
 * @Title: CountAndSaySequence.java
 * @Prject: Algorithms
 * @Package: easy
 * @Description: TODO
 * @author: ruins7  
 * @date: Jan 22, 2017 1:55:40 PM
 * @version: V1.0  
 */
package easy;

/**
 * @ClassName: CountAndSaySequence
 * @Description: TODO
 * @author: ruins7
 * @date: Jan 22, 2017 1:55:40 PM
 */
public class CountAndSaySequence {

	/**
	 * @Title: main
	 * @Description: LintCode 420 报数序列
	 * 				 对于每一次的input, 下一个数字的组合都是上一个数字各个数位上的:（重复几次，重复谁）的组合
	 * @param args
	 * @return: void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;// 所求的第几个数 input
		int beginNum = 1;
		String beginString = beginNum + "";
		for (int i = 0; i < n - 1; i++) {
			beginString = countRepeat(beginString);
		}
		System.out.println(beginString);
	}

	public static String countRepeat(String beginString) {
		int repeatNum = 0;
		StringBuffer nextString = new StringBuffer();
		String whoRepeat = beginString.charAt(0) + "";
		for (int j = 0; j < beginString.length(); j++) {
			if ((beginString.charAt(j) + "").equals(whoRepeat)) {
				repeatNum++;
			} else {
				// 循环之后还有数字但是换了不同于之前的数字时的结果组合过程
				nextString.append(repeatNum + "").append(whoRepeat);
				// 计数重置并且+1
				repeatNum = 1;
				whoRepeat = beginString.charAt(j) + "";
			}
		}
		// 之后没有数字跳出循环时对结果的组合过程：（重复几次，重复谁）
		nextString.append(repeatNum + "").append(whoRepeat);
		return nextString.toString();
	}
}
