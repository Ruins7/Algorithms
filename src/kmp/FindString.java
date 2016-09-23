package kmp;
/**
 * 对于一个给定的 source 字符串和一个 target 字符串，
 * 你应该在 source 字符串中找出 target 字符串出现的第一个位置(从0开始)。
 * 如果不存在，则返回 -1。
 * @author ruins7
 *
 */

public class FindString {
       public static void main(String[] arg){
    	   
    	        String source = "tartarget";
    	        String target = "target";
    	        System.out.println(stringFinder(source, target));
       }
       
      public static int stringFinder(String source, String target){
	  if(source == null || target == null){
		  return -1;
	  }else {
    	     char[] s = source.toCharArray();
	     char[] t = target.toCharArray();
	        
	        int i =0 ,j= 0,flag = 0,position = 0;
	         
	        while(i < s.length && j < t.length){
	        	      if(s[i] == t[j]) {
	        	    	      i++;
	        	    	      j++;
	        	    	      flag++;
	        	      } else {
	        	    	      i++;//这个例子有问题
	        	    	      j = 0;
	        	    	      flag = 0;
	        	      }
	        	      if(flag == t.length){
	        	    	      position = i;
	        	      }
	        }
	        if (flag == target.length()) {
				 return position-t.length;
		} else {
			 return -1;
		}	  
      }
      }
}
       


