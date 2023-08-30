package in.Array;

public class LastToFirst {
	public static void lastswap(int arr[]) {
		int a = arr[arr.length -1];
		for(int i=a;i>=0;i--) {
			arr[i] = arr[arr.length-1];
		}
		arr[0] = a;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,4,5,3,7,9};
		lastswap(arr);
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}
	}

}
