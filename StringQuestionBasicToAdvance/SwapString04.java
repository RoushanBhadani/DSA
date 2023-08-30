package in.StringQuestionBasicToAdvance;

public class SwapString04 {
	
	public static String swap(String s) {
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Roushan";
		System.out.println(swap(s));
	}

}
