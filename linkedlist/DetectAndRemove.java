package in.linkedlist;

public class DetectAndRemove {
	
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
	
	public static void detect() {
		Node slow = head;
		Node fast = head;
		boolean cycle = false;
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
			if(fast == slow) {
				cycle = true;
				break;
			}
		}
		if(cycle==false) {
			return;
		}
		
		slow = head;
		Node prev = fast;
		while(slow!=fast) {
			prev = fast;
			slow = slow.next;
			fast = fast.next;
		}
		
		
		prev.next = null;
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
		System.out.println("null");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DetectAndRemove dar = new DetectAndRemove();
		head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = head.next.next;
		DetectAndRemove.detect();
		dar.print();
	}
}
