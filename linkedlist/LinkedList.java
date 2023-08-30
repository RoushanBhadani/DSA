package in.linkedlist;
import java.util.*;
public class LinkedList {
	
	//create node---------------------------
	public static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	//create head and tail-----------------------
	public static Node head;	//head
	public static Node tail;	//tail
	
	//add first-----------------------
	public void addfirst(int data) {
		Node newnode = new Node(data); //step:1- create node
		//one base case agar null node hai too
		if(head==null) {
			head = tail = newnode;
			return;
		}
		newnode.next = head;  //step:2- newnode link with head
		head = newnode;  //step:3- head aab newnode hai
	}
	
	//add last---------------------
	public void addlast(int data) {
		Node newnode = new Node(data);  //step:1- create node
		//one base case agar null node hai too
		if(head == null) {
			head = tail = newnode;
			return;
		}
		tail.next = newnode; //step:2- tail node link with newnode
		tail = newnode;  //step:3- tail aab newnode hai
	}
	
	//print linked list-----------------
	public void print() {
		if(head==null) {
			System.out.println("Linked list is Empty");
			return;
		}
		//make temporary 
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println(" ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		
//		ll.head = new Node(1);
//		ll.head = new Node(2);
		
		ll.addfirst(2);
		ll.addfirst(1);
		ll.addlast(3);
		ll.addlast(4);
		ll.print();
		
	}
}
