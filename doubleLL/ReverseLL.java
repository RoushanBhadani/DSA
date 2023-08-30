package in.doubleLL;

public class ReverseLL {
	public class Node{
		int data;
		Node next;
		Node prev;
		public Node(int data) {
			this.data = data;
			this.next = null;
			this.prev = null;
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
		head.prev = newNode;
		head = newNode;
	}
	
	public void print() {
		if(head==null) {
			System.out.println("ll is empty");
			return;
		}
		
		Node temp = head;
		System.out.print("null<->");
		while(temp!=null) {
			System.out.print(temp.data+"<->");
			temp = temp.next;
		}
		System.out.println("null");
	}
	
	
	public void reverse() {
		Node curr = head;
		Node prev = null;
		Node next;
		while(curr!=null) {
			next = curr.next;
			curr.next = prev;
			curr.prev = next;
			prev = curr;
			curr = next;
		}
		head = prev;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseLL rll = new ReverseLL();
		rll.addFirst(1);
		rll.addFirst(2);
		rll.addFirst(3);
		rll.addFirst(4);
		rll.addFirst(5);
		rll.print();
		rll.reverse();
		rll.print();
	}

}
