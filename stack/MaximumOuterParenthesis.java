package in.stack;
import java.util.Stack;
public class MaximumOuterParenthesis {
	
	public static void maxParenthesis(String s) {
		Stack<Character> st = new Stack<>();
		
		int count = 0;
		for(int i =0;i<s.length();i++) {
			char ch = s.charAt(i);
			
			if(ch == '(') {
				st.push(ch);
			}
			else if(ch == ')') {
				if(count<st.size()) {
					count = st.size();
				}
				st.pop();
			}
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("((a))(((a+b)))");
		maxParenthesis(s);
	}

}
