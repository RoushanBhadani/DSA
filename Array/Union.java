package in.Array;

public class Union {
	public static int union(int a[],int b[]) {
		int count =0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    count++;
                }
            }
        }
        if(count == b.length){
            count = a.length;
        }else{
            int carry = b.length - count;
            count = carry+a.length;
        }
        return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3};
		int b[] = {4,6,7,1,2};
		System.out.println(union(a,b));
	}

}
