package Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SageTest2 {
	
	// 二叉树中，求树的各个路径上，最多的数值不同的个数
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree T = new Tree();
		T.x = 4;
		T.l = new Tree();
		T.r = new Tree();
		T.l.x = 5;
		T.r.x = 6;
		T.l.l = new Tree();
		T.r.l = new Tree();
		T.r.r = new Tree();
		T.r.l.x = 1;
		T.r.r.x = 6;
		T.l.l.x = 4;
		T.l.l.l = new Tree();
		T.l.l.l.x = 5;
		
		SageTest2 s = new SageTest2();
		ArrayList<String> list = s.treePaths(T);
		System.out.println(list);
		
		int max = 0;
		for(String eachPath : list){
			String[] eachPathArray = eachPath.split("-");
			List pathListValue = Arrays.asList(eachPathArray);
			Set set = new HashSet(pathListValue);
			if(set.size() > max){
				max = set.size();
			}
		}
		System.out.println(max);	 
	}
	
	public ArrayList<String> treePaths(Tree t) {
        ArrayList<String> pathList = new ArrayList<>();
        if(t == null){
            // empty tree
        		return pathList;
        }   
        String path = "";
        // using recursion to find sub-paths
        recursionPaths(t, pathList, path);
        return pathList;
    }
    
    public void recursionPaths(Tree t, ArrayList<String> pathList, String path){
        if(t == null) {
            // sub tree is an empty tree
        		return;
        }     
        if(t.l == null && t.r == null){
            // sub tree is has no child
            if(path.equals("")){
            	path += t.x;
            }else{
            	path += "-" + t.x;
            }
            // this is the end of one path
            pathList.add(path);
            return;
        }
        if(path.equals("")){
            // this is the beginning of one path
        	path += t.x;
        }else {
        	path += "-" + t.x;
        }
        // left sub-tree first
        recursionPaths(t.l, pathList, path);
        recursionPaths(t.r, pathList, path);
    }
}

class Tree {
	  public int x;
	  public Tree l;
	  public Tree r;
}
