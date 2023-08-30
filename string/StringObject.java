package in.string;

public class StringObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Roushan";  //it make object in scp area under heap area
		String s2 = new String("Roushan");  //it makes two object one in head area and another one is string control pool / literal pool
		String s3 = new String("komal");
		String s4 = new String("Komal");
//		System.out.println(s1==s2);  // false -> the reference are different;  == operator are reference coparison
//		System.out.println(s1.equals(s2));  //true -> .equals() compare element comparsion
		
//		if(s1 == s2) {
//			System.out.println("equal");
//		}else {
//			System.out.println("not equal");
//		}
		
		
//		if(s1.equals(s2)) {
//			System.out.println("equal");
//		}else {
//			System.out.println("not equal");
//		}
		
		System.out.println(s3.equals(s4));  //in this upper and lower case treat as different.
		System.out.println(s3.equalsIgnoreCase(s4));  //in this upper and lower case treat as same.
		
	}

}
