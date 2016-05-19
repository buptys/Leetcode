package LeetCode;

public class Solution014 {
	public String longestCommonPrefix(String[] strs) {
		StringBuffer s= new StringBuffer();
		int N=strs.length;
		int M=Integer.MAX_VALUE;
		if(strs==null|| strs.length==0)
			return "";

		for(int i=0;i<N;i++){
			if(strs[i].length()==0)
				return "";

			if(strs[i].length()<M)
				M=strs[i].length();
		}
		for(int j=0;j<M;j++){

			for(int i=0;i<N-1;i++){    
				if(strs[i].charAt(j)!=strs[i+1].charAt(j))
					return  s.toString();
			}
			s.append(strs[0].charAt(j));
		} 

		return s.toString();
	}
}
