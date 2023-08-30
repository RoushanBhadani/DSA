package in.StringBuffer;

public class StringBufferInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("This is java class");
		System.out.println(sb.insert(4, "zzzzzzz"));
		
		StringBuffer sb1 = sb.insert(4, "zzzz");
		System.out.println(sb1);
		
	}

}
