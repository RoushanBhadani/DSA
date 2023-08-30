package in.arrayList;
import java.util.ArrayList;
public class ContainerWithMostWater {

//	----------------Brute Force Approach----------------
	
//	public static int containwater(ArrayList<Integer> list) {
//		int maxwater = 0;
//		for(int i=0;i<list.size();i++) {
//			for(int j=i+1;j<list.size();j++) {
//				int ht = Math.min(list.get(i), list.get(j));
//				int width = j-i;
//				int area = ht * width;
//				if(maxwater<area) {
//					maxwater = area;					
//				}
//			}
//		}
//		return maxwater;
//	}
	
	
//	-----------------two-pointer Approach--------------
	
	public static int containwater(ArrayList<Integer> list) {
		int maxwater = 0;
		int lp = 0;
		int rp = list.size()-1;
		while(lp<rp) {
			//calculate area
			int ht = Math.min(list.get(lp),list.get(rp));
			int width = rp-lp;
			int area = ht*width;
			maxwater = Math.max(maxwater, area);
			
			//update pointer
			if(list.get(lp)<list.get(rp)) {
				lp++;
			}else {  //list.get(lp)>list.get(rp)
				rp--;
			}
		}
		return maxwater;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(8);
		list.add(6);
		list.add(2);
		list.add(5);
		list.add(4);
		list.add(8);
		list.add(3);
		list.add(7);
		System.out.println(containwater(list));
		
	}
}