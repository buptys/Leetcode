package LeetCode;

public class Solution008 {
	public static int myAtoi(String str){
		
		int n=str.length();
		long sum=0;
		int sign=1;

		if(str == null||n == 0)
		return 0;
		
		int i=0;			
		while(str.charAt(i) == ' ')
			i++;
		if(str.charAt(i) == '+'){
			sign = 1;
			i++;
		}
		else if (str.charAt(i) == '-'){
			sign = -1;
			i++;
		}
		
		for(int j=i;j<n;j++){
			int digit=(int)(str.charAt(j)-'0');
            if(digit < 0 || digit > 9)
            	break;
            sum = sum*10 + digit;
            if(Integer.MAX_VALUE < sum*sign || Integer.MIN_VALUE >sum*sign)
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

		}

		return (int)sum*sign;
	}
}
