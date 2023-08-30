package in.string;

public class StringJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		join() is a static method which is called directly by class name.(String.join(String delima,string1,string2....))
		
		String s1 = "Roushan";
		String s2 = "Bhadani";
		
		String s = String.join("/",s1,s2);
		System.out.println(s);
		String ss = String.join("/",s1,s2,s1,s2);
		System.out.println(ss);
	}
}
