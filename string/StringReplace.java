package in.string;

public class StringReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String s = "This is java class";
		
		System.out.println(s.replace("is", "was"));  //in this method we are not using regex
		
		System.out.println(s.replaceFirst("a", "x"));   //in this we provide regex and only first will replace
		
		System.out.println(s.replaceFirst("as", "&")); 
		
		System.out.println(s.replaceAll("a", "@"));
		
		System.out.println(s.replaceAll("a(.)", "@"));   //when we found a then it will replace a as well as next of a.
		
		System.out.println(s.replaceAll("a(.*)", "@"));    //when we found a it will replace @ and then remove left string.
		
	}
}
