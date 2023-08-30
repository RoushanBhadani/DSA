package in.StringQuestionBasicToAdvance;

public class ReverseString02 {
	
	//using loop         -- in gfg 0.3s
	
	public static String reverse(String s) {
		String temp ="";
		
		for(int i=s.length()-1;i>=0;i--) {
			temp = temp + s.charAt(i);
		}
		return temp;
	}
	
	
	
	//using StringBuffer   -- in gfg 0.15s
	
	public static String rev(String s) {
		StringBuffer sb = new StringBuffer(s);
		return sb.reverse().toString();
	}
	
	
	
	
	//using Swapping      -- in gfg 0.16s
	
	public static String reve(String s) {
		StringBuffer sb = new StringBuffer(s);
		int i=0;
		int j=sb.length()-1;
		while(i<=j) {
			char temp = sb.charAt(i);
			sb.setCharAt(i, sb.charAt(j));
			sb.setCharAt(j, temp);
			
			i++;
			j--;
		}
		return sb.toString();
	}
	
	//main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "I am Roushan";
		
		System.out.println(reverse(s));
		
		System.out.println(rev(s));
		
		System.out.println(reve(s));
	}

}
