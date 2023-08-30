package in.string;

public class StringEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		.equals()
		
		String s1 = "Roushan";
		String s2 = "Bhadani";
		System.out.println(s1.equals(s2));  //false
		String s3 = "Roushan";
		System.out.println(s1.equals(s3));  //true
		
		
//		.equalsIgnoreCase()
		String s4 = "ROUSHAN";
		String s5 = "roushan";
		System.out.println(s4.equalsIgnoreCase(s5));   //true
	}

}
