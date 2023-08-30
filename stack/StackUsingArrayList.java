package in.stack;
import java.util.ArrayList; 
public class StackUsingArrayList {
	static class Stack{
		static ArrayList<Integer> list = new ArrayList<>();
		
		//isEmpty
		public static boolean isEmpty() {
			return list.size()==0;
		}
		
		//push
		public static void push(int data) {
			list.add(data);
		}
		
		//pop  
		public static int pop() {
			int val = list.get(list.size()-1);
			list.remove(list.size()-1);
			return val;
		}
		
		//peek --> jakna stack ko upar se 
		public static int peek() {
			return list.get(list.size()-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		System.out.println(s.isEmpty());
		s.push(1);  //1
		s.push(2);  //2 1
		s.push(3);  //3 2 1
		System.out.println(s.isEmpty());
		while(!s.isEmpty()) {
			System.out.println(s.peek());  // 3 then 2 then 1
			s.pop();  //3 deleted 2 deleted 1 deleted
		}
	}
}
