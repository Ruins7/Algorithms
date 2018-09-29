package Interview;

import java.util.ArrayList;

public class SageTest1 {

	// 二维int数组中，求相邻元素(上下左右)，
	//1.上下最大，左右最小，2.上下最小，左右最大
	// 的元素的个数
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] A = new int[7][4];
		A[0][0] = 0;
		A[0][1] = 1;
		A[0][2] = 9;
		A[0][3] = 3;
				  
		A[1][0] = 7;
		A[1][1] = 5;
		A[1][2] = 8;
		A[1][3] = 3;
				  
		A[2][0] = 9;
		A[2][1] = 2;
		A[2][2] = 9;
		A[2][3] = 4;
		
		A[3][0] = 7;
		A[3][1] = 5;
		A[3][2] = 8;
		A[3][3] = 3;
				  
		A[4][0] = 9;
		A[4][1] = 2;
		A[4][2] = 9;
		A[4][3] = 4;
		
		A[5][0] = 4;
		A[5][1] = 6;
		A[5][2] = 7;
		A[5][3] = 1;
		
		A[6][0] = 4;
		A[6][1] = 6;
		A[6][2] = 7;
		A[6][3] = 1;
		
//		System.out.println(A[0].length);
//		System.out.println(A.length);
		
		ArrayList<Integer> list = new ArrayList<> ();
        for(int a = 0;a < A.length; a++){
            for(int i = 0;i < A[a].length; i++){
                if((a != 0 && a != A.length - 1) && (i != 0 && i != A[0].length - 1)){
                 	System.out.println(A[a][i]+"-"+a+":"+i);
                    if((A[a][i] < A[a][i-1] && A[a][i] < A[a][i+1]) && (A[a][i] > A[a-1][i] && A[a][i] > A[a+1][i])){
                        //System.out.print(A[a][i]+" ");
                        list.add(A[a][i]);
                    }
                    if((A[a][i] > A[a][i-1] && A[a][i] > A[a][i+1]) && (A[a][i] < A[a-1][i] && A[a][i] < A[a+1][i])){
                        //System.out.print(A[a][i]+" ");
                        list.add(A[a][i]);
                    }
                }
            }  
        }  
        System.out.println(list.size()+"-----");
        for(int ss: list){
        		System.out.println(ss);
        }
		
	}
	

}
