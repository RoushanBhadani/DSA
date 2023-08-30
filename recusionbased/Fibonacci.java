package in.recusionbased;

public class Fibonacci {
	public static int fibo(int n) {
		if(n==0 || n==1) {
			return n;
		}
		int fib = fibo(n-1) + fibo(n-2);
		return fib;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		System.out.println(fibo(n));
	}

}
