/**  
 * @Title: CountOneInBinary.java
 * @Prject: Algorithms
 * @Package: easy
 * @Description: TODO
 * @author: ruins7  
 * @date: Jan 22, 2017 1:41:24 PM
 * @version: V1.0  
 */
package easy;

/**
 * @ClassName: CountOneInBinary
 * @Description: TODO
 * @author: ruins7
 * @date: Jan 22, 2017 1:41:24 PM
 */
public class CountOneInBinary {

	/**
	 * @Title: main
	 * @Description: LintCode 365
	 * 				在二进制中找1的个数
	 * @param args
	 * @return: void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	String binarys = Integer.toBinaryString(5);
		 	int onenum = 0;
		 	for(int i = 0; i < binarys.length(); i++){
		 		if(binarys.charAt(i) == '1'){
		 			onenum++;
		 		}
		 	}
			System.out.println(onenum);		
	}

}
