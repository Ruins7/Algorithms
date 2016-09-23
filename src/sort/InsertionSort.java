/**  
 * @Title: InsertionSort.java
 * @Prject: Algorithms
 * @Package: sort
 * @Description: 插入排序算法
 * @author: ruins7  
 * @date: Sep 22, 2016 6:43:03 PM
 * @version: V1.0  
 */
package sort;

import java.util.ArrayList;

/**
 * @ClassName: InsertionSort
 * @Descriptio:TODO
 * @author: ruins7
 * @date: Sep 22, 2016 6:43:03 PM
 */
public class InsertionSort {
		
	public static ArrayList<Integer> insertionSort(ArrayList<Integer> a){
		//j=1 : 从第二个元素开始取，第一个不论大小都不用比较
		//j<a.size() : 最后一个元素的序号是a.size()-1,所以不能是 <=
		for (int j = 1; j < a.size(); j++) {
			int key = a.get(j);//提取当前的值
			int i = j-1;//i : 当前值的位置之前的一个值的位置
			while(i >= 0 && a.get(i) > key){//如果之前的值 > 当前值
				a.set(i+1, a.get(i));//大的值向右移动一位
				i--;//指针继续向前移动一位，下次循环继续判断是否 >
			}
			a.set(i+1, key);//直到前面没有比当前值大的值，在此位置插入当前值
		}
		return a;
	}
	
	
	public static void main(String[] args){
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(5);
		a.add(2);
		a.add(4);
		a.add(6);
		a.add(1);
		a.add(3);
		a = insertionSort(a);
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
	}
}
