package in.Array_2D;

public class Rotate90Degree {
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
	public static void rotate90(int arr[][]) {
		int sr=0;
		int sc=0;
		int er=arr.length-1;
		int ec=arr[0].length-1;
		while(sr<=er) {
			for(int i=sc;i<=ec;i++) {
				int temp = arr[sr][i];
				arr[sr][i] = arr[er][i];
				arr[er][i] = temp;
			}
			sr++;
			er--;
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
		int arr[][] = {{1,2,3,4},
				  	   {5,6,7,8},
				       {9,10,11,12},
				       {13,14,15,16}};
		transpose(arr);
		rotate90(arr);
		print(arr);
	}

}
