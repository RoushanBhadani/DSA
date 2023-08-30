package in.Array;

public class SuminArray {
	public static int SubArraySum(int arr[],int s) {
		int j=0;
		int sum =0;
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
			for(j=i+1;j<arr.length;j++) {
				sum = sum + arr[j];
				if(sum == s) {
					return i+1;
				}
			}
			sum = 0;
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		int s = 9;
		int sas = SubArraySum(arr,s);
		System.out.println(sas);
	}

}
