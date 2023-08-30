package in.string;

public class StringValueof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		String s = String.valueOf(a);   //static method and it will convert any type into string
		System.out.println(s);
		
		char[] ch = {'r','k','b'};
		String s1 = String.valueOf(ch);
		System.out.println(s1);
		
		float f = 11.34f;
		String ss = String.valueOf(f);
		System.out.println(ss);
		
	}

}
