package in.string;

public class StringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Roushan";
		System.out.println(s1.length());   //length method returns integer value
		
		for(int i=0;i<s1.length();i++) {
			System.out.println(s1.charAt(i));
		}
	}

}
