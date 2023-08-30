package in.specialQuestion;
import java.util.*;
public class WateringFlower {

	public static void WateringFlower(int arr[],int wq) {
		int step = 0;
		int store = wq;
		if(arr[0]<=wq) {
			for(int i=0;i<arr.length;i++) {
				if(arr[i]<=wq) {
					wq = wq - arr[i];
					step++;
				}else {
					wq = store;
					step++;
					continue;
				}
			}
			System.out.print(step);
		}else {
			System.out.print("none");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = {3,2,5};
		int wq = sc.nextInt();
		WateringFlower(arr,wq);
	}
}
