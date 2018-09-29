package Interview;

public class SageTest3 {
	
	//Partition an array, where highest value of A is smaller than lowest in B
	// 一个整形数组中，找出某一连续部分的最大值 < 某一连续部分的最小值

	public static void main(String[] args) {
	    int[] T = new int[]{-5, -5, -5, -42, 6, 12, -1000};
	    int summerBegin = 1;// could less than 1 day
	    int winterMax = T[0];
	    int allMax = T[0];

	    int t = 0;
	    for(int i = 0; i < T.length; i++){
	    		t = T[i];
	    		if (t <= winterMax) {
	    			summerBegin = i + 1;
	    			winterMax = allMax;
	        } else if (t > allMax) {
	        		allMax = t;
	        }
	    }
	    System.out.println(summerBegin);
	}
}
