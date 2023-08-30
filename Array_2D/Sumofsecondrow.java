package in.Array_2D;

import java.util.Scanner;

public class Sumofsecondrow {
	public static int sumofsecondrow(int arr[][],int r) {
		int sum =0;
		for(int j=0;j<arr[0].length;j++) {
			sum += arr[r][j];
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[][] = {{1,4,9},{11,4,3},{2,2,3}};
		int r = sc.nextInt();
		System.out.println(sumofsecondrow(arr,r));
	}

}
