package in.linkedlist;

public class ZigZag {
	public class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public static Node head;
	public static Node tail;
	
	public void addLast(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head = tail = newNode;
			return;
		}
		
		tail.next = newNode;
		tail = newNode;
	}
	
	public void print() {
		if(head==null) {
			System.out.println("LL is empty");
			return;
		}
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
		System.out.println("null");
		
	}
	
	public void zigzag() {
		Node slow = head;
		Node fast = head.next;
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		Node mid = slow;
		
		
		
		Node curr = mid.next;
		mid.next = null;
		Node prev = null;
		Node next;
		while(curr!=null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		
		
		
		Node left = head;
		Node right = prev;
		Node newl;
		Node newr;
		while(left!=null && right!=null) {
			newl = left.next;
			left.next = right;
			newr = right.next;
			right.next = newl;
			
			left = newl;
			right = newr;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZigZag zz = new ZigZag();
		zz.addLast(5);
		zz.addLast(4);
		zz.addLast(3);
		zz.addLast(2);
		zz.addLast(1);
		zz.print();
		
		zz.zigzag();
		zz.print();
	}

}
