package in.Array_2D;
import java.util.Scanner;
public class InputOutput {
	public static void input(int arr[][]) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
	}
	public static void output(int arr[][]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[3][3];
		input(arr);
		output(arr);
	}

}
