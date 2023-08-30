package in.Array_2D;

public class SpiralMatrix {
	
	public static void spiralmatrix(int arr[][]) {
		int startRow = 0;
		int startCol = 0;
		int endRow = arr.length - 1;
		int endcol = arr[0].length - 1;
		while(startRow<=endRow && startCol<=endcol) {
		for(int i=startCol;i<=endcol;i++) {
			System.out.print(arr[startRow][i]+" ");
		}
		for(int j=startRow+1;j<=endRow;j++) {
			System.out.print(arr[j][endcol]+" ");
		}
		for(int i=endcol-1;i>=startCol;i--) {
			if(startRow == endRow) {
				break;
			}
			System.out.print(arr[endRow][i]+" ");
		}
		for(int j=endRow-1;j>=startRow+1;j--) {
			if(startCol == endcol) {
				break;
			}
			System.out.print(arr[j][startCol]+" ");
		}
		startRow++;
		startCol++;
		endRow--;
		endcol--;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		spiralmatrix(arr);
	}

}
