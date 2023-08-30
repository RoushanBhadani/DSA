package in.Array;

public class PairInSum {

	public static void pair(int arr[]) {
		int countPair = 0;
		for(int i=0;i<=arr.length-1;i++){
			int start = arr[i];
			for(int j=i+1;j<=arr.length-1;j++) {
				int end = arr[j];
				System.out.print("("+arr[i]+","+arr[j]+")");
				countPair++;
			}
			System.out.println();
		}
		System.out.println("Total pair : "+countPair);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,4,3,1,5,6};
		pair(arr);
	}

}
