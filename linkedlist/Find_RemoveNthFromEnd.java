package in.linkedlist;

public class Find_RemoveNthFromEnd {
	
		//CREATEING NODE------------------------
		public static class Node{
			int data;
			Node next;
		
			public Node(int data){
				this.data = data;
				this.next = null;
			}
		}
		public static Node head;
		public static Node tail;
		
		//ADD ELEMENT IN FIRST------------------
		public void addFirst(int data) {
			//Create new Node
			Node newNode = new Node(data);
			
			//When ll is empty
			if(head == null) {
				head=tail=newNode;
				return;
			}
			
			//newNode link with head node-------
			newNode.next = head;
			//now new node is my head node------
			head = newNode;
		}
		
		public void print() {
			if(head == null) {
				System.out.println("LL is empty");
				return;
			}
			
			Node temp = head;
			while(temp!=null) {
				System.out.print(temp.data+"->");
				temp=temp.next;
			}
			System.out.println("null");
		}
		
		
		public void deleteNthFromEnd(int n) {
			//CALCULATE SIZE
			int size =0;
			Node temp = head;
			while(temp!=null) {
				temp = temp.next;
				size++;
			}
//			System.out.println(size);
			
			
			//If nth is equal to size
			if(n==size) {
				head = head.next;
				return;
			}
			
			
			//size-n
			int i=1;
			int iToSize = size-n;
			
			Node prev = head;
			while(i<iToSize) {
				prev = prev.next;
				i++;
			}
			
			prev.next = prev.next.next;
			return;
		}
	
	public static void main(String[] args) {
		Find_RemoveNthFromEnd af = new Find_RemoveNthFromEnd();
		af.addFirst(12);
		af.addFirst(77);
		af.addFirst(33);
		af.addFirst(74);
		af.addFirst(16);
		af.addFirst(55);
		af.addFirst(86);
		af.print();
		af.deleteNthFromEnd(3);
		af.print();
	}
}