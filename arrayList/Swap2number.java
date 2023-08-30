package in.arrayList;

import java.util.ArrayList;

public class Swap2number {
	public static void swap(ArrayList<Integer> list,int idx1,int idx2) {
		int temp = list.get(idx1);
		list.set(idx1,list.get(idx2));
		list.set(idx2,temp);
		
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(9);
		list.add(12);
		list.add(3);
		list.add(5);
		System.out.println(list);
		swap(list,1,3);
	}
}
