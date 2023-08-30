package in.recusionbased;

public class PrintDec {
	public static void printdec(int n) {
		if(n==1) {
			System.out.println(n);
			return;
		}
		System.out.println(n+" ");
		printdec(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		printdec(n);
	}
}
