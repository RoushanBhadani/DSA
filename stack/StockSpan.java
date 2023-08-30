package in.stack;
import java.util.*;
public class StockSpan {
	public static void stockSpan(int stock[], int span[]) {
		Stack<Integer> s = new Stack<>();
		span[0] = 1;
		s.push(0);
		for(int i=1;i<stock.length;i++) {
			int curr = stock[i];
			while(!s.isEmpty() && curr>stock[s.peek()]) {
				s.pop();
			}
			if(s.isEmpty()) {
				span[i] = i+1;
			}
			else {
				int prevHigh = s.peek();
				span[i] = i-prevHigh;
			}
			s.push(i);
		}
		System.out.println(s.peek());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int stock[] = {100,80,60,70,60,75,85};
		int span[] = new int[stock.length];
		stockSpan(stock,span);
		for(int i=0;i<span.length;i++) {
			System.out.print(span[i]+" ");
		}
	}

}
