package in.StringBuffer;

public class StringBufferSetLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Roushan");
		
		
		sb.setLength(4);
		System.out.println(sb);
		System.out.println(sb.length());
		
		
		
		sb.setLength(14);
		System.out.println(sb);
		System.out.println(sb.length());
		
	}

}
