package in.stack;
import java.util.*;
public class ReverserStack {
	public static void pAtB(Stack<Integer> s, int data) {
		if(s.isEmpty()) {
			s.push(data);
			return;
		}
		int top = s.pop();
		pAtB(s,data);
		s.push(top);
	}
	public static void reverseStack(Stack<Integer> s) {
		if(s.isEmpty()) {
			return;
		}
		int top = s.pop();
		reverseStack(s);
		pAtB(s,top);
	}
	public static void printStack(Stack<Integer> s) {
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<>();
		s.push(3);
		s.push(2);
		s.push(1);
		reverseStack(s);
		printStack(s);
	}

}
