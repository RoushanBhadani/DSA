package in.Array_2D;

public class StairCaseSearch {
	public static void staircasesearch(int arr[][],int key) {
		int row = 0;
		int col = arr[0].length-1;
		while(row<=arr.length-1 && col>=0) {
			if(arr[row][col]==key) {
				System.out.println(row+","+col);
				break;
			}else if(key<arr[row][col]) {
				col--;
			}else if(key>arr[row][col]) {
				row++;
			}
			else {
				System.out.println("NOT FOUND");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{1,2,3,4},
				  {5,6,7,8},
				  {9,10,11,12},
				  {13,14,15,16}};
		staircasesearch(arr,16);
	}

}
