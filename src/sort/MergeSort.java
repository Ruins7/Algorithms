/**  
 * @Title: MergeSort.java
 * @Prject: Algorithms
 * @Package: sort
 * @Description: 合并排序算法
 * @author: ruins7  
 * @date: Sep 22, 2016 8:37:34 PM
 * @version: V1.0  
 */
package sort;

import java.util.ArrayList;

/**
 * @ClassName: MergeSort
 * @Description: TODO
 * @author: ruins7
 * @date: Sep 22, 2016 8:37:34 PM
 */
public class MergeSort {

	public static ArrayList<Integer> mergeSort(ArrayList<Integer> a,int beginIndex,int lastIndex){
		 if(beginIndex < lastIndex){
			 int middleIndex = Math.floorDiv(beginIndex + lastIndex, 2);//需要小于或者等于中值的最大整数(向下取整)
			 mergeSort(a, beginIndex, middleIndex);
			 mergeSort(a, middleIndex+1, lastIndex);
			 merge(a, beginIndex, middleIndex, lastIndex);
		 }
		return a;
	}
	
	public static ArrayList<Integer> merge(ArrayList<Integer> a, int beginIndex, int middleIndex, int lastIndex){
		int n1 = middleIndex - beginIndex + 1;
		int n2 = lastIndex - middleIndex;
		ArrayList<Integer> leftList = new ArrayList<Integer>();
		ArrayList<Integer> rightList = new ArrayList<Integer>();
		for (int i = 0; i < n1; i++) {
			leftList.add(a.get(i));
		}
		leftList.add(8888);
		for (int i = n1; i <= n2; i++) {
			rightList.add(a.get(i));
		}
		rightList.add(8888);
		a.clear();
		int i = 0, j = 0;
		while( i <= n1 || j <= n2){
			if(leftList.get(i) == 8888){
				a.addAll(rightList);
				break;
			}else if(rightList.get(j) == 8888){
				a.addAll(leftList);
				break;
			}else if(leftList.get(i) <= rightList.get(j)){
				a.add(leftList.get(i));
				i++;
			}else{
				a.add(rightList.get(j));
				j++;
			}
		}
		a.remove(a.size()-1);//删除哨兵值
		
		return a;
	}
	
	public static void main(String[] args){
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(5);
		a.add(2);
//		a.add(4);
//		a.add(7);
//		a.add(1);
//		a.add(3);
//		a.add(2);
//		a.add(6);
		
		//a = mergeSort(a, 0 ,a.size()-1);
		
		
		merge(a, 0, Math.floorDiv(0 + 1, 2), 1);
		
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
	}
}
