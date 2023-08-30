package in.Array;

public class jump {
	public static int jump(int nums[]) {
		for(int i=1;i<nums.length;i++) {
			nums[i] = Math.max(nums[i]+1,nums[i-1]);		
		}
		int index = 0;
		int ans = 0;
		while(index<nums.length - 1) {
			ans++;
			index = nums[index];
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {2,3,0,1,4,2,4,6,8,9};
		int output = jump(nums);
		System.out.println(output);
	}

}
