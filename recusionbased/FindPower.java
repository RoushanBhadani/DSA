package in.recusionbased;

public class FindPower {
	public static int power(int x,int n) {
		if(n==1) {
			return x;
		}
		int power = x * power(x,n-1);
		return power;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5;
		int n=3;
		System.out.println(power(x,n));
	}

}
