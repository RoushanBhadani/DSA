package in.Array;

public class SearchRotatedArray {
	public static int searchrotatedarray(int arr[],int tar,int si,int ei){
		if(si>ei) {
			return -1;
		}
		
		//kaam
		int mid  = si+(ei-si)/2;
		
		if(arr[mid] == tar) {
			return mid;
		}
		
		//mid on L1
		if(arr[si]<=arr[mid]) {
			//case a: LEFT
			if(arr[si]<=tar && tar<=arr[mid]) {
				return searchrotatedarray(arr,tar,si,mid-1);
			}
			//case b: RIGHT
			else {
				return searchrotatedarray(arr,tar,mid+1,ei);
			}
		}
		
		//mid on L2
		else {
			//case c:RIGHT
			if(arr[mid]<=tar && tar<=arr[ei]) {
				return searchrotatedarray(arr,tar,mid+1,ei);
			}
			//case d:LEFT
			else {
				return searchrotatedarray(arr,tar,si,mid-1);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,5,6,7,0,1,2};
		int tar = 6;
		int index = searchrotatedarray(arr,tar,0,arr.length-1);
		System.out.println(index);
	}

}
