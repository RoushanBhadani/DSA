package in.Array;

public class KadenAlgo {
	public static int kadenAlgo(int arr[]) {
		int ms = Integer.MIN_VALUE;
		int cs = 0;
		for(int i=0;i<arr.length;i++) {
			cs = cs + arr[i];
			if(cs<0) {
				cs = 0;
			}
			ms = Math.max(cs, ms);
		}
		return ms;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		System.out.println(kadenAlgo(arr));
	}

}
