package in.arrayList;
import java.util.ArrayList;

public class Find_Maximum {
	public static int maximum(ArrayList<Integer> list) {
		int max = Integer.MIN_VALUE;
		for(int i=0;i<list.size();i++) {
			if(list.get(i)>max) {
				max = list.get(i);
			}
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(9);
		list.add(12);
		list.add(3);
		list.add(5);
		System.out.println(maximum(list));
	}
}
