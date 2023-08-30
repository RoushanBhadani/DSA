package in.StringBuffer;

public class StringBufferCharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("Roushan");
		
		System.out.println(sb.charAt(3));
		
		for(int i=0;i<sb.length();i++) {
			System.out.println(sb.charAt(i));
		}
	}

}
