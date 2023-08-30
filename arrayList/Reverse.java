package in.arrayList;

import java.util.ArrayList;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(9);
		list.add(12);
		list.add(3);
		list.add(5);
		System.out.println(list);
		for(int i=list.size()-1;i>=0;i--) {
			System.out.print(list.get(i)+" ");
		}
	}
}
