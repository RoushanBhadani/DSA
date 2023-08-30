package in.string;

public class SplitString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("If this is the case, then the pattern will be applied at most limit-1 times, the resulting array’s length will not be more than n, and the resulting array’s last entry will contain all input beyond the last matched pattern.");
		StringBuffer sb = new StringBuffer();
		String s[] = str.split(" ");
		sb.append(str);
		
		System.out.println(str);
//		String rev = "";
		
//		for(int i=s.length-1;i>=0;i--) {
//			str += s[i] + " ";
//		}
		
		
	}

}
