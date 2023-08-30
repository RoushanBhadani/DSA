package in.stack;
import java.util.Stack;
public class MaxAreaInHistogram {
	public static void maxArea(int height[]) {
		int maxArea = 0;
		int nsl[] = new int[height.length];
		int nsr[] = new int[height.length];
		
		//next smallest right
		Stack<Integer> s = new Stack<>();
		for(int i=height.length-1;i>=0;i--) {
			while(!s.isEmpty() && height[s.peek()]>height[i]) {
				s.pop();
			}
			if(s.isEmpty()) {
				nsr[i] = height.length;
			}else {
				nsr[i] = s.peek();
			}
			s.push(i);
		}
		
		
		//next smallest left
		s = new Stack<>();
		
		for(int i=0;i<height.length;i++) {
			while(!s.isEmpty() && height[s.peek()]>height[i]) {
				s.pop();
			}
			if(s.isEmpty()) {
				nsl[i] = -1;
			}else {
				nsl[i] = s.peek();
			}
			s.push(i);
		}
		
		//find maximum height
		for(int i=0;i<height.length;i++) {
			int length = height[i];
			int width = nsr[i]-nsl[i]-1;
			int area = length * width;
			maxArea = Math.max(area,maxArea);
		}
		System.out.println("Maximum area in histogram is : "+maxArea);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int height[] = {2,1,5,6,2,3};
		maxArea(height);
	}

}
