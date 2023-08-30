package in.string;

public class StringisEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "";
		String s2 = "Roushan";
		String s3 = null;
		
		System.out.println(s1.isEmpty());  // isEmpty() return boolean value
		System.out.println(s2.isEmpty());
//		System.out.println(s3.isEmpty());  //Null pointer Exception--> it will handle by programmer.
		
		if(s1.isEmpty()) {
			System.out.println("Empty");
		}
	}
}
