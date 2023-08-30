package in.advanceSorting;

public class QuickSort {
	
	public static void quickSort(int arr[],int si,int ei) {
		if(si>=ei) {
			return;
		}
		int pidx = partition(arr,si,ei);
		quickSort(arr,si,pidx-1);
		quickSort(arr,pidx+1,ei);
	}
	
	public static int partition(int arr[],int si,int ei) {
		int pivot = arr[ei]; // choose pivot element 
		int i = si-1; // for making space which is less than pivot element.
		
		for(int j = si;j<ei;j++) {
			if(arr[j]<pivot) {
				i++;
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		i++;
		int temp = pivot;
		arr[ei] = arr[i];
		arr[i] = temp;
		return i;
	}
	
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {6,17,5,2,8,1,-2,12};
		quickSort(arr,0,arr.length-1);
		printArray(arr);
	}

}
