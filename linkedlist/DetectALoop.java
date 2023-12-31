package in.linkedlist;

public class DetectALoop {
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
	
//	public void addFirst(int data) {
//		Node newNode = new Node(data);
//		if(head==null) {
//			head = tail = newNode;
//			return;
//		}
//		
//		newNode.next = head;
//		head = newNode;
//	}
//	
//	public void print() {
//		if(head==null) {
//			System.out.println("ll is empty");
//			return;
//		}
//		Node temp = head;
//		while(temp!=null) {
//			System.out.print(temp.data+"->");
//			temp = temp.next;
//		}
//		System.out.println("null");
//	}
	public static boolean isCycle() {
		Node slow = head;
		Node fast = head;
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow==fast) {
				return true;
			}
		}
		return false;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = head.next;
		System.out.println(isCycle());
	}

}
