package in.recusionbased;

public class FirstOccurence {
	public static int firstOcc(int arr[],int key,int i) {
		if(i==arr.length) {
			return -1;
		}
		if(arr[i]==key) {
			return i;
		}
		return firstOcc(arr,key,i+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,1,4,9,2,4,5};
		int key = 4;
		System.out.println(firstOcc(arr,key,0));
	}
}
