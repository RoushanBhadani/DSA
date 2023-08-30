package in.arrayList;

import java.util.ArrayList;

public class Find_Minimum {
	public static int minimum(ArrayList<Integer> list) {
		int min = Integer.MAX_VALUE;
		for(int i=0;i<list.size();i++) {
			if(list.get(i)<min) {
				min = list.get(i);
			}
		}
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(9);
		list.add(12);
		list.add(3);
		list.add(5);
		System.out.println(minimum(list));
		
	}
}
