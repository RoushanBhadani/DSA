package in.stack;
import java.util.*;

public class PushAtBottom {
	public static void pAtB(Stack<Integer> s,int data) {
		if(s.isEmpty()) {
			s.push(data);
			return;
		}
		int top = s.pop();
		pAtB(s, data);
		s.push(top);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		
		pAtB(s, 4);
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
	}
}
