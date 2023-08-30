package in.linkedlist;
import java.util.LinkedList;
public class LLInCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll = new LinkedList<>();
		
		//add 
		ll.addFirst(3);
		ll.addFirst(2);
		ll.addFirst(1);
		ll.addLast(4);
		ll.addLast(5);
		System.out.println(ll);
		
		
		//remove
		ll.removeFirst();
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
	}

}
