package in.BasicQuestion;

public class NcR {
	public static int fact(int n) {
		int multi = 1;
		for(int i=1;i<=n;i++) {
			multi = i * multi;
		}
		return multi;
	}
	public static void ncr(int n,int r) {
		int nfact = fact(n);
		int rfact = fact(r);
		int nmrfact = fact(n-r);
		int answer = nfact/(nmrfact * rfact);
		System.out.println(answer);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int r = 3;
		ncr(n,r);
	}

}
