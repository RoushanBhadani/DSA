package in.Array;

public class MiniElement {
	public static void miniElement(int arr[]) {
		int min = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println(min);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12,-5,87,4,9};
		miniElement(arr);
	}
}
