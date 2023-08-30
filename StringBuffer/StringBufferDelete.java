package in.StringBuffer;

public class StringBufferDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Roushan");
		System.out.println(sb.delete(2, 5));
		
		
		StringBuffer sb1 = new StringBuffer("Roushan");
		StringBuffer s = sb1.delete(2, 5);
		System.out.println(s);
		
		
		StringBuffer sb2 = new StringBuffer("Roushan");
		sb2.delete(2, 5);
		System.out.println(sb2);
	}
}
