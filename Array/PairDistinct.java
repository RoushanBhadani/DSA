package in.Array;
import java.util.*;

public class PairDistinct {
	
	
	
//	Time complexity : O(n^2)
//	public static void findpair(int[] arr) {
//		for(int i=0;i<arr.length-1;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]==arr[j]) {
//					System.out.println("True");
//					System.exit(0);
//				}
//			}
//		}
//		System.out.println("False");
//	}
	
//	---------------optimize way--------------
	
	
//	Time complexity : O(n).
	public static void findpair(int[] arr) {
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=1;i<arr.length;i++) {
			if(arr[i]==arr[i-1]) {
				System.out.println("True");
				System.exit(0);
			}
		}
		System.out.println("Flase");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,6,7,2,6};
		findpair(arr);
	}
}
