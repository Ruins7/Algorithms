/**  
 * @Title: AddDigits.java
 * @Prject: Algorithms
 * @Package: easy
 * @Description: TODO
 * @author: ruins7  
 * @date: Jan 20, 2017 1:11:49 PM
 * @version: V1.0  
 */
package easy;

/**
 * @ClassName: AddDigits
 * @Description: TODO
 * @author: ruins7
 * @date: Jan 20, 2017 1:11:49 PM
 */
public class AddDigits {

	/**
	 * @Title: main
	 * @Description: LintCode 569
	 * @param args
	 * @return: void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 38;
		if(num <= 0){
			System.out.println("num should be greater than 0");
		}else{
			num = addNum(num);
			while((num+"").length() > 1){
				num = addNum(num);
			}
			System.out.println("done");
			 
		}
		
				
	}
	
	public static int addNum(int num){
		/**
		 * String convert to String[]
		 */
		String num_s = num+"";
		String[] ss = new String[num_s.length()];
		char[] numc = num_s.toCharArray();
		for(int i = 0; i < num_s.length(); i++){
			ss[i] = numc[i]+"";
		}
		int add_result = 0;
		for(int i = 0; i< ss.length; i++){
			add_result += Integer.valueOf(ss[i]);
		}
		System.out.println(add_result);
		return add_result;
	}

}
