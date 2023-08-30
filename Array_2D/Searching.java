package in.Array_2D;

public class Searching {
	public static void search(int arr[][],int key) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]==key) {
					System.out.println("Index : "+"("+i+","+j+")");
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] ={{1,2,3},{4,5,6},{9,7,8}};
		search(arr,6);
	}
}
