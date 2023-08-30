package in.Examnation;

public class Score {
	
	public static String cal(int score[]) {
		
		int sum =0;
		for(int i=0;i<score.length;i++) {
			sum = sum + score[i];
		}
		double total = sum /(score.length-1);
		
		if(total >= 90) {
			return "S";
		}else if(total >=80) {
			return "A";
		}else if(total >=70) {
			return "B";
		}else if(total >=60) {
			return "C";
		}else if(total>=40){
			return "D";
		}else {
			return "E";
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[] = {40,95,40,60,75};
		String grade = cal(score);
		System.out.println(grade);
	}

}
