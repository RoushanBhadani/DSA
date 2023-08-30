package in.linkedlist;

public class LinkedList03 {
	
	//CREATE NODE------------------------
	
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
	
	//ADD FIRST---------------------------
	public void addFirst(int data) {
		//create new node-------------
		Node newNode = new Node(data);
		
		//when ll is empty------------
		if(head == null) {
			head=tail=newNode;
			return;
		}
		
		//linking---------------------
		newNode.next = head;
		
		//now the newNode is my head node-------------
		head = newNode;
	}
	
	public void addLast(int data) {
		Node newNode = new Node(data);
		
		if(head== null) {
			head=tail=newNode;
			return;
		}
		
		tail.next = newNode;
		tail = newNode;
	}
	
	public void print() {
		
		if(head == null) {
			System.out.println("Linked List is Empty");
			return;
		}
		
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.print("null");
	}
	
	public static void main(String[] args) {
		LinkedList03 ll = new LinkedList03();
		ll.addFirst(1);		// 1->null
		ll.addFirst(2);		// 2->1->null
		ll.addFirst(3);		// 3->2->1->null
													
		ll.addLast(4);		// 3->2->1->4->null
		ll.addLast(5);		// 3->2->1->4->5->null
		
		ll.print();
	}
}
