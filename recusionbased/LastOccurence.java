package in.recusionbased;

public class LastOccurence {
	public static int lastocc(int arr[],int key,int i) {
		if(i==arr.length) {
			return -1;
		}
		int isFound = lastocc(arr,key,i+1);
		if(isFound == -1 && arr[i] == key) {
			return i;
		}
		return isFound;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,1,3,4,3,6,4};
		int key = 4;
		System.out.println(lastocc(arr,key,0));
	}
}
