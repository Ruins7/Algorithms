/**  
 * @Title: InsertInterval.java
 * @Prject: Algorithms
 * @Package: easy
 * @Description: TODO
 * @author: ruins7  
 * @date: Jan 26, 2017 3:04:42 PM
 * @version: V1.0  
 */
package easy;

import java.util.ArrayList;

/**
 * @ClassName: InsertInterval
 * @Description: TODO
 * @author: ruins7
 * @date: Jan 26, 2017 3:04:42 PM
 */
public class InsertInterval {

	/**
	 * @Title: main
	 * @Description: LintCode 30
	 * @param args
	 * @return: void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Interval> result = new ArrayList<Interval>();
		ArrayList<Interval> intervals = new ArrayList<Interval>();
//		intervals.add(new Interval(1, 2));
//		intervals.add(new Interval(3, 4));
//		intervals.add(new Interval(5, 6));
//		intervals.add(new Interval(7, 8));
//		intervals.add(new Interval(9, 10));
//		Interval newInterval = new Interval(4,7);
		
//		intervals.add(new Interval(1, 2));
//		intervals.add(new Interval(5, 9));
		Interval newInterval = new Interval(3,4);
		
		if(intervals.size() != 0){
			int begin = 0;
			for(int i = 0; i < intervals.size(); i++){
				if(newInterval.start <= intervals.get(i).end){
					begin = i;
					break;
				}
			}
			int end = 0;
			for(int i = intervals.size()-1; i >= 0; i--){
				if(newInterval.end >= intervals.get(i).start){
					end = i;
					break;
				}
			}
			System.out.println(begin +"  " +end +"  ----");
			if(begin > end){//直接插入
				//先添加一位长度，用于存放最后一个元素
				intervals.add(null);
				for (int i = begin; i < intervals.size(); i++) {
					Interval newi = intervals.get(i);
					intervals.set(i, newInterval);
					newInterval = newi;
				}
				result = intervals;
			}else{//merge
				Interval connInter = new Interval(intervals.get(begin).start,intervals.get(end).end);
				for (int i = 0; i < begin; i++) {
					result.add(intervals.get(i));
				}
				result.add(connInter);
				for (int i = end+1; i < intervals.size(); i++) {
					result.add(intervals.get(i));
				}
				
			}
			
		}else{
			result.add(newInterval);
		}
		for (Interval interval : result) {
			System.out.println(interval.start+","+interval.end);
		}
		
		 
		
		
	}

}

class Interval {
	int start, end;

	Interval(int start, int end) {
	  this.start = start;
       this.end = end;

	}
}
