package in.Array;

public class NextGreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {6,2,9,1,3};
		int ans = -1;
		for(int i=0;i<arr.length;i++) {
			if(i == arr.length-1) {
				arr[i] = -1;
				break;
			}
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] < arr[j]) {
					ans = arr[j];
					break;
				}
				else {
					ans = -1;
				}
			}
			arr[i] = ans;
			if(ans == -1) {
				arr[i] = ans;
			}
			
		} 
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
