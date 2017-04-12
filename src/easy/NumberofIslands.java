/**  
 * @Title: NumberofIslands.java
 * @Prject: Algorithms
 * @Package: easy
 * @Description: TODO
 * @author: ruins7  
 * @date: Feb 16, 2017 10:05:58 PM
 * @version: V1.0  
 */
package easy;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @ClassName: NumberofIslands
 * @Description: TODO
 * @author: ruins7
 * @date: Feb 16, 2017 10:05:58 PM
 */
public class NumberofIslands {

	/**
	 * @Title: main
	 * @Description: LintCode 433 remain to be solved
	 * @param args
	 * @return: void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] grid = {
				{ true, false, false, true, true, true, false, true, true, false, false, false, false, false, false, false, false, false, false, false },
				{ true, false, false, true, true, false, false, true, false, false, false, true, false, true, false, true, false, false, true, false },
				{ false, false, false, true, true, true, true, false, true, false, true, true, false, false, false, false, true, false, true, false },
				{ false, false, false, true, true, false, false, true, false, false, false, true, true, true, false, false, true, false, false, true },
				{ false, false, false, false, false, false, false, true, true, true, false, false, false, false, false, false, false, false, false, false },
				{ true, false, false, false, false, true, false, true, false, true, true, false, false, false, false,
						false, false, true, false, true },
				{ false, false, false, true, false, false, false, true, false, true, false, true, false, true, false,
						true, false, true, false, true },
				{ false, false, false, true, false, true, false, false, true, true, false, true, false, true, true,
						false, true, true, true, false },
				{ false, false, false, false, true, false, false, true, true, false, false, false, false, true, false,
						false, false, true, false, true },
				{ false, false, true, false, false, true, false, false, false, false, false, true, false, false, true,
						false, false, false, true, false },
				{ true, false, false, true, false, false, false, false, false, false, false, true, false, false, true,
						false, true, false, true, false },
				{ false, true, false, false, false, true, false, true, false, true, true, false, true, true, true,
						false, true, true, false, false },
				{ true, true, false, true, false, false, false, false, true, false, false, false, false, false, false,
						true, false, false, false, true },
				{ false, true, false, false, true, true, true, false, false, false, true, true, true, true, true, false,
						true, false, false, false },
				{ false, false, true, true, true, false, false, false, true, true, false, false, false, true, false,
						true, false, false, false, false },
				{ true, false, false, true, false, true, false, false, false, false, true, false, false, false, true,
						false, true, false, true, true },
				{ true, false, true, false, false, false, false, false, false, true, false, false, false, true, false,
						true, false, false, false, false },
				{ false, true, true, false, false, false, true, true, true, false, true, false, true, false, true, true,
						true, true, false, false },
				{ false, true, false, false, false, false, true, true, false, false, true, false, true, false, false,
						true, false, false, true, true },
				{ false, false, false, false, false, false, true, true, true, true, false, true, false, false, false,
						true, true, false, false, false } };

		// boolean[][] grid = { { true, true, false, false, false }, { true,
		// true, false, false, true },
		// { false, false, true, true, true }, { true, false, false, false,
		// false },
		// { false, false, false, false, true } };
		LinkedList<int[]> list = new LinkedList<int[]>();

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == true) {
					int[] ij = { i, j };
					list.add(ij);
				}
			}
		}
		System.out.println(list.size());
		LinkedList<int[]> list2 = new LinkedList<int[]>();
		for (int i = 0; i < list.size(); i++) {
			//System.out.println("curr: " + list.get(i)[0] + list.get(i)[1]);
			int[] down = { list.get(i)[0] + 1, list.get(i)[1] };
			int[] right = { list.get(i)[0], list.get(i)[1] + 1 };
			Iterator<int[]> it = list.iterator();
			while (it.hasNext()) {
				int[] j = it.next();
				if (j[0] == right[0] && j[1] == right[1]) {
					//System.out.println("--right: " + j[0] + j[1]);
					list2.add(j);
				}
				if (j[0] == down[0] && j[1] == down[1]) {
					//System.out.println("--down: " + j[0] + j[1]);
					list2.add(j);
				}
			}
		}
		System.out.println(list2.size());
		for (int i = list2.size() - 1; i >= 0; i--) {
			int[] up = { list2.get(i)[0] - 1, list2.get(i)[1] };
			int[] left = { list2.get(i)[0], list2.get(i)[1] - 1 };
			Iterator<int[]> it = list.iterator();
			while (it.hasNext()) {
				int[] j = it.next();
				if (j[0] == up[0] && j[1] == up[1]) {
					it.remove();
				}
				if (j[0] == left[0] && j[1] == left[1]) {
					it.remove();
				}
			}
		}
		System.out.println(list.size());
	}

}
