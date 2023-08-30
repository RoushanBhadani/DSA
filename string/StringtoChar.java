package in.string;

public class StringtoChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Roushan";
		String s1 = "1234rkb";
		char[] ch = s.toCharArray();   //convert string to char array
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
		System.out.println();
		char[] ch1 = s1.toCharArray();
		for(int i=0;i<ch1.length;i++) {
			System.out.println(ch1[i]);
		}
		
	}

}
