package in.Array;

public class PrintAllSubArray {
	public static void printAllsubArray(int arr[]) {
		for(int i=0;i<=arr.length;i++) {
			int start = i;
			for(int j=i+1;j<=arr.length;j++) {
				int next = j;
				for(int k=start;k<next;k++) {
					System.out.print(arr[k]+" ");
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,4,3,7,5,9};
		printAllsubArray(arr);
	}

}
