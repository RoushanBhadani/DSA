package in.StringBuffer;

public class StringBufferEnsureCapacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		
		System.out.println(sb.capacity());   //We know the capacity is 16 by default
		
		sb.ensureCapacity(100);    //in this line now the capacity is 100.
		
		System.out.println(sb.capacity());   //it show capacity is 100
	}

}
