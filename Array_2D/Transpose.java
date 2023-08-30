package in.Array_2D;

public class Transpose {
	public static void transpose(int arr[][]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(i<j) {
					int temp = arr[i][j];
					arr[i][j]=arr[j][i];
					arr[j][i]=temp;
				}
			}
		}
	}
	public static void print(int arr[][]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{7,2,3,4},
			  	   {5,6,7,8},
			       {9,7,7,12},
			       {7,14,7,16}};
		transpose(arr);
		print(arr);
	}

}
