package in.Array;

public class MoveAllNegativeElement {
	public static void moveElement(int arr[]) {
		int arr2[] = new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                arr2[j]=arr[i];
                j++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                arr2[j]=arr[i];
                j++;
            }
        }
        for(int i=0;i<arr.length;i++) {
        	arr[i]=arr2[i];
        }
	}
	public static void printArr(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,-1,3,2,-7,-5,11,6};
		moveElement(arr);
		printArr(arr);
	}

}
