package in.string;

public class ReverseStringBest {

	public static String reverseword(String s) {
		String st[] = s.split(" ");
		
		int start =0;
		int end = st.length-1;
		
		while(start<=end) {
			String temp = st[start];
			st[start] = st[end];
			st[end] = temp;
			start++;
			end--;
		}
		
		return String.join(" ",st);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("I am roushan bhadani");
		
		System.out.println(reverseword(s));
	}

}
