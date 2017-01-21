/**  
 * @Title: CompareString.java
 * @Prject: Algorithms
 * @Package: easy
 * @Description: TODO
 * @author: ruins7  
 * @date: Jan 21, 2017 3:21:02 PM
 * @version: V1.0  
 */
package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: CompareString
 * @Description: 
 * @author: ruins7
 * @date: Jan 21, 2017 3:21:02 PM
 */
public class CompareString {

	/**
	 * @Title: main
	 * @Description: LintCode 55
	 * 				A 包含 B 中所有元素(包括重复元素)，不要求连续
	 * @param args
	 * @return: void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A = "ABCDE";
		String B = "ABCD";
		
		List alist = new ArrayList();
		List blist = new ArrayList();
		
		char[] acharlist = A.toUpperCase().toCharArray();
		char[] bcharlist = B.toUpperCase().toCharArray();
		
		for(int i = 0; i < acharlist.length; i++){
			alist.add(acharlist[i]+"");
		}
		for(int i = 0; i < bcharlist.length; i++){
			blist.add(bcharlist[i]+"");
		}
		
		for(int i = 0; i < alist.size(); i++){
			for(int j = 0; j < blist.size(); j++){
				if(alist.get(i).equals(blist.get(j))){
					alist.set(i, "0");
					blist.set(j, "0");
				}
			}
		}
		
		System.out.println(alist);
		System.out.println(blist);
		 
		boolean flag = true;
		for(Object s: blist){
			if(!s.equals("0")){
				flag = false;
			}
		}
		
		System.out.println(flag);
	}
}
