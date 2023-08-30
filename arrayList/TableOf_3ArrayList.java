package in.arrayList;
import java.util.ArrayList;
public class TableOf_3ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		ArrayList<Integer> list3 = new ArrayList<>();
		
		for(int i=1;i<=5;i++) {
			list1.add(i*1);
			list2.add(i*2);
			list3.add(i*3);
		}
		
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
	}
}
