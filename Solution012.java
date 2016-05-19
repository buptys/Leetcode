package LeetCode;

public class Solution012 {
	public String intToRoman(int num) {
		StringBuffer s =new StringBuffer();
		if(num==0)
			return null;
		int res = num;
		if(res/1000!=0){
			int n1=res/1000;
			for(int i=0;i<n1;i++){
				s.append('M');
			}
			res=res%1000;
		}
		if(res/100!=0){
			int n2=res/100;
			if(n2>=1&&n2<=3){
				for(int i=0;i<n2;i++){
					s.append('C');
				}
			}
			if(n2==4)
				s.append("CD");

			if(n2>=5&&n2<=8){

				s.append("D");
				for(int i=5;i<n2;i++){
					s.append('C');
				}
			}
			if(n2==9)
				s.append("CM");	
			res=res%100;
		}
		if(res/10!=0){
			int n3=res/10;
			if(n3>=1&&n3<=3){
				for(int i=0;i<n3;i++){
					s.append('X');
				}
			}
			if(n3==4)
				s.append("XL");

			if(n3>=5&&n3<=8){

				s.append("L");
				for(int i=5;i<n3;i++){
					s.append('X');
				}
			}
			if(n3==9)
				s.append("XC");	
			res=res%10;
		}
		if(res!=0){
			int n4=res;
			if(n4>=1&&n4<=3){
				for(int i=0;i<n4;i++){
					s.append('I');
				}
			}
			if(n4==4)
				s.append("IV");

			if(n4>=5&&n4<=8){
				s.append("V");
				for(int i=5;i<n4;i++){
					s.append('I');
				}
			}
			if(n4==9)
				s.append("IX");	

		}
		return s.toString();
	}
}
