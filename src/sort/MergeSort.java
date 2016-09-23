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
 * @Description: 本算法使用递归思想，即递归将a划分成不可再分的list(就是单元素list,因为单元素可以认为是已经排序好的)
 * 				然后局部merge，注意算法中只能使用set方法来替换原a中的元素。	
 * @author: ruins7
 * @date: Sep 22, 2016 8:37:34 PM
 */
public class MergeSort {

	public static ArrayList<Integer> mergeSort(ArrayList<Integer> a,int beginIndex,int lastIndex){
		 if(beginIndex < lastIndex){//满足条件即list还可以继续被拆分
			 int middleIndex = Math.floorDiv(beginIndex + lastIndex, 2);//需要小于或者等于中值的最大整数(向下取整)
			 mergeSort(a, beginIndex, middleIndex);
			 mergeSort(a, middleIndex+1, lastIndex);
			 merge(a, beginIndex, middleIndex, lastIndex);
		 }
		return a;
	}
	
	public static ArrayList<Integer> merge(ArrayList<Integer> a, int beginIndex, int middleIndex, int lastIndex){
		//分别创建两个list，存储分开的两个list
		int n1 = middleIndex - beginIndex + 1;
		int n2 = lastIndex - middleIndex;
		ArrayList<Integer> leftList = new ArrayList<Integer>();
		ArrayList<Integer> rightList = new ArrayList<Integer>();
		for (int i = beginIndex; i <= middleIndex; i++) {
			leftList.add(a.get(i));
		}
		leftList.add(8888);//哨兵值,取到哨兵值意味着有效元素已经提取完毕
		for (int j = middleIndex+1; j <= lastIndex; j++) {
			rightList.add(a.get(j));
		}
		rightList.add(8888);//哨兵值
		int i = 0, j = 0;//将分开的两个list比较merge到a中
		int k = beginIndex;//替换当前处理的a的那一部分的值的标识位
		while(i <= n1 || j <= n2){//因为有哨兵值,长度比分开之后的list+1,所以<=
			//如果取到哨兵值，则将分开的list中的倒数第二个有效值赋给a中的当前对应位置的后一个位置的值，因为最后一个是哨兵值，注意此时k已经加过1了
			if(leftList.get(i) == 8888){
				a.set(k, rightList.get(rightList.size()-2));
				break;
			}else if(rightList.get(j) == 8888){
				a.set(k, leftList.get(leftList.size()-2));
				break;
			}else if(leftList.get(i) <= rightList.get(j)){//谁小先放谁替换a
				a.set(k, leftList.get(i));
				k++;
				i++;
			}else{
				a.set(k, rightList.get(j));
				k++;
				j++;
			}
		}
		return a;
	}
	
	public static void main(String[] args){
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(5);
		a.add(2);
		a.add(4);
		a.add(7);
		a.add(1);
		a.add(3);
		a.add(2);
		a.add(6);
		a = mergeSort(a, 0 ,a.size()-1);
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
	}
}
