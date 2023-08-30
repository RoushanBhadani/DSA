package in.string;

public class StringCompareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Roushan");
		String s2 = new String("Roushan");
		
		String s3 = new String("Bhadani");
		String s4 = new String("bhadani");
		
		String s5 = new String("bhadani");
		String s6 = new String("Bhadani");
		
		//compareTo return integer value
		//firstly change into unicode then subtract it
		
//		System.out.println(s1.compareTo(s2));    //s1==s2 - same - return 0
//		System.out.println(s3.compareTo(s4));	 //compare first element firstly then second then so on | s3>s4 return -32. 
//		System.out.println(s5.compareTo(s6));	 //compare first element firstly then second then so on | s5<s6 return 32.
		
		String a1 = new String("rKb");
		String a2 = new String("rkb");
		
		System.out.println(a1.compareTo(a2));	//ascii value of K - ascii value of k
		
		System.out.println(a1.compareToIgnoreCase(a2));    
		
		
	}
}
