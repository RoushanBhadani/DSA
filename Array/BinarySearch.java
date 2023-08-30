package in.Array;

public class BinarySearch {
	
	public static int binary(int arr[], int key) {
		int start = 0;
		int end = arr.length - 1;
		for(int i=0;i<arr.length-1;i++) {
			int mid = (start + end) / 2;
			if(arr[mid] == key) {
				return mid;
			}
			if(arr[mid] < key) {
				start = mid + 1;
			}
			else {
				end = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {9,10,45,55,67,99};
		int key =67;
		int index = binary(arr,key);
		if(index==-1) {
			System.out.println("Element not found");
		}else {
			System.out.println("Element found at : "+index);
		}
	}

}
