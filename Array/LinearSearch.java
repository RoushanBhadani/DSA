package in.Array;

public class LinearSearch {
	public static int linearSearch(int arr[],int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == key) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12,2,65,4,8};
		int key = 65;
		int index = linearSearch(arr,key);
		if(index == -1) {
			System.out.println("Element not found in Array");
		}
		else {
			System.out.println("Element found at index : " + index);
		}
	}

}
