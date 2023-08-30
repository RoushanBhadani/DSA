package in.Array;

public class ReverseInArray {
	public static void reverse(int arr[]) {
		int first = 0;
		int last = arr.length - 1;
		int temp = 0;
		while(first<=last) {
			temp = arr[first];
			arr[first] = arr[last];
			arr[last] = temp;
			first++;
			last--;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12,15,22,9,27};
		reverse(arr);
	}

}
