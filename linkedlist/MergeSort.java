package in.linkedlist;


public class MergeSort {

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
	
	public void addFirst(int data) {
		
		Node newNode = new Node(data);
		
		if(head == null) {
			head = tail = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
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
	
	public Node getMid(Node head) {
		Node slow = head;
		Node fast = head.next;
		
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return slow;
	}
	
	
	public Node merge(Node head1,Node head2) {
		Node mergell = new Node(-1);
		Node temp = mergell;
		
		while(head1!=null && head2!=null) {
			if(head1.data<=head2.data) {
				temp.next = head1;
				head1 = head1.next;
				temp = temp.next;
			}else {
				temp.next = head2;
				head2 = head2.next;
				temp = temp.next;
			}
		}
		// left out in first half
		while(head1!=null) {
			temp.next = head1;
			head1 = head1.next;
			temp = temp.next;
		}
		//left out in second half
		while(head2!=null) {
			temp.next = head2;
			head2 = head2.next;
			temp = temp.next;
		}
		return mergell.next;
	}
	
	public Node mergeSort(Node head) {
		if(head==null || head.next==null) {
			return head;
		}
		//find mid
		Node mid = getMid(head);
		//divide 1st half and 2nd half
		Node righthead = mid.next;   // 2nd half head
		mid.next = null; //break 
		Node newLeft = mergeSort(head);
		Node newRight = mergeSort(righthead);
		//merge
		return merge(newLeft,newRight);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeSort ms = new MergeSort();
		ms.addFirst(2);
		ms.addFirst(6);
		ms.addFirst(1);
		ms.addFirst(9);
		ms.addFirst(7);
		ms.head = ms.mergeSort(ms.head);
		ms.print();
	}
}
