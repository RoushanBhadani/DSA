package in.arrayList;
import java.util.ArrayList;
public class PairSumforsoted {

	//--------------BRUTE FORCE APPROACH----------------
//	public static boolean pairsum1(ArrayList<Integer> list,int target) {
//		for(int i=0;i<list.size();i++) {
//			for(int j=i+1;j<list.size();j++) {
//				if(list.get(i)+list.get(j) == target) {
//					return true;
//				}
//			}
//		}
//		return false;
//	}
	
	
//	----------------two-pointer approach----------------
	public static boolean pairsum1(ArrayList<Integer> list,int target) {
		int lp = 0;
		int rp = list.size()-1;
		
		while(lp<rp) {
			if(list.get(lp)+list.get(rp)==target) {
				return true;
			}
			if(list.get(lp)+list.get(rp)<target) {
				lp++;
			}else {
				rp--;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(6);
		list.add(8);
		int target = 14;
		System.out.println(pairsum1(list,target));
	}
}
