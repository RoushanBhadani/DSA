package in.Array_2D;

public class MinimumIn2Darray {
	public static int minElement(int arr[][]) {
		int min = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(min>arr[i][j]) {
					min = arr[i][j];
				}
			}
		}
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{1,-9,3,67},{-4,8,-12,9}};
		System.out.println(minElement(arr));
	}

}
