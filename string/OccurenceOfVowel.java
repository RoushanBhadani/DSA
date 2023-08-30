package in.string;

public class OccurenceOfVowel {
	public static int occurance(String str) {
		int sum =0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch == 'a' || ch == 'e' || ch=='i' || ch == 'o' || ch=='u') {
				sum++;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "rOuShan";
		System.out.println(occurance(str));
	}

}
