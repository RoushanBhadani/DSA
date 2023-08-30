package in.Array;
public class MaxSubArray {
	
	public static void maxSum(int arr[]) {
		int count=0;
		int larValue = Integer.MIN_VALUE;
		for(int i=0;i<=arr.length;i++) {
			int start = i;
			for(int j=i+1;j<=arr.length;j++) {
				int end = j;
//				count = 0;
				for(int k=start;k<end;k++) {
					System.out.print(arr[k]+" ");
					count += arr[k];
				}
//				if(count>larValue) {
//					larValue = count;
//				}
				System.out.println();
			}
		}
		System.out.println(larValue);
	}
    
    public static void main(String args[]){
        int arr[] = {-1,3,5,2,7};
        maxSum(arr);
    }
}
