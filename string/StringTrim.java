package in.string;

public class StringTrim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "   Roushan    ";
		String s2 = "      Roushan bhadani";
		String s3 = "My name is Roushan Bhadani  ";
		System.out.println(s1);    
		System.out.println(s1.trim());  //remove white spaces starting and ending of string
		
		System.out.println(s2.trim());
		
		System.out.println(s3.trim());
	}

}
