package LeetCode;

public class Solution013 {
	public int romanToInt(String s) {
		int a=0;
		int L=s.length();
		for(int i=0;i<L;i++){
			if(s.charAt(i)=='M'){
				a=a+1000;
			}
			if(s.charAt(i)=='D'){
				a=a+500;
			}
			if(s.charAt(i)=='C'){
				if(i<(L-1)&&s.charAt(i+1)=='M'){
					a=a+900; 
					i++;
				}
				else if(i<(L-1)&&s.charAt(i+1)=='D'){
					a=a+400;
					i++;
				}
				else
					a=a+100;
			}
			if(s.charAt(i)=='L'){
				a=a+50;
			}
			if(s.charAt(i)=='X'){
				if(i<(L-1)&&s.charAt(i+1)=='C'){
					a=a+90; 
					i++;
				}
				else if(i<(L-1)&&s.charAt(i+1)=='L'){
					a=a+40;
					i++;
				}
				else
					a=a+10;
			}
			if(s.charAt(i)=='V'){
				a=a+5;
			}
			if(s.charAt(i)=='I'){
				if(i<(L-1)&&s.charAt(i+1)=='X'){
					a=a+9; 
					i++;
				}
				else if(i<(L-1)&&s.charAt(i+1)=='V'){
					a=a+4;
					i++;
				}
				else
					a=a+1;
			}


		}		
		return a;
	}
}
