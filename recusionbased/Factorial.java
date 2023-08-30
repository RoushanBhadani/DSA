package in.recusionbased;

public class Factorial {
	public static int fact(int n) {
		if(n==0) {
			return 1;
		}
		int ans = n * fact(n-1);   //recursive calling
		return ans;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		System.out.println(fact(n));
	}

}
