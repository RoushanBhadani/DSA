package in.sorting;

public class Bubble_Class {
	public static void bubbleSort(int arr[]) {
		for(int turn=0;turn<arr.length-1;turn++) {
			for(int j=0;j<arr.length-1-turn;j++) {
				if(arr[j]<arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	public static void printArr(int arr[]) {
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,5,3,1,8,4};
		bubbleSort(arr);
		printArr(arr);
	}

}
