package in.StringQuestionBasicToAdvance;

public class OccuringCharacter05 {

	public static char occuring(String str) {
		str=str.replaceAll("\\s","");
		int max=-1;
		char ch = ' ';
		int arr[] = new int[127];
		for(int i=0;i<str.length();i++) {
			arr[str.charAt(i)] = arr[str.charAt(i)] + 1;
		}
		
		
		for(int i=0;i<str.length();i++) {
			if(max < arr[str.charAt(i)]) {
				max = arr[str.charAt(i)];
				ch = str.charAt(i);
			}
		}
		return ch;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hey My name is Roushan";
		char ch = occuring(str);
		System.out.println(ch);
	}

}
