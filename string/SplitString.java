package in.string;

public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("If this is the case, then the pattern will be applied at most limit-1 times, the resulting array’s length will not be more than n, and the resulting array’s last entry will contain all input beyond the last matched pattern.");
		
		String s[] = str.split(" "); //jab usse space milega tab split 
//		String s1[] = str.split(" ",5);  // split into 5
		
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
		
		System.out.println();
		
		System.out.println(s[0]);
	}

}
