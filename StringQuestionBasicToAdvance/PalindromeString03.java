package in.StringQuestionBasicToAdvance;

public class PalindromeString03 {
	
	

	public static void palindrome(String s) {
		String s2 ="";
		for(int i=s.length()-1;i>=0;i--) {
			s2 += s.charAt(i);
		}
		
		if(s.equals(s2)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}
	
	
	//two pointer approach is best
	public static boolean palindrome2(String s) {
		boolean ans = false;
		int i =0;
		int j = s.length()-1;
		while(i<=j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "12321";
		
		palindrome(s);
		
		if(palindrome2(s)==true) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}

}
