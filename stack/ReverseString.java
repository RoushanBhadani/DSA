package in.stack;
import java.util.*;
public class ReverseString {
	public static String revString(String str) {
		Stack<Character> s = new Stack<>();
		int idx = 0;
		while(idx < str.length()) {
			s.push(str.charAt(idx));
			idx++;
		}
		
		StringBuilder result = new StringBuilder();
		while(!s.isEmpty()) {
			char curr = s.pop();
			result.append(curr);
		}
		
		return result.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcde";
		String result = revString(str);
		System.out.println(result);
	}
}
