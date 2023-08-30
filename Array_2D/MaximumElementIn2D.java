package in.Array_2D;

public class MaximumElementIn2D {
	public static int maximumelement(int arr[][]) {
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]>max) {
					max = arr[i][j];
				}
			}
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{1,2,3},{-6,-7,88},{76,44,34}};
		System.out.print(maximumelement(arr));
	}
}

