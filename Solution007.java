package LeetCode;

public class Solution007 {
    public static int reverse(int x) {
        long y=0;
        int w=0;

        int x1=Math.abs(x);
        while(x1/10!=0){
        x1=x1/10;
        w++;
        }   
       
      //wλ�������x�����λ��
      
        for(int i=w;i>=0;i--){
            int a=x%10;
            x=x/10;
            y=y+a*(long)Math.pow(10,i); 
            if(y>Integer.MAX_VALUE||y<Integer.MIN_VALUE) return 0;
            } 
        	return (int)y;
        }
}
