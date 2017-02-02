/**  
 * @Title: MajorityNumber.java
 * @Prject: Algorithms
 * @Package: easy
 * @Description: TODO
 * @author: ruins7  
 * @date: Feb 1, 2017 10:08:22 PM
 * @version: V1.0  
 */
package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: MajorityNumber
 * @Description: TODO
 * @author: ruins7
 * @date: Feb 1, 2017 10:08:22 PM
 */
public class MajorityNumber {

	/**
	 * @Title: main
	 * @Description: LintCode 41
	 * @param args
	 * @return: void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> nums = new ArrayList<Integer>();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		nums.add(1);
		nums.add(1);
		nums.add(2);
		nums.add(2);
		nums.add(2);
		nums.add(2);
		nums.add(2);
		
		//map保存每一个数字(key)和它重复的次数(value)
		for (Integer i : nums) {
			if(map.containsKey(i)){
				map.put(i, map.get(i).intValue()+1);
			}else{
				map.put(i, 1);
			}
		}
		int max_key = 0;
		int max_value = 0;
		for (Map.Entry<Integer, Integer> e: map.entrySet()) {
			if(e.getValue() > max_value){
				max_key = e.getKey();
				max_value = e.getValue();
			}
		}
		
		System.out.println("max_key: "+max_key+"; max_value: "+max_value);
	 
	}

}
