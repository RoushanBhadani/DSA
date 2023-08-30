package in.circularLL;

public class CircularLL {
	
	public class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public static Node head;
	public static Node tail;
	
	public void addFirst(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head = tail = newNode;
			return;
		}
		
		newNode.next = head;
		head.next = newNode;
		head = newNode;
	}
	
	public void print() {
		if(head==null) {
			System.out.println("ll is empty");
			return;
		}
		
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLL cll = new CircularLL();
		cll.addFirst(1);
		cll.addFirst(2);
		cll.addFirst(3);
		
		cll.print();
	}

}
