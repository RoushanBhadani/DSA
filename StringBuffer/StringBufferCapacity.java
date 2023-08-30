package in.StringBuffer;

public class StringBufferCapacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());    //Default capacity of StringBuffer is 16.
		
		
		StringBuffer sb1 = new StringBuffer("Roushan");
		System.out.println(sb1.capacity());   //16(default)+7(sb1.length())=23
		
		
		StringBuffer sb2 = new StringBuffer(10);
		sb2.append("Roushankb12");
		System.out.println(sb2.capacity());  //when you set the size and you are giving the string 
											 //to extra of size then it will cal. the length and double the capacity 
	
		
		StringBuffer sb3 = new StringBuffer(1000);
		System.out.println(sb3.capacity());
		
		
		StringBuffer sb4 = new StringBuffer(100);
		sb4.append("Roushan");               //if your string is exceed the capacity then it will double it.
											 //but if its not then the capacity is not change.
		System.out.println(sb4.capacity());
		
		
		StringBuffer sb5 = new StringBuffer();
		sb5.append("RoushanRoushanRou");  //only first time it will double the capacity after that it will increase when you increase the string size.
		System.out.println(sb5.capacity());
	}

}
