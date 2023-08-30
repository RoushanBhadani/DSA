package in.Examnation;

import java.util.Scanner;

public class Acecnture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		if(num<100) {
			System.out.println(0);
			return;
		}
		for(int i=0;i<num;i++) {
			if(i==248 || i==284 || i==428 || i== 482 || i==824 || i==842) {
				count++;
			}
		}
		System.out.println(count);
			
	}

}
