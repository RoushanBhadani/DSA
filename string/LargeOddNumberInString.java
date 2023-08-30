package in.string;
import java.math.BigInteger;
public class LargeOddNumberInString {

//	public static String maxodd(String s) {
//		
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num = "8742";
		int maxodd = Integer.MIN_VALUE;
		for(int i=0;i<num.length();i++) {
			String s = "";
			for(int j=i;j<num.length();j++) {
				s += num.charAt(j);
				int x=Integer.parseInt(s);
				
				if(x%2!=0) {
					maxodd = Math.max(x, maxodd);
				}
			}
		}
		num = Integer.toString(maxodd);
		System.out.println(num);
	}

}
