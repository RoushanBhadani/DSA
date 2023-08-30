package in.linkedlist;

public class RemoveNode {

	public static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	
	public static Node head;
	public static Node tail;
	static int size = 1;
	
	
	public void addFirst(int data) {
		Node newNode = new Node(data);
		
		if(head==null) {
			head=tail=newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
		size++;
	}
	
	
	public void addLast(int data) {
		Node newNode = new Node(data);
		
		if(head==null) {
			head=tail=newNode;
			return;
		}
		
		tail.next = newNode;
		tail = newNode;
		size++;
	}
	
	
	public void addMiddle(int index, int data) {
		if(index==0) {
			addFirst(data);
			return;
		}
		
		Node newNode = new Node(data);
		Node temp = head;
		int tracker = 0;
		
		while(tracker<index-1) {
			temp = temp.next;
			tracker++;
		}
		
		newNode.next = temp.next;
		temp.next = newNode;
		size++;
	}
	
	
	public int removeFirst() {
		if(head==null) {
			System.out.println("LL is Empty");
			return Integer.MAX_VALUE;
		}
		if(size==1) {
			int val = head.data;
			head=tail=null;
			size=0;
			return val;
		}
		
		int val = head.data;
		head = head.next;
		size--;
		return val;
	}
	
	
	public int removeLast() {
		if(head==null) {
			System.out.println("LL is Empty");
			return Integer.MIN_VALUE;
		}
		
		if(size==1) {
			int val = head.data;
			head=tail=null;
			size=0;
			return val;
		}
		
		Node prev = head;
		for(int i=0;i<size-2;i++) {
			prev = prev.next;
		}
		int val = prev.next.data;
		prev.next = null;
		size--;
		return val;
		
	}
	
	
	public void removeMiddle(int index) {
		if(index==0) {
			removeFirst();
			return;
		}
		
		Node temp = head;
		
		for(int i=0;i<index-2;i++) {
			temp = temp.next;
		}
		
		temp.next = temp.next.next;
		size--;
	}
	
	
	public void print() {
		if(head==null) {
			System.out.println("LL is empty");
			return;
		}
		
		Node temp = head;
		
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.print("null");
	}
	
	
	public static void main(String[] args) {
		RemoveNode rn = new RemoveNode();
		rn.addFirst(12); //12
		rn.addFirst(33); //33->12
		rn.addFirst(9); //9->33->12
		rn.addLast(55); //9->33->12->55
		rn.addLast(2); //9->33->12->55->2
		rn.addMiddle(3, 77); //9->33->12->77->55->2
		rn.addMiddle(6,20); //9->33->12->77->55->2->20
		rn.print();
		System.out.println();
		System.out.println("Latest size of the LL : "+rn.size);
		
		
		System.out.println("first element delete : "+rn.removeFirst());
		rn.print();
		System.out.println();
		System.out.println("Latest size of the LL : "+rn.size);
		
		
		
		System.out.println("last element delete : "+rn.removeLast());
		rn.print();
		System.out.println();
		System.out.println("Latest size of the LL : "+rn.size);

		
		rn.removeMiddle(4);
		rn.removeMiddle(2);
		rn.print();
		System.out.println();
		System.out.println("Latest size of the LL : "+rn.size);
	}

}
