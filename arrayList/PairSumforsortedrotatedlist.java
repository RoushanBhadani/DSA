package in.arrayList;
import java.util.ArrayList;
public class PairSumforsortedrotatedlist {
	public static boolean pairsum2(ArrayList<Integer> list,int target) {
		//find break point
		int bp = -1;
		for(int i=0;i<list.size();i++) {
			if(list.get(i)>list.get(i+1)) {
				bp = i;
				break;
			}
		}
		
		//update pointer
		int lp = bp+1; //smaller
		int rp = bp;  //largest
		int n = list.size();  //size of the list
		while(lp!=rp) {
			if(list.get(lp)+list.get(rp) == target) {
				return true;
			}
			if(list.get(lp)+list.get(rp)<target) {
				lp = (lp+1)%n;
			}else {
				rp = (n+rp-1)%n;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(11);
		list.add(15);
		list.add(6);
		list.add(8);
		list.add(9);
		list.add(10);
		int target = 14;
		System.out.println(pairsum2(list,target));
	}
}
