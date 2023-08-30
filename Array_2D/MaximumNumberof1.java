package in.Array_2D;

public class MaximumNumberof1 {
		public static int rowWithMax1s(int arr[][], int n, int m) {
	        // code here
	        int startrow = 0;
	        int startcol = 0;
	        int count1 = 0;
	        int count2 = 0;
	        int max = 0;
	        for(int i=startcol;i<=arr.length;i++){
	            if(arr[startrow][i] == 1){
	                count1++;
	            }
	        }
	        
	        for(int i=startcol;i<=arr.length;i++){
	            if(arr[startrow+1][i] == 1){
	                count2++;
	            }
	        }
	        
	        if(count1>=count2) {
	        	max = count1;
	        }else {
	        	max = count2;
	        }
	        return max;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{1,1,0,1},{1,1,1,1},{9,10,11,12}};
		System.out.println(rowWithMax1s(arr,4,4));
	}
}
