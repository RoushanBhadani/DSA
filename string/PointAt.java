package in.string;

public class PointAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("Roushan");
		for(int i=0;i<str.length();i++) {
			int result = str.codePointAt(i);  // it will print the ascii value of character	
			System.out.println(result);
		}
		System.out.println();
		for(int i=0;i<str.length();i++) {
			int result1 = str.codePointBefore(i+1);
			System.out.println(result1);
		}
		System.out.println();
		
		int result = str.codePointCount(0,4);
		System.out.println(result);
		System.out.println(str.codePointCount(2,5));
		
	}

}
