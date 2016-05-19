package LeetCode;

public class Solution006 {
    public String convert(String s, int numRows) {
        StringBuffer[] buf = new StringBuffer[numRows];
        char[] a = s.toCharArray();
        
        for(int i=0;i<numRows;i++){
             buf[i]=new StringBuffer();
        }
        int index =0;
        while(index<a.length){
            for(int i=0;i<numRows&&index<a.length;i++){
              buf[i].append(a[index++]);
             
            }
            for(int i=numRows-2;i>0 && index<a.length;i--){
               buf[i].append(a[index++]);
              
            }
            
        }
        for(int i=1;i<numRows;i++){
            buf[0].append(buf[i]);
        }
        return buf[0].toString();
        
        
    }
}
