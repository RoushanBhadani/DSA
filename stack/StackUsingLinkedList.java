package in.stack;

public class StackUsingLinkedList { 
	static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	static class Stack{
		public static Node head = null;
		
		//isEmpty
		static boolean isEmpty() {
			return head == null;
		}
		
		//push
		static void push(int data) {
			Node newNode = new Node(data);
			
			if(isEmpty()) {
				head = newNode;
				return;
			}
			
			newNode.next = head;
			head = newNode;
		}
		
		//pop
		static int pop() {
			if(isEmpty()) {
				return -1;
			}
			
			int val = head.data;
			head = head.next;
			return val;
		}
		
		//peek
		static int peek() {
			if(isEmpty()) {
				return -1;
			}
			
			return head.data;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
	}

}
