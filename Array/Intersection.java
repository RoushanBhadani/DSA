package in.Array;
import java.util.*;
public class Intersection {
	public static void intersection(int arr1[],int arr2[]) {
		for(int i=0;i<arr1.length;i++) {
			int first=arr1[i];
			for(int j=0;j<arr2.length;j++) {
				int next = arr2[j];
				if(first == next) {
					System.out.print(first+" ");
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr1[] = {1,9,2,8,3};
		int arr2[] = {4,7,5,6,2,9};
		intersection(arr1,arr2);
	}

}
