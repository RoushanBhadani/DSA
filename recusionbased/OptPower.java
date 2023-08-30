package in.recusionbased;

public class OptPower {	
	public static int optPower(int x,int n) {
		if(n==1) {
			return x;
		}
		int halfsq = optPower(x,n/2);
		int fullsq = halfsq * halfsq;
		if(n%2 != 0) {
			fullsq = x * fullsq;
		}
		return fullsq;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 2;
		int n = 3;
		System.out.println(optPower(x,n));
	}

}
