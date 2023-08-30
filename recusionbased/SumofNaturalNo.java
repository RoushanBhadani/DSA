package in.recusionbased;

public class SumofNaturalNo {
	public static int sum(int n) {
		if(n==1) {
			return 1;
		}
		int s = n + sum(n-1);
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(sum(n));
	}

}
