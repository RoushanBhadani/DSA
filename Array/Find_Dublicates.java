package in.Array;

public class Find_Dublicates {
	public static int dublicates(int arr[]) {
		for(int i=0;i<=arr.length-1;i++) {
			int first = arr[i];
			for(int j=i+1;j<arr.length;j++) {
				int next = arr[j];
				if(first == next) {
					return i;
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {6,8,1,2,3,1};
		System.out.println(dublicates(arr));
	}
}
