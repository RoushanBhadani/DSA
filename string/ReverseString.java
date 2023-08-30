package in.string;

public class ReverseString {
	
	public static String reverse(String s) {
		String st[] = s.split(" ");
		String rev = "";
		
		for(int i=st.length-1; i>=0; i--) {
			rev += st[i] + " ";
		}
		return rev.substring(0, rev.length()-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("I am Roushan bhadani");
		
		System.out.println(reverse(s));
	}
}
