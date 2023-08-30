package in.Array_2D;

public class Array_7s {
	public static int noOf7s(int arr[][],int x) {
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j] == x) {
					count++;
				}
			}
		}
		return count;
	}
	public static void main(String args[]) {
		int arr[][] = {{7,2,3,4},
			  	   {5,6,7,8},
			       {9,7,7,12},
			       {7,14,7,16}};
		System.out.println(noOf7s(arr,7));
	}
}
