package in.StringBuffer;

public class StringToStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 when we use StringBuffer ?
//		---->where the is changing frequently.
		
//		---->In this all method are synchronized and mutable object
		
		String s = new String("Roushan");
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb);
		
	}

}
