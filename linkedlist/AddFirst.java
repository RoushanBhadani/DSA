//

package in.linkedlist;

public class AddFirst {
	
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
	
	public static void main(String[] args) {
		AddFirst af = new AddFirst();
		af.addFirst(3);
		af.addFirst(2);
		af.addFirst(1);
		af.print();
	}
}