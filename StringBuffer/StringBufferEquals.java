package in.StringBuffer;

public class StringBufferEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Roushan");
		StringBuffer sb1 = new StringBuffer("Roushan");
		
		if(sb==sb1) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}
	
		//In both case equals method override in string Class but not in stringBuffer class
		//that's why output will be false.
		
		if(sb.equals(sb1)) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}
		
		
		//case
		StringBuffer sb3 = new StringBuffer("Roushan");
		StringBuffer sb4 = sb3.append("Bhadani");
		
		if(sb3.equals(sb4)) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}
 	}

}
