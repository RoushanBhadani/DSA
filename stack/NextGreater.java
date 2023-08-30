package in.stack;
import java.util.*;
public class NextGreater {
	public static int[] nextGreater(int arr[],int nxtGreater[]) {
		Stack<Integer> s = new Stack<>();
		
		
		for(int i=arr.length-1;i>=0;i--) {
			
			while(!s.isEmpty() && arr[i]>arr[s.peek()]) {
				s.pop();
			}
			if(s.isEmpty()) {
				nxtGreater[i] = -1;
			}else {
				nxtGreater[i] = arr[s.peek()];
			}
			s.push(i);
		}
		return nxtGreater;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {6,8,0,1,3};
		int nxtGreater[] = new int[arr.length];
		nextGreater(arr,nxtGreater);
		for(int i=0;i<nxtGreater.length;i++) {
			System.out.print(nxtGreater[i]+" ");
		}
	}

}
