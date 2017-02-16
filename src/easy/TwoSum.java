/**  
 * @Title: TwoSum.java
 * @Prject: Algorithms
 * @Package: easy
 * @Description: TODO
 * @author: ruins7  
 * @date: Feb 15, 2017 6:30:58 PM
 * @version: V1.0  
 */
package easy;

import java.util.HashMap;

/**
 * @ClassName: TwoSum
 * @Description: TODO
 * @author: ruins7
 * @date: Feb 15, 2017 6:30:58 PM
 */
public class TwoSum {

	/**
	 * @Title: main
	 * @Description: LintCode 56
	 * @param args
	 * @return: void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[]{2,8,11,15,1};
		int target = 9;
		int[] indexarr = new int[2];
		
		//indexarr = myMethod(numbers, target, indexarr);
		indexarr = twoSum(numbers, target);
		System.out.println(indexarr[0]+ "  "+indexarr[1]);
	}
	
	/**
	 * @Title: main
	 * @Description:  HashMap method
	 * 				 key  : target - current value
	 * 			     value: index of current value
	 * @param args
	 * @return: void
	 */
	public static int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.get(numbers[i]) != null) {//map.get(key)--根据key取value,同时也可以判断key有没有对应的value
                int[] result = {map.get(numbers[i]) + 1, i + 1};
                return result;
            }
            //当前key下没有对应value
            map.put(target - numbers[i], i);
        }
        int[] result = {};
        return result;
    }
	
	public static int[] myMethod(int[] numbers, int target, int[] indexarr){
		//跳出两层循环的标号
		ok:
		for (int i = 0; i < numbers.length; i++) {
			 int half = target - numbers[i];
			 for (int j = i+1; j < numbers.length; j++) {
				if(numbers[j] == half){
					indexarr[0] = i + 1;
					indexarr[1] = j + 1;
					break ok;
				}
			}
		}
		return indexarr; 
	}

}
