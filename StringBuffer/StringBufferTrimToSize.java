package in.StringBuffer;

public class StringBufferTrimToSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer(100);   //capacity of the StringBuffer is 100.
		sb.append("Roushan");    //and the string use capacity is 7. and left capacity is waste.
		
		sb.trimToSize();        //this will do Total Capacity(100) - used Capacity(7) = 93 left capacity will trim this method to the size 
//		System.out.println(sb.length());
		
		System.out.println(sb.capacity());
	}

}
