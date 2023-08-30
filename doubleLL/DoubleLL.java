package in.doubleLL;

public class DoubleLL {
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
	public static int size = 0;
	
	public void addFirst(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head = tail = newNode;
			return;
		}
		
		newNode.next = head;
		head.prev = newNode;
		head = newNode;
		
		size++;
	}
	
	public void addLast(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head = tail = newNode;
			return;
		}
		
		tail.next = newNode;
		newNode.prev = tail;
		tail = newNode;
		
		size++;
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
	
	public int removefirst() {
		if(head==null) {
			System.out.println("ll is empty");
			return Integer.MIN_VALUE;
		}
		
		if(size==1) {
			int val = head.data;
			head = tail = null;
			size--;
			return val;
		}
		
		int val = head.data;
		head = head.next;
		head.prev = null;
		size--;
		return val;
	}
	
	public int removelast() {
		if(head==null) {
			System.out.println("ll is empty");
			return Integer.MAX_VALUE;
		}
		
		if(size==1) {
			int val = tail.data;
			head = tail = null;
			size--;
			return val;
		}
		
		int val = tail.data;
		tail = tail.prev;
		tail.next = null;
		return val;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleLL dll = new DoubleLL();
		dll.addLast(6);  //6 
		dll.addFirst(1); //1,6
		dll.addFirst(2); //2,1,6
		dll.addFirst(3); //3,2,1,6
		dll.addFirst(4); //4,3,2,1,6
		dll.addLast(8);  //4,3,2,1,6,8
		dll.print();
		System.out.println(dll.removefirst());
		dll.print();
		System.out.println(dll.removelast());
		dll.print();
	}
}
