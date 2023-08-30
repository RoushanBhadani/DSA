package in.stack;
import java.util.Stack;
public class CountValidParentheses {
	public static int countValid(String str) {
		Stack<Character> s = new Stack<>();
		int count = 0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			
			if(ch == '(') {
				s.push(ch);
			}
			else {
				if(s.isEmpty()) {
					continue;
				}
				if(s.peek() == '(' && ch == ')') {
					s.pop();
					count += 2;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = ")((())(";
		System.out.println(countValid(str));
	}

}
