package in.linkedlist;

public class Palindrome {
	public static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	public static Node head;
	public static Node tail;
	
	public void addFirst(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head=tail=newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
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
	
	
	
	//------------------------------------FIND MID---------------------------------------------
//	public Node findMid(Node head) {
//		Node slow = head;
//		Node fast = head;
//		
//		while(fast != null && fast.next != null) {
//			slow = slow.next;
//			fast = fast.next.next;
//		}
//		return slow;
//	}
	
	
	//-------------------------------------PALINDROME---------------------------------------
	public boolean palindrome() {
		if(head==null && head.next==null) {
			return true;
		}
		
		//STEP:-1   FIND MID
//		Node midnode = findMid(head);
		
		Node slow = head;
		Node fast = head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		Node midnode = slow;
		
		
		
		//STEP:-2   Reverse 2nd half
		Node prev = null;
		Node curr = midnode;
		Node next;
		
		while(curr!=null) {
			next= curr.next;
			curr.next=prev;
			prev = curr;
			curr=next;
		}
		Node right=prev;
		Node left=head;
	
		
		//STEP:-3  COMPARE LEFT HALF AND RIGHT HALF
		while(right!=null) {
			if(left.data!=right.data) {
				return false;
			}
			left=left.next;
			right=right.next;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome fm = new Palindrome();
		fm.addFirst(1);
		fm.addFirst(3);
		fm.addFirst(2);
//		fm.addFirst(2);
		fm.addFirst(3);
		fm.addFirst(1);
		fm.print();
		
		System.out.println(fm.palindrome());
	}

}
