package in.StringBuffer;

public class StringBufferIndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("This is java tutorial");
		System.out.println(sb.indexOf("i"));
		System.out.println(sb.indexOf("ia"));
		
		
		System.out.println(sb.lastIndexOf("i"));
		System.out.println(sb.lastIndexOf("is"));
	}

}
