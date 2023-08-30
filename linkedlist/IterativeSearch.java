package in.linkedlist;

public class IterativeSearch {
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
	static int size=1;
	
	
	public void addFirst(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head=tail=newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
		size++;
	}
	
	public void addLast(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head=tail=newNode;
			return;
		}
		
		tail.next = newNode;
		tail = newNode;
		size++;
	}
	
	public void addMiddle(int index,int data) {
		if(index == 0) {
			addFirst(data);
			return;
		}
		
		Node newNode = new Node(data);
		Node temp = head;
		int i=0;
		
		while(i<index-1) {
			temp = temp.next;
			i++;
		}
		
		newNode.next = temp.next;
		temp.next = newNode;
		size++;
	}
	
	public void print() {
		if(head==null) {
			System.out.println("ll is empty");
			return;
		}
		
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.print("null");
	}
	
	
//	----------------------------ITERATIVE SEARCH---------------------------------------
	public int search(int key) {
		Node temp = head;
		int index=0;
		
		while(temp!=null) {
			if(temp.data==key) {
				return index;
			}
			temp = temp.next;
			index++;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		IterativeSearch fs = new IterativeSearch();
		fs.addFirst(3);
		fs.addFirst(2);
		fs.addFirst(1);
		fs.addLast(5);
		fs.addLast(6);
		fs.addMiddle(3, 4);
		fs.addMiddle(6, 7);
		fs.print();
		System.out.println();
		System.out.println("At index : "+fs.search(5));
		
	}
}
