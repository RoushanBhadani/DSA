package in.BasicQuestion;

public class PrimeNumber {
	public static boolean isPrime(int n) {
		boolean isPrimeno = true;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 232;
		System.out.println(isPrime(n));
	}
}
