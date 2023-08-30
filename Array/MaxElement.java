package in.Array;

public class MaxElement {
	public static void maxElement(int arr[]) {
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12,3,44,5,65};
		maxElement(arr);

	}

}
