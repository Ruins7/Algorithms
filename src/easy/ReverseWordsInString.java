/**  
 * @Title: ReverseWordsInString.java
 * @Prject: Algorithms
 * @Package: easy
 * @Description: TODO
 * @author: ruins7  
 * @date: Feb 11, 2017 1:47:14 PM
 * @version: V1.0  
 */
package easy;

import java.util.ArrayList;

/**
 * @ClassName: ReverseWordsInString
 * @Description: TODO
 * @author: ruins7
 * @date: Feb 11, 2017 1:47:14 PM
 */
public class ReverseWordsInString {

	/**
	 * @Title: main
	 * @Description: LintCode 53
	 * 				subStrign()----包前不包后
	 * @param args
	 * @return: void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "How are you?";
		System.out.println(reverseString(s));
	}
	
	public static String reverseString(String s){
		
		String news = "";
		int end = s.length();
		int begin = 0;
		if(s.equals("")){
			return news;
		}
		ArrayList list = new ArrayList();
		for (int i = 0; i < s.trim().length(); i++) {
			if(s.charAt(i) == ' '){
				list.add(i);
			}
		}
		if(list.isEmpty()){
			return s.trim();
		}
		for (int j = list.size()-1; j >= 0 ; j--) {
			begin = (int) list.get(j);
			news += s.substring(begin+1, end)+" ";
			end = begin;
			System.out.println(news);
		}
		news += s.substring(0, (int) list.get(0));
		return news;
		
	}

}
