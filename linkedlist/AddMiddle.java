package in.linkedlist;

public class AddMiddle {
	public static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.data = data;
		}
	}
	
	public static Node head;
	public static Node tail;
	static int size=1;
	
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
	
	public void addmiddle(int index,int data) {
		if(index==0) {
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
		
		newNode.next=temp.next;
		temp.next=newNode;
		size++;
		
	}
	public void print() {
		if(head==null) {
			System.out.print("LL is Empty");
		}
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
		
		System.out.print("null");
	}
	public static void main(String[] args) {
		AddMiddle am = new AddMiddle();
		am.addFirst(1);
		am.addFirst(2);
		am.addmiddle(1, 6);
		am.addmiddle(1, 8);
		am.print();
		System.out.println();
		System.out.println("size : "+am.size);
		
	}

}
