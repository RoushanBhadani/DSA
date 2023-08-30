package in.StringBuffer;

public class StringBufferDeleteCharAt {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Roushan");
//		System.out.println(sb.deleteCharAt(4));
		
		
		for(int i=0;i<sb.length();i++) {
			System.out.println(sb.deleteCharAt(i));
		}
	}
}
